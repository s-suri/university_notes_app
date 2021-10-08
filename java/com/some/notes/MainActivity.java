package com.some.notes;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.some.notes.NotesApplication.PdfPortal;
import com.some.notes.NotesApplication.PurchasedNotesActivity;
import com.some.notes.Uploads.ViewPdfPosts;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    AdView adView;
    private RecyclerView FindFreindrecyclerList;
    private DatabaseReference UsersRef;
    private EditText search_users;
    private FirebaseAuth mAuth;
    private String currentUserID,university_name;
    private Window window;
    private AdView mAdView;
    private TextView ic_cart;
    private RelativeLayout relativeLayout;
    private String saveCurrentTime, saveCurrentDate, userType;
    DatabaseReference reference, reff;
    String email;
    Intent intent;
    ImageView dataupload;
    CardView card_1, card_2, card_3, card_4, card_5, card_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);

        adView.setAdUnitId("ca-app-pub-5143054479182544/6518911358");

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });

        adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        intent = getIntent();
        email = intent.getStringExtra("name");

        mAuth = FirebaseAuth.getInstance();
        currentUserID = mAuth.getCurrentUser().getUid();


        reff = FirebaseDatabase.getInstance().getReference().child("Users");


        dataupload = findViewById(R.id.dataUpload);
        reff.child(currentUserID).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if ((dataSnapshot.child("type").exists())  && (dataSnapshot.child("university_name").exists())) {
                    userType = dataSnapshot.child("type").getValue().toString();
                    university_name = dataSnapshot.child("university_name").getValue().toString();

                    reff.child(currentUserID).child("total_rupay").addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot)
                        {

                        }
                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError)
                        {

                        }
                    });

                    dataupload.setVisibility(View.VISIBLE);

                } else {

                    dataupload.setVisibility(View.GONE);

                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        if (Build.VERSION.SDK_INT >= 21) {
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.blue_300));
        }


        dataupload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, ViewPdfPosts.class);
                    intent.putExtra("university_name", university_name);
                    startActivity(intent);
                    finish();
            }
        });


        ic_cart = findViewById(R.id.ic_cart);
        ic_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PurchasedNotesActivity.class);
                intent.putExtra("name", email);
                startActivity(intent);
                finish();
            }
        });


        UsersRef = FirebaseDatabase.getInstance().getReference().child("Weburls");
        FindFreindrecyclerList = (RecyclerView) findViewById(R.id.chats_list);
        FindFreindrecyclerList.setLayoutManager(new LinearLayoutManager(this));


        relativeLayout = findViewById(R.id.relative_layout);
        card_1 = findViewById(R.id.card_1);
        card_2 = findViewById(R.id.card_2);
        card_3 = findViewById(R.id.card_3);
        card_4 = findViewById(R.id.card_4);
        card_5 = findViewById(R.id.card_5);
        card_6 = findViewById(R.id.card_6);


        card_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, PdfPortal.class);

                intent.putExtra("university_name", "10th Class");
                startActivity(intent);

            }
        });

        card_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PdfPortal.class);
                intent.putExtra("university_name", "12th Class");
                startActivity(intent);
            }
        });

        card_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, PdfPortal.class);
                intent.putExtra("university_name", "Bank Exam");
                startActivity(intent);

            }
        });

        card_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, PdfPortal.class);
                intent.putExtra("university_name", "Railway Exam");
                startActivity(intent);

            }
        });

        card_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, PdfPortal.class);
                intent.putExtra("university_name", "Artificial Intelligence");
                startActivity(intent);

            }
        });

        card_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, PdfPortal.class);
                intent.putExtra("university_name", "Java Programing");
                startActivity(intent);

            }
        });

        search_users = findViewById(R.id.search_users);
        search_users.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().trim().length() == 0) {
                    FindFreindrecyclerList.setVisibility(View.GONE);
                    relativeLayout.setVisibility(View.VISIBLE);

                } else {
                    FindFreindrecyclerList.setVisibility(View.VISIBLE);
                    relativeLayout.setVisibility(View.GONE);
                    firebaseSearch(charSequence.toString().toLowerCase());
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    private void firebaseSearch(String newText) {


        Query ChatsRef = UsersRef.orderByChild("search").startAt(newText).endAt(newText + "\uf8ff");
        FirebaseRecyclerOptions<WebItems> options = new FirebaseRecyclerOptions.Builder<WebItems>()
                        .setQuery(ChatsRef, WebItems.class).build();


        final FirebaseRecyclerAdapter<WebItems, ContactViewHolder> adapter =
                new FirebaseRecyclerAdapter<WebItems, ContactViewHolder>(options) {
                    @Override
                    protected void onBindViewHolder(@NonNull final ContactViewHolder holder, final int position, @NonNull final WebItems model) {
                        holder.web_title.setText(model.getUniversityName());
                        holder.web_des.setVisibility(View.VISIBLE);
                        holder.web_des.setText(model.getTitle());

                        holder.itemView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                if (model.getType().equals("web_pdf")) {
                                    Intent intent = new Intent(MainActivity.this, PdfPortal.class);
                                    intent.putExtra("university_name", model.getUniversityName());
                                    intent.putExtra("name",email);
                                    startActivity(intent);
                                } else if (model.getType().equals("web_url")) {
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(model.getUrl()));
                                    startActivity(intent);
                                }
                            }
                        });
                    }

                    @NonNull
                    @Override
                    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
                        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_open_website, viewGroup, false);
                        ContactViewHolder viewHolder = new ContactViewHolder(view);
                        return viewHolder;
                    }
                };
        FindFreindrecyclerList.setAdapter(adapter);
        adapter.startListening();
    }


    public static class ContactViewHolder extends RecyclerView.ViewHolder {
        TextView web_title, web_des;
        CircleImageView profileImage;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            web_title = itemView.findViewById(R.id.web_title_txt);
            web_des = itemView.findViewById(R.id.web_description_txt);
        }
    }

    private void state(String online) {

        reference = FirebaseDatabase.getInstance().getReference("Users").child(currentUserID).child("userState");


        Calendar calForDate = Calendar.getInstance();
        SimpleDateFormat currendateFormat = new SimpleDateFormat("MMM dd");
        saveCurrentDate = currendateFormat.format(calForDate.getTime());


        Calendar calForTime = Calendar.getInstance();
        SimpleDateFormat currenTimeFormat = new SimpleDateFormat("hh:mm a");
        saveCurrentTime = currenTimeFormat.format(calForTime.getTime());


        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("state", online);
        hashMap.put("date", saveCurrentDate);
        hashMap.put("time", saveCurrentTime);

        reference.updateChildren(hashMap);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
