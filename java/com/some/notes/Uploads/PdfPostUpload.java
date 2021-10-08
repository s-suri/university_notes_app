package com.some.notes.Uploads;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.some.notes.R;
import com.some.notes.sillicompresser.SiliCompressor;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class PdfPostUpload extends AppCompatActivity {

    String names[] = {};
    String courseName[] = {"BTECH","BE","BSC","BSC(HONC)","MSE","ME","MTECH","BCOM","BA","MBA",
            "BA","BA(HONC)","BBA","BCOM","BA LLB","BBA LLB ","BCOM LLB","BCA"};
    String universityName[] = {"rajdeep varma"};
    String semesterName[] = {"FIRST SEM","SECOND SEM","THIRD SEM","FORTH SEM","FIFTH SEM"
            ,"SIXTH SEM","SEVENTH SEM","EIGHT SEM"};
    String branchName[] = {"CSE","ECE","EEE","ME","ITE","CE","CE","AE","AE","ME","BE","Bsc IT","bSC CS"
            ,"Bsc Nur","General","Economics","Political Science","Sociology","DS","Internet of Things","AI"
            ,"Chemistry","Forensic Sciences","Mathematics","Physics","General","Family Business and Enterpreneurship"};
    String testName[] = {"FIRST TEST","SECOND TEST","THIRD TEST","FOURTH TEST","FIFTH TEST"
            ,"SIXTH TEST"};
    String typeName[] = {"web_pdf","free"};
    Uri compressUri = null;

    private static final int CHOOSE_IMAGE = 1;
    private TextView btnUploadImage;
    private TextView viewGallery,chooseImage;
    private ImageView imgPreview;
    private EditText imgUpi_id,upi_holder_name,amount;

    AutoCompleteTextView imgUniversityName,imgCourseName,imgSemesterName,imgBranchName,imgTestName,imgSubjectName,postType;
    private ProgressBar uploadProgress;

    private String cheker = "", myUrl = "", saveCurrentTime, saveCurrentDate,userid;
    private Uri fileUri;
    private StorageTask uploadTask;
    private ProgressDialog loadingBar;



    FirebaseUser fuser;
    DatabaseReference RootRef,reff;

    private StorageReference mStorageRef;
    private DatabaseReference mDatabaseRef;

    private StorageTask mUploadTask;

    Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_post_upload);


        Intent intent;
        intent = getIntent();
        userid = intent.getStringExtra("university_name");


        fuser = FirebaseAuth.getInstance().getCurrentUser();
        reff = FirebaseDatabase.getInstance().getReference("Users");


        if (Build.VERSION.SDK_INT>=21){
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.blue_300));
        }

        loadingBar = new ProgressDialog(this);

        uploadProgress = findViewById(R.id.uploadProgress);
        chooseImage = findViewById(R.id.chooseImage);
        btnUploadImage = findViewById(R.id.btnUploadImage);

        viewGallery = findViewById(R.id.viewGallery);

        imgUpi_id = findViewById(R.id.imgPayment_id);
        imgUniversityName = findViewById(R.id.imgUniversityName);
        imgCourseName = findViewById(R.id.imgCourseName);
        imgBranchName = findViewById(R.id.imgBranch);
        imgTestName = findViewById(R.id.imgTest);
        imgSubjectName =findViewById(R.id.imgSubject);
        imgSemesterName = findViewById(R.id.imgSemesterName);
        upi_holder_name = findViewById(R.id.imgUpiHoldername);
        amount = findViewById(R.id.amount);
        postType = findViewById(R.id.postType);


        imgUniversityName.setText(userid);



        postType.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, typeName));
        postType.setThreshold(1);


        imgUniversityName.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, universityName));
        imgUniversityName.setThreshold(1);

        imgCourseName.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, courseName));
        imgCourseName.setThreshold(1);

        imgBranchName.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, branchName));
        imgBranchName.setThreshold(1);

        imgTestName.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, testName));
        imgTestName.setThreshold(1);

        imgSemesterName.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, semesterName));
        imgSemesterName.setThreshold(1);




        imgPreview = findViewById(R.id.imgPreview);

        mStorageRef = FirebaseStorage.getInstance().getReference("uploads");
        mDatabaseRef = FirebaseDatabase.getInstance().getReference("uploads");

        /*
        viewGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PdfDataUpload.this, MainActivityInstagram.class);
                startActivity(intent);
            }
        });
         */

        btnUploadImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (fileUri != null) {
                        new ImageCompressionAsyncTask(PdfPostUpload.this).execute(fileUri.toString(),
                                Environment.getExternalStorageDirectory() + "/Study Chats/images");
                    }
                    else
                    {
                        Toast.makeText(PdfPostUpload.this, "please add image...", Toast.LENGTH_SHORT).show();
                    }



                if (mUploadTask != null && mUploadTask.isInProgress()) {
                    Toast.makeText(PdfPostUpload.this, "Upload in progress", Toast.LENGTH_LONG).show();
                } else {

                }
            }
        });

        chooseImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(intent.createChooser(intent, "Select PDF"), 438);


            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 438 && resultCode == RESULT_OK && data != null && data.getData() != null) {
            fileUri = data.getData();
            Picasso.get().load(fileUri).into(imgPreview);
        }
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
                loadingBar.setMessage("Please wait, your profile image is updating...");
                loadingBar.setCanceledOnTouchOutside(false);
                loadingBar.show();

                String web_payment_id = imgUpi_id.getText().toString();
                String web_University = imgUniversityName.getText().toString();
                String web_Course = imgCourseName.getText().toString();
                String web_branch = imgBranchName.getText().toString();
                String web_test = imgTestName.getText().toString();
                String web_subject = imgSubjectName.getText().toString();
                String web_semester = imgSemesterName.getText().toString();
                String web_upiHolderName = upi_holder_name.getText().toString();
                String web_amount = amount.getText().toString();
                String post_type = postType.getText().toString();

                if (TextUtils.isEmpty(web_Course))
                {
                    Toast.makeText(PdfPostUpload.this, "add_Course", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(post_type))
                {
                    Toast.makeText(PdfPostUpload.this, "add_branch", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(web_branch))
                {
                    Toast.makeText(PdfPostUpload.this, "add_branch", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(web_test))
                {
                    Toast.makeText(PdfPostUpload.this, "add_test", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(web_subject))
                {
                    Toast.makeText(PdfPostUpload.this, "add_subject", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(web_semester))
                {
                    Toast.makeText(PdfPostUpload.this, "add_semester", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(web_amount))
                {
                    Toast.makeText(PdfPostUpload.this, "add_amount", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    uploadPdf("edurathore1999@okhdfcbank",userid,web_Course,web_branch,web_test,web_subject,web_semester,"surender kumar",web_amount,compressUri,post_type);
                }
            }
        }
    }

    private  void uploadPdf(String payment_id, String university, String course, String branch, String testName, String subject, String semester, String holderName, String rupay,Uri uri,String type) {
        if (uri != null) {

            btnUploadImage.setVisibility(View.GONE);

                RootRef = FirebaseDatabase.getInstance().getReference().child("Pdfs").child(university);
                StorageReference storageReference = FirebaseStorage.getInstance().getReference().child("Image Files");



                final String messagePushID = RootRef.push().getKey();

                final StorageReference filePath = storageReference.child(messagePushID + "." + "jpg");
                uploadTask = filePath.putFile(uri);
                uploadTask.continueWithTask(new Continuation() {
                    @Override
                    public Object then(@NonNull Task task) throws Exception {


                        if (!task.isSuccessful()) {
                            throw task.getException();


                        }
                        return filePath.getDownloadUrl();
                    }
                }).addOnCompleteListener(new OnCompleteListener<Uri>() {
                    @Override
                    public void onComplete(@NonNull Task<Uri> task) {
                        if (task.isSuccessful()) {

                            Uri downloadUrl = task.getResult();
                            myUrl = downloadUrl.toString();

                            Calendar calForDate = Calendar.getInstance();
                            SimpleDateFormat currendateFormat = new SimpleDateFormat("MMM dd yyyy");
                            saveCurrentDate = currendateFormat.format(calForDate.getTime());


                            Calendar calForTime = Calendar.getInstance();
                            SimpleDateFormat currenTimeFormat = new SimpleDateFormat("hh:mm a");
                            saveCurrentTime = currenTimeFormat.format(calForTime.getTime());


                            HashMap<String, Object> groupMessageKey = new HashMap<>();
                            RootRef.updateChildren(groupMessageKey);


                            Map messageTextBody = new HashMap();

                            messageTextBody.put("message", myUrl);
                            messageTextBody.put("url", myUrl);
                            messageTextBody.put("paymentId",payment_id);
                            messageTextBody.put("search",course.toLowerCase()+" " +semester.toLowerCase()+" " +branch.toLowerCase()+" "+subject.toLowerCase()+ " "+
                                            course.toLowerCase()+" "+subject.toLowerCase()+" " +semester.toLowerCase()+" " +branch.toLowerCase()+" "+
                                            course.toLowerCase()+" " +branch.toLowerCase()+" "+subject.toLowerCase()+" " +semester.toLowerCase()+" "+
                                            semester.toLowerCase()+" " +branch.toLowerCase()+" "+subject.toLowerCase()+" "+course.toLowerCase()+" "+
                                            semester.toLowerCase()+" "+course.toLowerCase()+" " +branch.toLowerCase()+" "+subject.toLowerCase()+" "+
                                            semester.toLowerCase()+" "+subject.toLowerCase()+" "+course.toLowerCase()+" " +branch.toLowerCase()+" "+
                                            branch.toLowerCase()+" " +semester.toLowerCase()+" "+subject.toLowerCase()+" "+course.toLowerCase()+" "+
                                            branch.toLowerCase()+" "+course.toLowerCase()+" " +semester.toLowerCase()+" "+subject.toLowerCase()+" "+
                                            branch.toLowerCase()+" "+subject.toLowerCase()+" "+course.toLowerCase()+" " +semester.toLowerCase()+" "+
                                            subject.toLowerCase()+" "+course.toLowerCase()+" " +semester.toLowerCase()+" "+branch.toLowerCase()+" "+
                                            subject.toLowerCase()+" "+branch.toLowerCase()+" "+course.toLowerCase()+" " +semester.toLowerCase()+" "+
                                            branch.toLowerCase()+" " +semester.toLowerCase()+" "+subject.toLowerCase()+" "+course.toLowerCase()

                                    );
                            messageTextBody.put("title",course+" "+semester+" "+branch+" "+subject+" "+subject+" "+testName);
                            messageTextBody.put("universityName",university);
                            messageTextBody.put("courseName",course);
                            messageTextBody.put("branchName",branch);
                            messageTextBody.put("semesterName",semester);
                            messageTextBody.put("subjectName",subject);
                            messageTextBody.put("testName",testName);
                            messageTextBody.put("sender", fuser.getUid());
                            messageTextBody.put("messageID", messagePushID);
                            messageTextBody.put("mainId", messagePushID);
                            messageTextBody.put("time", saveCurrentTime);
                            messageTextBody.put("date", saveCurrentDate);
                            messageTextBody.put("upiHolderName",holderName);
                            messageTextBody.put("location","pdf");
                            messageTextBody.put("type", type);
                            messageTextBody.put("amount", rupay);

                            RootRef.child("suggestion").child(messagePushID).updateChildren(messageTextBody)
                                    .addOnCompleteListener(new OnCompleteListener() {
                                        @Override
                                        public void onComplete(@NonNull Task task) {
                                            loadingBar.dismiss();

                                            Toast.makeText(PdfPostUpload.this, "upload successfully...", Toast.LENGTH_SHORT).show();
                                        }
                                    });
                        }
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                        Toast.makeText(PdfPostUpload.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });

        }
    }

}