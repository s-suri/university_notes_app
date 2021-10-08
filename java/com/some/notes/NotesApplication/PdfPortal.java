package com.some.notes.NotesApplication;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.some.notes.MainActivity;
import com.some.notes.Model.DownloadModel;
import com.some.notes.R;
import com.some.notes.WebItems;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class PdfPortal extends AppCompatActivity {
    EditText search_users;
    TextView university_nameportal,cart;
    DatabaseReference UsersRef;
    private RecyclerView FindFreindrecyclerList,suggetionitems;
    private String userid,id,email;

    ProgressBar progress_circular;
    Window window;
    PdfPortalAdapter pdfPortalAdapter;
    ArrayList<WebItems> mChats;
    int purchasedNotesInt = 0;
    List<DownloadModel> downloadModels=new ArrayList<>();
    Realm realm;
    boolean seen_pdf_portal = false;
    DatabaseReference reference,view_pdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_portal);
        realm = Realm.getDefaultInstance();


        Intent intent;
        intent = getIntent();
        userid = intent.getStringExtra("university_name");
        email = intent.getStringExtra("name");

        seen_pdf_portal = true;

        id = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);


        mChats = new ArrayList<>();
        progress_circular = findViewById(R.id.progress_circular);
        cart = findViewById(R.id.cart);


        university_nameportal = findViewById(R.id.university_name_portal);
        university_nameportal.setText(userid + " Pdfs");

        UsersRef = FirebaseDatabase.getInstance().getReference("Pdfs").child(userid);
        FindFreindrecyclerList = (RecyclerView) findViewById(R.id.recycler_portal);


        suggetionitems = findViewById(R.id.recycler_suggetion_portal);
        suggetionitems.setLayoutManager(new LinearLayoutManager(this));

        pdfPortalAdapter = new PdfPortalAdapter(this,mChats);
        suggetionitems.setAdapter(pdfPortalAdapter);


        if (Build.VERSION.SDK_INT>=21){
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.blue_300));

        }

        search_users = findViewById(R.id.search_users);
        search_users.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if (charSequence.toString().trim().length() == 0) {
                    suggetionitems.setVisibility(View.VISIBLE);
                    readNotifications();
                    pdfPortalAdapter.notifyDataSetChanged();

                } else {
                    suggetionitems.setVisibility(View.VISIBLE);

                    ArrayList<WebItems> newList = new ArrayList<>();
                    for (WebItems beneficiary : mChats) {
                        String name = beneficiary.getSearch().toLowerCase();
                        if (name.contains(charSequence.toString().toLowerCase())) {
                            newList.add(beneficiary);
                        }
                    }
                    pdfPortalAdapter.setFilter(newList);
                    pdfPortalAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(PdfPortal.this);
                        builder.setTitle("Choose option");
                        builder.setMessage("Reload Purchased Notes... ?");
                        builder.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                        builder.setNeutralButton("Reload...", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                realm.executeTransaction(new Realm.Transaction() {
                                    @Override
                                    public void execute(Realm realm) {
                                RealmResults<DownloadModel> delete = realm.where(DownloadModel.class).equalTo("type",id).findAll();
                                delete.deleteAllFromRealm();
                                addAllPurchasedNotes();

                                    }
                                });

                            }
                        });
                        builder.setNegativeButton("", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();

                            }
                        });
                        builder.create().show();
            }
        });

        if (seen_pdf_portal)
        {
            readNotifications();
            addPurchasedNotes();
        }
        else
        {

        }

        }

    private void readNotifications(){
        UsersRef.child("suggestion").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot)
            {
               mChats.clear();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()){
                    WebItems notification = snapshot.getValue(WebItems.class);
                    mChats.add(notification);
                }
                Collections.reverse(mChats);
                pdfPortalAdapter.notifyDataSetChanged();
                progress_circular.setVisibility(View.GONE);
            }

            @Override
            public void onCancelled(DatabaseError databaseError)
            {
            }
        });
    }

    private void addPurchasedNotes(){
        if (seen_pdf_portal)
        {
            DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Pdfs").child(userid).child("suggestion");
            reference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {

                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                        if (snapshot.child(id).exists()) {

                            if (snapshot.child(id + "download").exists()) {
                            } else {
                                String messageID = snapshot.child("messageID").getValue().toString();
                                String universityName = snapshot.child("universityName").getValue().toString();
                                String courseName = snapshot.child("courseName").getValue().toString();
                                String branchName = snapshot.child("branchName").getValue().toString();
                                String testName = snapshot.child("testName").getValue().toString();
                                String semesterName = snapshot.child("semesterName").getValue().toString();
                                String subjectName = snapshot.child("subjectName").getValue().toString();
                                String url = snapshot.child("url").getValue().toString();


                                // universityName = message;
                                // courseName  = sender;
                                // branchName = reciever;
                                // messageID  = messageID;
                                // testName  = bio;
                                // type = id;
                                // semesterName = time;
                                // subjectName = date;
                                //imageUrl = url;


                                if (purchasedNotesInt == 0) {
                                    purchasedNotesInt++;
                                    addText(universityName, courseName, branchName, messageID, testName, id, semesterName, subjectName, "hello", "hello", id, url);
                                } else {
                                }
                            }
                        } else {
                        }
                    }
                }


                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }
    }

    private void addAllPurchasedNotes(){

        if (seen_pdf_portal)
        {
            DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Pdfs").child(userid).child("suggestion");
            reference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {

                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                        if (snapshot.child(id).exists()) {
                            String messageID = snapshot.child("messageID").getValue().toString();
                            String universityName = snapshot.child("universityName").getValue().toString();
                            String courseName = snapshot.child("courseName").getValue().toString();
                            String branchName = snapshot.child("branchName").getValue().toString();
                            String testName = snapshot.child("testName").getValue().toString();
                            String semesterName = snapshot.child("semesterName").getValue().toString();
                            String subjectName = snapshot.child("subjectName").getValue().toString();
                            String url = snapshot.child("url").getValue().toString();

                            // universityName = messageId;
                            // courseName  = sender;
                            // branchName = reciever;
                            // messageID  = messageID;
                            // testName  = bio;
                            // type = id;
                            // semesterName = time;
                            // subjectName = date;
                            // imageUrl = url;

                            addText(universityName, courseName, branchName, messageID, testName, id, semesterName, subjectName, "hello", "hello", id, url);

                        }
                        else {
                        }
                    }
                }


                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }
        else
        {
        }
    }

    public  class PdfPortalAdapter extends RecyclerView.Adapter<PdfPortalAdapter.PdfHolder> {
        List<WebItems> mChats;
        String retImage;
        Context context;

        public PdfPortalAdapter(Context context, List<WebItems> mChats) {
            this.mChats = mChats;
            this.context = context;
        }

        @NonNull
        @Override
        public PdfHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_pdf_portal, viewGroup, false);
            return new PdfHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull final PdfHolder holder, int position) {
            final WebItems model = mChats.get(position);

            holder.portal_course_name.setText(model.getCourseName());
            holder.portal_semester_name.setText(model.getSemesterName());
            holder.portal_subject_name.setText(model.getSubjectName());
            holder.portal_test_name.setText(model.getTestName());
            holder.poratl_branch_name.setText(model.getBranchName());

            if (model.getType().equals("free"))
            {
                holder.download_free_pdf.setVisibility(View.VISIBLE);
                holder.portal_download_pdf.setVisibility(View.GONE);
            }
            else
            {
                holder.download_free_pdf.setVisibility(View.GONE);
                holder.portal_download_pdf.setVisibility(View.VISIBLE);
            }

            Picasso.get().load(model.getUrl()).into(holder.portal_image);

            holder.portal_download_pdf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    seen_pdf_portal = false;
                    Intent intent = new Intent(holder.itemView.getContext(),PdfTransaction.class);
                    intent.putExtra("user_id",model.getSender());
                    intent.putExtra("download_id",model.getUrl());
                    intent.putExtra("payment_id",model.getPaymentId());
                    intent.putExtra("PaymentHolderName",model.getUpiHolderName());
                    intent.putExtra("amount",model.getAmount());
                    intent.putExtra("messageID",model.getMainId());
                    intent.putExtra("universityName",userid);
                    intent.putExtra("print_message",userid   +"  "+ model.getCourseName()+"  "+ model.getBranchName() +"  "+ model.getSemesterName() + "  " +model.getSubjectName() +"  "+model.getTestName());
                    holder.itemView.getContext().startActivity(intent);
                }
            });

            holder.download_free_pdf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(PdfPortal.this);
                    builder.setTitle("Choose option");
                    builder.setMessage("Download Free Notes... ?");
                    builder.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.setNeutralButton("Download...", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                                    reference = FirebaseDatabase.getInstance().getReference("Users").child(model.getSender()).child("total_rupay");
                                    view_pdf = FirebaseDatabase.getInstance().getReference("Pdfs");


                                    Calendar calForDate2 = Calendar.getInstance();
                                    SimpleDateFormat currendateFormat2 = new SimpleDateFormat("yyyyMMdd");
                                    String saveCurrentDate2 = currendateFormat2.format(calForDate2.getTime());

                                    Calendar calForTime2 = Calendar.getInstance();
                                    SimpleDateFormat currenTimeFormat2 = new SimpleDateFormat("hhmmss");
                                    String saveCurrentTime2 = currenTimeFormat2.format(calForTime2.getTime());

                                    String time= saveCurrentDate2 + saveCurrentTime2;


                            HashMap<String,Object> map = new HashMap<>();

                            map.put(id,"true");

                            view_pdf.child(userid).child("suggestion").child(model.getMainId()).updateChildren(map);


                        }
                    });
                    builder.setNegativeButton("", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.create().show();



                }
            });


            holder.request_pdf_download.setVisibility(View.GONE);
            holder.request_pdf_download.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    seen_pdf_portal = false;
                          }
            });

        }

        @Override
        public int getItemCount() {
            return mChats.size();
        }

        public class PdfHolder extends RecyclerView.ViewHolder {
            TextView portal_course_name, portal_semester_name,portal_subject_name
                    ,poratl_branch_name,portal_test_name;
            Button portal_download_pdf,request_pdf_download,download_free_pdf;
            ImageView portal_image;


            public PdfHolder(@NonNull View itemView) {
                super(itemView);
                portal_course_name = itemView.findViewById(R.id.row_course);
                poratl_branch_name = itemView.findViewById(R.id.row_branch);
                portal_test_name = itemView.findViewById(R.id.row_test);
                portal_subject_name = itemView.findViewById(R.id.row_subject);
                portal_semester_name =itemView.findViewById(R.id.row_semester);
                portal_download_pdf = itemView.findViewById(R.id.download_pdf_portal);
                portal_image = itemView.findViewById(R.id.pdf_image);
                request_pdf_download = itemView.findViewById(R.id.request_pdf_download);
                download_free_pdf = itemView.findViewById(R.id.download_free_pdf);

            }
        }

        public void setFilter(ArrayList<WebItems> newList) {
            mChats = new ArrayList<>();
            mChats.addAll(newList);
            notifyDataSetChanged();
        }

    }

    private void addText(String message, String sender, String receiver, String messageId, String bio, String type, String time, String date, String lastSendMessage, String preMessage, String isseen, String imageurl){
        DatabaseReference databaseRef = FirebaseDatabase.getInstance().getReference("Pdfs").child(userid).child("suggestion");

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(id+"download", true);
        databaseRef.child(messageId).updateChildren(hashMap);


        Number currentnum=realm.where(DownloadModel.class).max("id");
        int nextId;

        if(currentnum==null){
            nextId=1;
        }
        else{
            nextId=currentnum.intValue()+1;
        }
        final DownloadModel downloadModel=new DownloadModel();
        downloadModel.setId(nextId);
        downloadModel.setStatus("Never");
        downloadModel.setTitle("hello");
        downloadModel.setFile_size("0");
        downloadModel.setProgress("0");
        downloadModel.setIs_paused(false);
        downloadModel.setDownloadId(8878);
        downloadModel.setFile_path("");
        downloadModel.setMessage(message);
        downloadModel.setSender(sender);
        downloadModel.setReceiver(receiver);
        downloadModel.setMessageID(messageId);
        downloadModel.setIsseen(isseen);
        downloadModel.setLastSendMessage(lastSendMessage);
        downloadModel.setBio(bio);
        downloadModel.setDate(date);
        downloadModel.setPreMessage(preMessage);
        downloadModel.setTime(time);
        downloadModel.setType(type);
        downloadModel.setImagrUrl(imageurl);
        downloadModel.setUsername("no value");
        downloadModel.setAdminId("no value");

        downloadModels.add(downloadModel);

        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                realm.copyToRealm(downloadModel);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        seen_pdf_portal = false;

        Intent intent = new Intent(PdfPortal.this, MainActivity.class);
        intent.putExtra("name",email);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onPause() {
        super.onPause();
        seen_pdf_portal = false;
    }

    @Override
    protected void onStart() {
        super.onStart();
        seen_pdf_portal = true;
    }

    @Override
    protected void onStop() {
        super.onStop();
        seen_pdf_portal = false;
    }

    @Override
    protected void onResume() {
        super.onResume();
        seen_pdf_portal = true;


    }




}


/*
ca-app-pub-2729927781686503/9030643871

Next, place the ad unit inside your app
Follow these instructions:
Complete the instructions in the Google Mobile Ads SDK guide using this app ID:
Study Chats Notesca-app-pub-2729927781686503~9675842839
Follow the banner implementation guide to integrate the SDK. You'll specify ad type, size, and placement when you integrate the code using this ad unit ID:
chat_1ca-app-pub-2729927781686503/2918862793
Review the AdMob policies to ensure your implementation complies.

 */

