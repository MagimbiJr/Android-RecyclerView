package com.tana.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactDetailsActivity extends AppCompatActivity {
    public static final String CONTACT_INFO = "com.tana.recyclerview.CONTACT_INFO";
    public static final int POSITION_NOT_SET = -1;
    public TextView mContactName;
    public TextView mPhoneNumber;
    public ImageView mDpImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details2);

        Intent intent = getIntent();
        intent.getIntExtra(CONTACT_INFO, POSITION_NOT_SET);

        mContactName = (TextView) findViewById(R.id.contact_name);
        mPhoneNumber = (TextView) findViewById(R.id.phone_number);
        mDpImg = (ImageView) findViewById(R.id.img_dp);

//        displayContact(mContactName, mPhoneNumber, mDpImg);
    }

//    private void displayContact(TextView contactName, TextView phoneNumber, ImageView dpImg) {
//        Contact contact = new Contact();
//        contactName.setText(contact.getName());
//        phoneNumber.setText(contact.getPhone());
//        dpImg.setImageResource(contact.getPhoto());
//    }
}