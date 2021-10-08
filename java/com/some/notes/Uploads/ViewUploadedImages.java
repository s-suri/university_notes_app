package com.some.notes.Uploads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.github.chrisbanes.photoview.PhotoView;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.some.notes.R;
import com.some.notes.WebItems;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ViewUploadedImages extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CommentAdapter commentAdapter;
    private List<WebItems> commentList;
    private String id,subject_name;
    private String userid,messageId;
    ImageView dataupload;
    TextView title,up,images_reload;
    RelativeLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_images_upload);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Intent intent;
        intent = getIntent();
        userid = intent.getStringExtra("university_name");
        messageId = intent.getStringExtra("messageId");
        subject_name = intent.getStringExtra("subject_name");


        id = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);


        title = findViewById(R.id.title);
        up = findViewById(R.id.up);
        relativeLayout = findViewById(R.id.relative);


        title.setText(subject_name);

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setVisibility(View.GONE);
            }
        });

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        commentList = new ArrayList<>();

        commentAdapter = new CommentAdapter(this, commentList);
        recyclerView.setAdapter(commentAdapter);


        dataupload = findViewById(R.id.dataUpload);
        dataupload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewUploadedImages.this,PdfImageUpload.class);
                intent.putExtra("university_name",userid);
                intent.putExtra("messageId",messageId);
                intent.putExtra("subjectName",subject_name);
                startActivity(intent);
            }
        });

        readComments();


    }

    private void readComments(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Pdfs").child(userid).child("suggestion").child(messageId).child("Images");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                commentList.clear();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()){
                    WebItems comment = snapshot.getValue(WebItems.class);
                    commentList.add(comment);
                }
                commentAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ImageViewHolder> {
        private Context mContext;
        private List<WebItems> mComment;
        private String postid;
        private LayoutInflater inflater;
        private FirebaseUser firebaseUser;

        public CommentAdapter(Context context, List<WebItems> comments){
            mContext = context;
            mComment = comments;
        }

        @NonNull
        @Override
        public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pur_pdf_images, parent, false);
            return new ImageViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull final ImageViewHolder holder, final int position)
        {
            WebItems model = mComment.get(position);

            Picasso.get().load(model.getPostimage()).into(holder.image);

            holder.img_position.setText(String.valueOf(position+1));


            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(ViewUploadedImages.this);
                    builder.setTitle("Choose option");
                    builder.setMessage("Delete Account... ?");
                    builder.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.setNeutralButton("Delete Image", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();


                        }
                    });
                    builder.setNegativeButton("Everyone", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.create().show();


                    return true;
                }
            });
        }
        @Override
        public int getItemCount()
        {
            return mComment.size();
        }

        public class ImageViewHolder extends RecyclerView.ViewHolder {
            public PhotoView image;
            private TextView img_position;
            public ImageViewHolder(View itemView) {
                super(itemView);
                image = itemView.findViewById(R.id.pur_image_view);
                img_position= itemView.findViewById(R.id.img_position);
            }
        }
    }

}
