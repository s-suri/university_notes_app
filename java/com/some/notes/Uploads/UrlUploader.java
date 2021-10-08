package com.some.notes.Uploads;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.some.notes.R;

import java.util.HashMap;

public class UrlUploader extends AppCompatActivity {

    EditText url_upload,web_title,web_description,web_hint_1,web_hint2,web_hint_3;

    DatabaseReference reference;

    String currentUserID;
    FirebaseAuth mAuth;

    TextView btn_uploader;
    Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url_uploader);


        if (Build.VERSION.SDK_INT>=21){
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.White));

        }

        mAuth = FirebaseAuth.getInstance();
        currentUserID = mAuth.getCurrentUser().getUid();



        reference = FirebaseDatabase.getInstance().getReference("Weburls");

        url_upload = findViewById(R.id.url_upload);
        web_title = findViewById(R.id.title_uploader);
        web_description = findViewById(R.id.description_uploader);
        web_hint_1 = findViewById(R.id.hint_1);
        web_hint2 = findViewById(R.id.hint_2);
        web_hint_3 = findViewById(R.id.hint_3);

        btn_uploader = findViewById(R.id.btn_uploader);




        btn_uploader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String ret_url_upload = url_upload.getText().toString();
                String ret_url_title = web_title.getText().toString();
                String ret_url_description = web_description.getText().toString();
                String ret_url_hint_1 = web_hint_1.getText().toString();
                String ret_url_hint_2 = web_hint2.getText().toString();
                String ret_url_hint_3 = web_hint_3.getText().toString();



                if (TextUtils.isEmpty(ret_url_upload) || TextUtils.isEmpty(ret_url_title) || TextUtils.isEmpty(ret_url_description) || TextUtils.isEmpty(ret_url_hint_1) || TextUtils.isEmpty(ret_url_hint_2)
                        || TextUtils.isEmpty(ret_url_hint_3)){
                    Toast.makeText(UrlUploader.this, "All fields are required!", Toast.LENGTH_SHORT).show();
                } else {
                    uploadPdf(ret_url_upload,ret_url_title,ret_url_description,ret_url_hint_1,ret_url_hint_2,ret_url_hint_3);

                }

            }
        });


    }

    private void uploadPdf(String url, String title, String description, String hint_1, String hint_2, String hint_3) {

        HashMap<String, Object> hashMap = new HashMap<>();


        String messageid = reference.push().getKey();

        hashMap.put("url",url);
        hashMap.put("title",title);
        hashMap.put("description",description);
        hashMap.put("search",title.toLowerCase());
        hashMap.put("messageId",messageid);
        hashMap.put("type","web_url");


        reference.child(messageid).updateChildren(hashMap).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){

                    HashMap<String, Object> hashMap1 = new HashMap<>();


                    String messageid1 = reference.push().getKey();

                    hashMap1.put("url",url);
                    hashMap1.put("title",title);
                    hashMap1.put("description",description);
                    hashMap1.put("search",hint_1.toLowerCase());
                    hashMap1.put("messageId",messageid1);
                    hashMap1.put("type","web_url");


                    reference.child(messageid1).updateChildren(hashMap1).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()){

                                HashMap<String, Object> hashMap2 = new HashMap<>();


                                String messageid2 = reference.push().getKey();

                                hashMap2.put("url",url);
                                hashMap2.put("title",title);
                                hashMap2.put("description",description);
                                hashMap2.put("search",hint_2.toLowerCase());
                                hashMap2.put("messageId",messageid2);
                                hashMap2.put("type","web_url");


                                reference.child(messageid2).updateChildren(hashMap2).addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                        if (task.isSuccessful()){

                                            HashMap<String, Object> hashMap3 = new HashMap<>();


                                            String messageid3 = reference.push().getKey();

                                            hashMap3.put("url",url);
                                            hashMap3.put("title",title);
                                            hashMap3.put("description",description);
                                            hashMap3.put("search",hint_3.toLowerCase());
                                            hashMap3.put("messageId",messageid3);
                                            hashMap3.put("type","web_url");


                                            reference.child(messageid3).updateChildren(hashMap3).addOnCompleteListener(new OnCompleteListener<Void>() {
                                                @Override
                                                public void onComplete(@NonNull Task<Void> task) {
                                                    if (task.isSuccessful()){

                                                        HashMap<String, Object> hashMap4 = new HashMap<>();


                                                        String messageid4 = reference.push().getKey();

                                                        hashMap4.put("url",url);
                                                        hashMap4.put("title",title);
                                                        hashMap4.put("description",description);
                                                        hashMap4.put("search",hint_3.toLowerCase());
                                                        hashMap4.put("messageId",messageid3);
                                                        hashMap4.put("type","web_url");


                                                        reference.child(messageid4).updateChildren(hashMap4).addOnCompleteListener(new OnCompleteListener<Void>() {
                                                            @Override
                                                            public void onComplete(@NonNull Task<Void> task) {
                                                                if (task.isSuccessful()){

                                                                    Toast.makeText(UrlUploader.this, "upload successfully....", Toast.LENGTH_SHORT).show();

                                                                }
                                                            }
                                                        });


                                                    }
                                                }
                                            });

                                        }
                                    }
                                });

                            }
                        }
                    });

                }
            }
        });


    }
}
