package com.some.notes.Uploads;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.some.notes.R;
import com.some.notes.WebItems;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ViewPdfPosts extends AppCompatActivity {
    PdfPortalAdapter pdfPortalAdapter;
    static String university_name;
    DatabaseReference UsersRef;
    private RecyclerView FindFreindrecyclerList,suggetionitems;
    ArrayList<WebItems> mChats;
    TextView university_nameportal;
    ProgressBar progress_circular;
    FirebaseAuth mAuth;
    String currentUserID,userType;
    DatabaseReference uploaderUserInformation;
    TextView dataupload;
    Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pdf_posts);


        mAuth = FirebaseAuth.getInstance();
        currentUserID = mAuth.getCurrentUser().getUid();


        Intent intent;
        intent = getIntent();
        university_name = intent.getStringExtra("university_name");


        mChats = new ArrayList<>();
        progress_circular = findViewById(R.id.progress_circular);


        if (Build.VERSION.SDK_INT>=21){
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.blue_300));
        }

        university_nameportal = findViewById(R.id.university_name_portal);


        uploaderUserInformation = FirebaseDatabase.getInstance().getReference("Users");
        UsersRef = FirebaseDatabase.getInstance().getReference("Pdfs").child(university_name);


        suggetionitems = findViewById(R.id.recycler_suggetion_portal);
        suggetionitems.setLayoutManager(new LinearLayoutManager(this));

        pdfPortalAdapter = new PdfPortalAdapter(this,mChats);
        suggetionitems.setAdapter(pdfPortalAdapter);

        dataupload = findViewById(R.id.dataUpload);

        uploaderUserInformation.child(currentUserID).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if ((dataSnapshot.child("type").exists())  || (dataSnapshot.child("university_name").exists())){
                    userType = dataSnapshot.child("type").getValue().toString();
                    university_name = dataSnapshot.child("university_name").getValue().toString();
                    dataupload.setVisibility(View.VISIBLE);
                    university_nameportal.setText(university_name);

                }
                else {

                    dataupload.setVisibility(View.GONE);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        dataupload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (userType.equals(""))
                {

                }
                else if (userType.equals("pdf_uploader"))
                {
//                    Intent intent = new Intent(ViewPdfPosts.this, PdfDataUpload.class);
//                    intent.putExtra("university_name",university_name);
//                    startActivity(intent);
                }
                else if (userType.equals("url_uploader"))
                {
                    Intent intent = new Intent(ViewPdfPosts.this,UrlUploader.class);
                    startActivity(intent);
                }
                else if (userType.equals("post_uploader"))
                {
                    Intent intent = new Intent(ViewPdfPosts.this,PdfPostUpload.class);
                    intent.putExtra("university_name",university_name);
                    startActivity(intent);
                }
                else if (userType.equals("comp_exam_uploader"))
                {
                    Intent intent = new Intent(ViewPdfPosts.this,CompitionExamDataUpload.class);
                    intent.putExtra("university_name",university_name);
                    startActivity(intent);
                }
                else
                    {
                    Toast.makeText(ViewPdfPosts.this, "Sorry...", Toast.LENGTH_SHORT).show();

                }

            }
        });

        readNotifications();

    }

    private void readNotifications(){
            UsersRef.child("suggestion").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    mChats.clear();
                    for (DataSnapshot snapshot : dataSnapshot.getChildren()){

                        WebItems notification = snapshot.getValue(WebItems.class);
                                mChats.add(notification);

//                        if (snapshot.child("sender").exists()){
//                            if (snapshot.child("sender").equals(currentUserID))
//                            {
//                                WebItems notification = snapshot.getValue(WebItems.class);
//                                mChats.add(notification);
//                            }
//                            else
//                            {
//                            }
//                        }

                    }

                    Collections.reverse(mChats);
                    pdfPortalAdapter.notifyDataSetChanged();
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }


    public class PdfPortalAdapter extends RecyclerView.Adapter<PdfPortalAdapter.PdfHolder> {
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

            WebItems  model = mChats.get(position);


            if (model.getSender().equals(currentUserID))
            {
                holder.portal_course_name.setText(model.getCourseName());
                holder.portal_semester_name.setText(model.getSemesterName());
                holder.portal_subject_name.setText(model.getSubjectName());
                holder.portal_test_name.setText(model.getTestName());
                holder.poratl_branch_name.setText(model.getBranchName());

                Picasso.get().load(model.getUrl()).into(holder.portal_image);

                holder.portal_download_pdf.setText("  VIEW ");

                holder.portal_download_pdf.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(holder.itemView.getContext(), ViewUploadedImages.class);
                        intent.putExtra("university_name",university_name);
                        intent.putExtra("messageId",model.getMainId());
                        intent.putExtra("subject_name",model.getSubjectName());
                        holder.itemView.getContext().startActivity(intent);

                    }
                });
            }

            }


        @Override
        public int getItemCount() {
            return mChats.size();
        }

        public class PdfHolder extends RecyclerView.ViewHolder {
            TextView portal_course_name, portal_semester_name,portal_subject_name,poratl_branch_name,portal_test_name;
            Button portal_download_pdf;
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
            }
        }
    }

    }

