package com.some.notes.NotesApplication;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.some.notes.Model.DownloadModel;
import com.some.notes.Model.Person;
import com.some.notes.R;
import com.some.notes.WebItems;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class PdfImages extends AppCompatActivity {
    private String filter = "";
    private RecyclerView recyclerView,mRecyclerView;
    private CommentAdapter commentAdapter;
    private List<WebItems> commentList;
    private String id;
    private String userid,messageId,subject_name,email;
     public static String random;
    TextView title,up;
    RelativeLayout relativeLayout;
    AdView adView;
    private PersonDBHelper dbHelper;
    List<DownloadModel> downloadModels=new ArrayList<>();
    Realm realm;
    private int reload_int = 0;

    boolean reload_boolean = false;

    int currentItems,totalItems,scrollOutItems;
    LinearLayoutManager mLayoutManager;
    boolean seen_image = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_images);
        realm = Realm.getDefaultInstance();


        adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);

        adView.setAdUnitId("ca-app-pub-5143054479182544/6518911358");
        //  adView.setAdUnitId("ca-app-pub-2729927781686503/9105837825");

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });

        adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);





        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,WindowManager.LayoutParams.FLAG_SECURE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        seen_image = true;

        title = findViewById(R.id.title);
        up = findViewById(R.id.up);
        relativeLayout = findViewById(R.id.relative);


        Intent intent;
        intent = getIntent();
        userid = intent.getStringExtra("university_name");
        messageId = intent.getStringExtra("messageId");
        subject_name = intent.getStringExtra("subject_name");
        random = intent.getStringExtra("random");
        email = intent.getStringExtra("name");

        dbHelper = new PersonDBHelper(this);


        title.setText(subject_name);

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setVisibility(View.GONE);

            }
        });

        id = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);


        List<DownloadModel> downloadModelsLocal = getAllDownloads();
        if (downloadModelsLocal != null) {
            if (downloadModelsLocal.size() > 0) {
                downloadModels.addAll(downloadModelsLocal);
            }
        }


        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        commentList = new ArrayList<>();

        commentAdapter = new CommentAdapter(this, downloadModels);
        recyclerView.setAdapter(commentAdapter);


        if (seen_image)
        {
            dataRead();

        }
        else
        {
        }



    }

    public  void dataRead(){
        reload_int = 0;
        readComments();
        refresss(500);
    }

    private void refresss(int position) {
        final Handler handler = new Handler();
        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                dataRead();
            }
        };
        handler.postDelayed(runnable,position);
    }

    private void readComments(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Pdfs").child(userid).child("suggestion").child(messageId).child("Images");
        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    if (snapshot.child(id+"download").exists())
                    {
                    }
                    else {
                        String image = snapshot.child("postimage").getValue().toString();
                        String postid = snapshot.child("postid").getValue().toString();


                        if (reload_int == 0) {
                            reload_int++;

                            addText("hello", "hello", "hello", messageId, subject_name, messageId, "hello", "hello", "hello", "hello", postid, image);

                            HashMap<String, Object> hash = new HashMap<>();
                            hash.put(id + "download", true);
                            reference.child(postid).updateChildren(hash);

                            commentAdapter.notifyDataSetChanged();
                        } else
                        {

                        }


                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }
    
    public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ImageViewHolder> {
        private Context mContext;
        private List<DownloadModel> downloadModels;
        private String postid;
        private LayoutInflater inflater;
        private FirebaseUser firebaseUser;

        public CommentAdapter(Context context, List<DownloadModel> comments){
            mContext = context;
            downloadModels = comments;
        }

        @NonNull
        @Override
        public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pur_pdf_images, parent, false);
            return new ImageViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull final ImageViewHolder holder, final int position) {
            DownloadModel model = downloadModels.get(position);

            Picasso.get().load(model.getImagrUrl()).into(holder.image);

            holder.img_position.setText(String.valueOf(position+1));

            currentItems = mLayoutManager.getChildCount();
            totalItems = mLayoutManager.getItemCount();
            scrollOutItems = mLayoutManager.findFirstVisibleItemPosition();

            if (reload_boolean){
                for (int p =0; p<totalItems; p++)
                {
                    realm.beginTransaction();
                    RealmResults<DownloadModel> reload_model = realm.where(DownloadModel.class).equalTo("id", model.getId()).findAll();
                    reload_model.deleteAllFromRealm();
                    realm.commitTransaction();
                    downloadModels.remove(position);
                }
            }
            else
            {
            }
        }

        @Override
        public int getItemCount() {
            return downloadModels.size();
        }

        public class ImageViewHolder extends RecyclerView.ViewHolder {

            public PhotoView image;
            private TextView img_position;

            public ImageViewHolder(View itemView) {
                super(itemView);
                img_position= itemView.findViewById(R.id.img_position);
                image = itemView.findViewById(R.id.pur_image_view);
            }
        }

    }

    public static class PersonDBHelper extends SQLiteOpenHelper {

        public static final String DATABASE_NAME = random+".db";
        private static final int DATABASE_VERSION = 3 ;
        public static final String TABLE_NAME = "People";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_PERSON_NAME = "name";
        public static final String COLUMN_PERSON_AGE = "age";
        public static final String COLUMN_PERSON_OCCUPATION = "occupation";
        public static final String COLUMN_PERSON_IMAGE = "image";


        public PersonDBHelper(Context context) {
            super(context, DATABASE_NAME , null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(" CREATE TABLE " + TABLE_NAME + " (" +
                    COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_PERSON_NAME + " TEXT NOT NULL, " +
                    COLUMN_PERSON_AGE + " NUMBER NOT NULL, " +
                    COLUMN_PERSON_OCCUPATION + " TEXT NOT NULL, " +
                    COLUMN_PERSON_IMAGE + " BLOB NOT NULL);"
            );

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // you can implement here migration process
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
            this.onCreate(db);
        }
        /**create record**/
        public void saveNewPerson(Person person) {

            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put(COLUMN_PERSON_NAME, person.getName());
            values.put(COLUMN_PERSON_AGE, person.getAge());
            values.put(COLUMN_PERSON_OCCUPATION, person.getOccupation());
            values.put(COLUMN_PERSON_IMAGE, person.getImage());

            // insert
            db.insert(TABLE_NAME,null, values);
            db.close();
        }

        /**Query records, give options to filter results**/
        public List<Person> peopleList(String filter) {
            String query;
            if(filter.equals("")){
                //regular query
                query = "SELECT  * FROM " + TABLE_NAME;
            }else{
                //filter results by filter option provided
                query = "SELECT  * FROM " + TABLE_NAME + " ORDER BY "+ filter;
            }

            List<Person> personLinkedList = new LinkedList<>();
            SQLiteDatabase db = this.getWritableDatabase();
            Cursor cursor = db.rawQuery(query, null);
            Person person;

            if (cursor.moveToFirst()) {
                do {
                    person = new Person();

                    person.setId(cursor.getLong(cursor.getColumnIndex(COLUMN_ID)));
                    person.setName(cursor.getString(cursor.getColumnIndex(COLUMN_PERSON_NAME)));
                    person.setAge(cursor.getString(cursor.getColumnIndex(COLUMN_PERSON_AGE)));
                    person.setOccupation(cursor.getString(cursor.getColumnIndex(COLUMN_PERSON_OCCUPATION)));
                    person.setImage(cursor.getString(cursor.getColumnIndex(COLUMN_PERSON_IMAGE)));
                    personLinkedList.add(person);
                } while (cursor.moveToNext());
            }


            return personLinkedList;
        }

        /**Query only 1 record**/
        public Person getPerson(long id){
            SQLiteDatabase db = this.getWritableDatabase();
            String query = "SELECT  * FROM " + TABLE_NAME + " WHERE _id="+ id;
            Cursor cursor = db.rawQuery(query, null);

            Person receivedPerson = new Person();
            if(cursor.getCount() > 0) {
                cursor.moveToFirst();

                receivedPerson.setName(cursor.getString(cursor.getColumnIndex(COLUMN_PERSON_NAME)));
                receivedPerson.setAge(cursor.getString(cursor.getColumnIndex(COLUMN_PERSON_AGE)));
                receivedPerson.setOccupation(cursor.getString(cursor.getColumnIndex(COLUMN_PERSON_OCCUPATION)));
                receivedPerson.setImage(cursor.getString(cursor.getColumnIndex(COLUMN_PERSON_IMAGE)));
            }

            return receivedPerson;
        }


        /**delete record**/
        public void deletePersonRecord(long id, Context context) {
            SQLiteDatabase db = this.getWritableDatabase();

            db.execSQL("DELETE FROM "+TABLE_NAME+" WHERE _id='"+id+"'");
            Toast.makeText(context, "Deleted successfully.", Toast.LENGTH_SHORT).show();
        }

        /**update record**/
        public void updatePersonRecord(long personId, Context context, Person updatedperson) {
            SQLiteDatabase db = this.getWritableDatabase();
            //you can use the constants above instead of typing the column names
            db.execSQL("UPDATE  "+TABLE_NAME+" SET name ='"+ updatedperson.getName() + "', age ='" + updatedperson.getAge()+ "', occupation ='"+ updatedperson.getOccupation() + "', image ='"+ updatedperson.getImage() + "'  WHERE _id='" + personId + "'");
            Toast.makeText(context, "Updated successfully.", Toast.LENGTH_SHORT).show();
        }
    }
    
    private void addText(String message, String sender, String receiver, String messageId, String bio, String type, String time, String date, String lastSendMessage, String preMessage, String postId, String imageurl){
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
        downloadModel.setMessageID(postId);
        downloadModel.setIsseen(postId);
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
            public void execute(Realm realm)
            {
                realm.copyToRealm(downloadModel);
            }
        });
    }

    private RealmResults<DownloadModel> getAllDownloads(){
        Realm realm=Realm.getDefaultInstance();
        return realm.where(DownloadModel.class).equalTo("type", messageId).findAll();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        seen_image = false;
    }

    @Override
    protected void onPause() {
        super.onPause();
        seen_image = false;
    }

    @Override
    protected void onStart() {
        super.onStart();
        seen_image = true;
    }

    @Override
    protected void onStop() {
        super.onStop();
        seen_image = false;
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        seen_image = false;

    }


}



// interstitial_ads  ca-app-pub-5143054479182544/9896579239