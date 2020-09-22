package com.tana.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactRecyclerAdapter extends RecyclerView.Adapter<ContactRecyclerAdapter.ContactViewHolder> {

    final Context mContext;
    final List<Contact> mContacts;

    public ContactRecyclerAdapter(Context context, List<Contact> contacts) {
        mContext = context;
        mContacts = contacts;
    }


    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_contant, parent, false);
        ContactViewHolder viewHolder = new ContactViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        Contact contactList = mContacts.get(position);
        holder.mContactName.setText(contactList.getName());
        holder.mPhoneNumber.setText(contactList.getPhone());
        holder.mDpImage.setImageResource(contactList.getPhoto());
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder {
        public ImageView mDpImage;
        public TextView mContactName;
        public TextView mPhoneNumber;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);

            mDpImage = (ImageView) itemView.findViewById(R.id.dp_img);
            mContactName = (TextView) itemView.findViewById(R.id.name_contact);
            mPhoneNumber = (TextView) itemView.findViewById(R.id.phone_contact);
        }
    }
}
