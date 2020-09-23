package com.tana.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static List<Contact> mContact;
    RecyclerView mContactList;
    LinearLayoutManager mLayoutManager;
    ContactRecyclerAdapter mRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContact = new ArrayList<>();
        mContact.add(new Contact("Atanas Charle", "+255 (0) 718383894", R.drawable.tana));
        mContact.add(new Contact("Jerry Keneth", "+255 (0) 787118486", R.drawable.jerry));
        mContact.add(new Contact("Atanas Charle", "+255 (0) 718383894", R.drawable.tana));
        mContact.add(new Contact("Jerry Keneth", "+255 (0) 787118486", R.drawable.jerry));
        mContact.add(new Contact("Atanas Charle", "+255 (0) 718383894", R.drawable.tana));
        mContact.add(new Contact("Jerry Keneth", "+255 (0) 787118486", R.drawable.jerry));
        mContact.add(new Contact("Atanas Charle", "+255 (0) 718383894", R.drawable.tana));
        mContact.add(new Contact("Jerry Keneth", "+255 (0) 787118486", R.drawable.jerry));
        mContact.add(new Contact("Atanas Charle", "+255 (0) 718383894", R.drawable.tana));
        mContact.add(new Contact("Jerry Keneth", "+255 (0) 787118486", R.drawable.jerry));
        mContact.add(new Contact("Atanas Charle", "+255 (0) 718383894", R.drawable.tana));
        mContact.add(new Contact("Jerry Keneth", "+255 (0) 787118486", R.drawable.jerry));
        mContact.add(new Contact("Atanas Charle", "+255 (0) 718383894", R.drawable.tana));
        mContact.add(new Contact("Jerry Keneth", "+255 (0) 787118486", R.drawable.jerry));
        mContact.add(new Contact("Atanas Charle", "+255 (0) 718383894", R.drawable.tana));
        mContact.add(new Contact("Jerry Keneth", "+255 (0) 787118486", R.drawable.jerry));

        mContactList = (RecyclerView) findViewById(R.id.contact_list);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerAdapter = new ContactRecyclerAdapter(this, mContact);
        mContactList.setLayoutManager(mLayoutManager);
        mContactList.setAdapter(mRecyclerAdapter);

    }

}