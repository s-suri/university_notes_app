package com.some.notes.NotesApplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.shreyaspatil.EasyUpiPayment.EasyUpiPayment;
import com.shreyaspatil.EasyUpiPayment.listener.PaymentStatusListener;
import com.shreyaspatil.EasyUpiPayment.model.PaymentApp;
import com.shreyaspatil.EasyUpiPayment.model.TransactionDetails;
import com.some.notes.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

public class MessagePdfTransaction extends AppCompatActivity implements PaymentStatusListener {
    private ImageView imageView;
    private TextView statusView;
    private Button payButton;
    private RadioGroup radioAppChoice;
    private EditText fieldPayeeVpa;
    private EditText fieldPayeeName;
    private EditText fieldTransactionId;
    private EditText fieldTransactionRefId;
    private TextView fieldDescription;
    private TextView fieldAmount;
    private EasyUpiPayment mEasyUpiPayment;
    Window window;
    String payment_id,download_id,upiHolderName;
    String userid,print_message,amount;
    Intent intent;
    DatabaseReference reference,view_pdf;
    String transactionId,postId,universityName;
    String id;
    AdView adView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_transaction);


        intent = getIntent();
        id = intent.getStringExtra("id");
        userid = intent.getStringExtra("user_id");
        download_id = intent.getStringExtra("download_id");
        payment_id = intent.getStringExtra("payment_id");
        upiHolderName = intent.getStringExtra("PaymentHolderName");
        print_message = intent.getStringExtra("print_message");
        amount = intent.getStringExtra("amount");
        postId= intent.getStringExtra("messageID");
        universityName = intent.getStringExtra("universityName");



        reference = FirebaseDatabase.getInstance().getReference("Users").child(userid).child("total_rupay");
        view_pdf = FirebaseDatabase.getInstance().getReference("Pdfs");


        initViews();

        if (Build.VERSION.SDK_INT>=21){
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.colorWhite));
        }


        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pay();
            }
        });
    }

    private void initViews() {
        imageView = findViewById(R.id.imageView);
        statusView = findViewById(R.id.textView_status);
        payButton = findViewById(R.id.button_pay);

        fieldPayeeVpa = findViewById(R.id.field_vpa);
        fieldPayeeName = findViewById(R.id.field_name);
        fieldTransactionId = findViewById(R.id.field_transaction_id);
        fieldTransactionRefId = findViewById(R.id.field_transaction_ref_id);
        fieldDescription = findViewById(R.id.field_description);
        fieldAmount = findViewById(R.id.field_amount);


        String transactionId = "TID" + System.currentTimeMillis();
        fieldTransactionId.setText(transactionId);
        fieldTransactionRefId.setText(transactionId);

        fieldPayeeVpa.setText(payment_id);
        fieldDescription.setText(print_message);
        fieldAmount.setText(amount);

        radioAppChoice = findViewById(R.id.radioAppChoice);
    }

    private void pay() {
        String payeeVpa = fieldPayeeVpa.getText().toString();
        String payeeName = fieldPayeeName.getText().toString();
        transactionId = fieldTransactionId.getText().toString();
        String transactionRefId = fieldTransactionRefId.getText().toString();
        String description = fieldDescription.getText().toString();
        String amount = fieldAmount.getText().toString();
        RadioButton paymentAppChoice = findViewById(radioAppChoice.getCheckedRadioButtonId());


        if (TextUtils.isEmpty(payeeVpa) || TextUtils.isEmpty(payeeName) || TextUtils.isEmpty(transactionId) || TextUtils.isEmpty(transactionRefId) || TextUtils.isEmpty(description) || TextUtils.isEmpty(amount)) {
            Toast.makeText(MessagePdfTransaction.this, "All fields are required!", Toast.LENGTH_SHORT).show();
        } else {


            // START PAYMENT INITIALIZATION
            mEasyUpiPayment = new EasyUpiPayment.Builder()
                    .with(this)
                    .setPayeeVpa(payeeVpa)
                    .setPayeeName(payeeName)
                    .setTransactionId(transactionId)
                    .setTransactionRefId(transactionRefId)
                    .setDescription(description)
                    .setAmount(amount + ".00")
                    .build();

            // Register Listener for Events
            mEasyUpiPayment.setPaymentStatusListener(this);

            switch (paymentAppChoice.getId()) {
                case R.id.app_default:
                    mEasyUpiPayment.setDefaultPaymentApp(PaymentApp.NONE);
                    break;
                case R.id.app_amazonpay:
                    mEasyUpiPayment.setDefaultPaymentApp(PaymentApp.AMAZON_PAY);
                    break;
                case R.id.app_bhim_upi:
                    mEasyUpiPayment.setDefaultPaymentApp(PaymentApp.BHIM_UPI);
                    break;
                case R.id.app_google_pay:
                    mEasyUpiPayment.setDefaultPaymentApp(PaymentApp.GOOGLE_PAY);
                    break;
                case R.id.app_phonepe:
                    mEasyUpiPayment.setDefaultPaymentApp(PaymentApp.PHONE_PE);
                    break;
                case R.id.app_paytm:
                    mEasyUpiPayment.setDefaultPaymentApp(PaymentApp.PAYTM);
                    break;
            }

            if (mEasyUpiPayment.isDefaultAppExist()) {
                onAppNotFound();
                return;
            }

            mEasyUpiPayment.startPayment();
        }

    }

    @Override
    public void onTransactionCompleted(TransactionDetails transactionDetails) {
        // Transaction Completed
        Log.d("TransactionDetails", transactionDetails.toString());
        statusView.setText(transactionDetails.toString());
    }

    @Override
    public void onTransactionSuccess() {
        Calendar calForDate2 = Calendar.getInstance();
        SimpleDateFormat currendateFormat2 = new SimpleDateFormat("yyyyMMdd");
        String saveCurrentDate2 = currendateFormat2.format(calForDate2.getTime());

        Calendar calForTime2 = Calendar.getInstance();
        SimpleDateFormat currenTimeFormat2 = new SimpleDateFormat("hhmmss");
        String saveCurrentTime2 = currenTimeFormat2.format(calForTime2.getTime());

        String time= saveCurrentDate2 + saveCurrentTime2;

        HashMap<String,Object> hashMap = new HashMap<>();
        final String messageId = reference.push().getKey();
        hashMap.put(time+id,"yes");


        reference.child(messageId).updateChildren(hashMap).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){

                    HashMap<String,Object> map = new HashMap<>();

                    map.put(id,"true");

                    view_pdf.child(universityName).child("suggestion").child(postId).updateChildren(map);


                    Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_SHORT).show();
                    imageView.setImageResource(R.drawable.ic_success);

                }
            }
        });



    }

    @Override
    public void onTransactionSubmitted() {
        // Payment Pending
        Toast.makeText(this, "Pending | Submitted", Toast.LENGTH_SHORT).show();
        imageView.setImageResource(R.drawable.ic_failed);
    }

    @Override
    public void onTransactionFailed() {
        // Payment Failed
        Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show();
        imageView.setImageResource(R.drawable.ic_failed);
    }

    @Override
    public void onTransactionCancelled() {
        // Payment Cancelled by User
        Toast.makeText(this, "Cancelled", Toast.LENGTH_SHORT).show();
        imageView.setImageResource(R.drawable.ic_failed);
    }

    @Override
    public void onAppNotFound() {
        Toast.makeText(this, "App Not Found", Toast.LENGTH_SHORT).show();
    }

}