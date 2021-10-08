package com.some.notes.Uploads;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import android.webkit.MimeTypeMap;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.UploadTask;
import com.some.notes.MainActivity;
import com.some.notes.NotesApplication.PdfImages;
import com.some.notes.R;
import com.some.notes.sillicompresser.SiliCompressor;

import java.io.File;
import java.util.HashMap;

public class PdfImageUpload extends AppCompatActivity {
    private Uri mImageUri;
    String miUrlOk = "";
    private StorageTask uploadTask;
    StorageReference storageRef;
    ImageView close, image_added;
    TextView post;
    EditText description;
    Window window;
    FirebaseAuth auth;
    Intent intent;
    String currentUserID,id,universityName,messageId,subject_name;
    Uri compressUri = null;
    private ProgressDialog loadingBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_image_upload);



        intent = getIntent();
        universityName = intent.getStringExtra("university_name");
        messageId = intent.getStringExtra("messageId");
        subject_name = intent.getStringExtra("subjectName");

        loadingBar = new ProgressDialog(this);

        id = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);


        auth = FirebaseAuth.getInstance();
        currentUserID = auth.getCurrentUser().getUid();


        if (Build.VERSION.SDK_INT>=21){
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.White));

        }
        close = findViewById(R.id.close);
        image_added = findViewById(R.id.image_added);
        post = findViewById(R.id.post);
        description = findViewById(R.id.description);

        storageRef = FirebaseStorage.getInstance().getReference("posts");


        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        startActivityForResult(intent.createChooser(intent,"Select Image"),438);


        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PdfImageUpload.this, ViewUploadedImages.class);
                intent.putExtra("subject_name",subject_name);
                intent.putExtra("messageId",messageId);
                intent.putExtra("university_name",universityName);
                startActivity(intent);
                finish();
            }
        });

        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ImageCompressionAsyncTask(PdfImageUpload.this).execute(mImageUri.toString(),
                        Environment.getExternalStorageDirectory() + "/Study Chats/images");

            }
        });

    }



    class ImageCompressionAsyncTask extends AsyncTask<String, Void, String> {
        Context mContext;
        int position;
        int totalItemSelected;

        public ImageCompressionAsyncTask(Context context) {
            mContext = context;
        }

        @Override
        protected String doInBackground(String... params) {
            return SiliCompressor.with(mContext).compress(params[0], new File(params[1]));
        }

        @Override
        protected void onPostExecute(String s) {

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                compressUri = Uri.parse(s);

                Cursor c = getContentResolver().query(compressUri, null, null, null, null);
                c.moveToFirst();
            } else {
                File imageFile = new File(s);
                compressUri = Uri.fromFile(imageFile);
            }
            if (compressUri != null) {
                final ProgressDialog pd = new ProgressDialog(PdfImageUpload.this);
                pd.setMessage("Posting");
                pd.show();
                if (compressUri != null){
                    final StorageReference fileReference = storageRef.child(System.currentTimeMillis()
                            + "." + getFileExtension(mImageUri));

                    uploadTask = fileReference.putFile(compressUri);
                    uploadTask.continueWithTask(new Continuation<UploadTask.TaskSnapshot, Task<Uri>>() {
                        @Override
                        public Task<Uri> then(@NonNull Task<UploadTask.TaskSnapshot> task) throws Exception {
                            if (!task.isSuccessful()) {
                                throw task.getException();
                            }
                            return fileReference.getDownloadUrl();
                        }
                    }).addOnCompleteListener(new OnCompleteListener<Uri>() {
                        @Override
                        public void onComplete(@NonNull Task<Uri> task) {
                            if (task.isSuccessful()) {
                                Uri downloadUri = task.getResult();
                                miUrlOk = downloadUri.toString();

                                DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Pdfs").child(universityName).child("suggestion").child(messageId).child("Images");

                                String postid = reference.push().getKey();

                                HashMap<String, Object> hashMap = new HashMap<>();
                                hashMap.put("sender",currentUserID);
                                hashMap.put("type","image");
                                hashMap.put("postid", postid);
                                hashMap.put("postimage", miUrlOk);
                                hashMap.put("description", description.getText().toString());
                                hashMap.put("publisher", FirebaseAuth.getInstance().getCurrentUser().getUid());

                                reference.child(postid).setValue(hashMap);

                                pd.dismiss();



                            } else {
                                Toast.makeText(PdfImageUpload.this, "Failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(PdfImageUpload.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });

                } else {
                    Toast.makeText(PdfImageUpload.this, "No image selected", Toast.LENGTH_SHORT).show();
                }

            }
        }

    }



    private String getFileExtension(Uri uri){
        ContentResolver cR = getContentResolver();
        MimeTypeMap mime = MimeTypeMap.getSingleton();
        return mime.getExtensionFromMimeType(cR.getType(uri));
    }

    private void uploadImage_10(){
        final ProgressDialog pd = new ProgressDialog(this);
        pd.setMessage("Posting");
        pd.show();
        if (mImageUri != null){
            final StorageReference fileReference = storageRef.child(System.currentTimeMillis()
                    + "." + getFileExtension(mImageUri));

            uploadTask = fileReference.putFile(mImageUri);
            uploadTask.continueWithTask(new Continuation<UploadTask.TaskSnapshot, Task<Uri>>() {
                @Override
                public Task<Uri> then(@NonNull Task<UploadTask.TaskSnapshot> task) throws Exception {
                    if (!task.isSuccessful()) {
                        throw task.getException();
                    }
                    return fileReference.getDownloadUrl();
                }
            }).addOnCompleteListener(new OnCompleteListener<Uri>() {
                @Override
                public void onComplete(@NonNull Task<Uri> task) {
                    if (task.isSuccessful()) {
                        Uri downloadUri = task.getResult();
                        miUrlOk = downloadUri.toString();

                        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Pdfs").child(universityName).child("suggestion").child(messageId).child("Images");

                        String postid = reference.push().getKey();

                        HashMap<String, Object> hashMap = new HashMap<>();
                        hashMap.put("sender",currentUserID);
                        hashMap.put("type","image");
                        hashMap.put("postid", postid);
                        hashMap.put("postimage", miUrlOk);
                        hashMap.put("description", description.getText().toString());
                        hashMap.put("publisher", FirebaseAuth.getInstance().getCurrentUser().getUid());

                        reference.child(postid).setValue(hashMap);

                        pd.dismiss();

                        Intent intent = new Intent(PdfImageUpload.this,PdfImages.class);
                        intent.putExtra("subject_name",subject_name);
                        intent.putExtra("messageId",messageId);
                        intent.putExtra("university_name",universityName);
                        startActivity(intent);

                        finish();

                    } else {
                        Toast.makeText(PdfImageUpload.this, "Failed", Toast.LENGTH_SHORT).show();
                    }
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(PdfImageUpload.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });

        } else {
            Toast.makeText(PdfImageUpload.this, "No image selected", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 438 && resultCode == RESULT_OK && data != null && data.getData() != null) {
             mImageUri = data.getData();

            //      uploadImage_10();
            image_added.setImageURI(mImageUri);
        } else {
            Toast.makeText(this, "Something gone wrong!", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(PdfImageUpload.this, MainActivity.class));
            finish();
        }
    }

}
