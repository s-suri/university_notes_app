package com.some.notes.NotesApplication;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.some.notes.Model.DownloadModel;
import com.some.notes.R;
import com.some.notes.WebItems;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class PurchasedNotesActivity extends AppCompatActivity {
        private RecyclerView recyclerView;
        private CommentAdapter commentAdapter;
        private List<WebItems> commentList;
        private String id;
        private String userid;
        Window window;
        AdView adView;
        Realm realm;
        List<DownloadModel> downloadModels=new ArrayList<>();

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_pdf_viewer);
            realm = Realm.getDefaultInstance();

            id = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);

            if (Build.VERSION.SDK_INT>=21){
                window = this.getWindow();
                window.setStatusBarColor(this.getResources().getColor(R.color.blue_300));
            }


            Intent intent;
            intent = getIntent();
            userid = intent.getStringExtra("name");

        List<DownloadModel> downloadModelsLocal = getAllDownloads();
        if (downloadModelsLocal != null) {
            if (downloadModelsLocal.size() > 0) {
                downloadModels.addAll(downloadModelsLocal);
            }
        }


            recyclerView = findViewById(R.id.recycler_view);
            recyclerView.setHasFixedSize(true);

            LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(mLayoutManager);
            commentList = new ArrayList<>();

            commentAdapter = new CommentAdapter(this, downloadModels);
            recyclerView.setAdapter(commentAdapter);

       //     readComments();

        }

    public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ImageViewHolder> {
        private Context mContext;
        private List<DownloadModel> mComment;
        private String postid;
        private LayoutInflater inflater;
        private FirebaseUser firebaseUser;

        public CommentAdapter(Context context, List<DownloadModel> comments){
            mContext = context;
            mComment = comments;
        }

        @NonNull
        @Override
        public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.purchesed_row, parent, false);
            return new ImageViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull final ImageViewHolder holder, final int position) {
            // universityName = message;
            // courseName  = sender;
            // branchName = reciever;
            // messageID  = messageID;
            // testName  = bio;
            // type = id;
            // semesterName = time;
            // subjectName = date;
            //imageUrl = url;


            final DownloadModel model = downloadModels.get(position);

            holder.portal_course_name.setText(model.getMessage());
            holder.portal_semester_name.setText(model.getTime());
            holder.portal_subject_name.setText(model.getDate());
            holder.portal_test_name.setText(model.getBio());
            holder.poratl_branch_name.setText(model.getReceiver());


            Picasso.get().load(model.getImagrUrl()).into(holder.portal_image);

            holder.images_reload.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(PurchasedNotesActivity.this);
                    builder.setTitle("Choose option");
                    builder.setMessage("Reload Data...?");
                    builder.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.setNeutralButton("reload....", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                            realm.beginTransaction();
                            RealmResults<DownloadModel> reload_model = realm.where(DownloadModel.class).equalTo("type", model.getMessageID()).findAll();
                            reload_model.deleteAllFromRealm();
                            realm.commitTransaction();


                            DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Pdfs").child(model.getMessage()).child("suggestion").child(model.getMessageID()).child("Images");
                            reference.addListenerForSingleValueEvent(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                                        if (snapshot.child(id+"download").exists())
                                        {
                                            String postid = snapshot.child("postid").getValue().toString();

                                            HashMap<String,Object> reload_map = new HashMap<>();
                                            reload_map.put(id+"download",null);
                                            reference.child(postid).updateChildren(reload_map).addOnCompleteListener(new OnCompleteListener<Void>() {
                                                @Override
                                                public void onComplete(@NonNull Task<Void> task) {
                                                    if (task.isSuccessful())
                                                    {
                                                        Toast.makeText(PurchasedNotesActivity.this, "success", Toast.LENGTH_SHORT).show();
                                                    }
                                                }
                                            });
                                        }
                                        else
                                        {
                                            Toast.makeText(PurchasedNotesActivity.this, "no", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError databaseError) {

                                }
                            });

                        }
                    });
                    builder.setNegativeButton("", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    builder.create().show();

                    commentAdapter.notifyDataSetChanged();

                }
            });

            holder.portal_download_pdf.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(PurchasedNotesActivity.this, PdfImages.class);
                        intent.putExtra("university_name",model.getMessage());
                        intent.putExtra("name",userid);
                        intent.putExtra("messageId",model.getMessageID());
                        intent.putExtra("subject_name",model.getDate());
                        intent.putExtra("random","pawan");

                        holder.itemView.getContext().startActivity(intent);

                    }
                });

        }

        @Override
        public int getItemCount() {
            return mComment.size();
        }

        public class ImageViewHolder extends RecyclerView.ViewHolder {

            TextView portal_course_name, portal_semester_name,portal_subject_name,poratl_branch_name,portal_test_name;

            Button portal_download_pdf;
            ImageView portal_image;
            RelativeLayout images_reload;

            public ImageViewHolder(View itemView) {
                super(itemView);
                portal_course_name = itemView.findViewById(R.id.row_course);
                poratl_branch_name = itemView.findViewById(R.id.row_branch);
                portal_test_name = itemView.findViewById(R.id.row_test);
                portal_subject_name = itemView.findViewById(R.id.row_subject);
                portal_semester_name =itemView.findViewById(R.id.row_semester);
                portal_download_pdf = itemView.findViewById(R.id.download_pdf_portal);
                portal_image = itemView.findViewById(R.id.pdf_image);
                images_reload = itemView.findViewById(R.id.images_reload);
    }
        }

    }

    private RealmResults<DownloadModel> getAllDownloads(){
        Realm realm=Realm.getDefaultInstance();
        return realm.where(DownloadModel.class).equalTo("isseen", id).findAll();
    }

}
