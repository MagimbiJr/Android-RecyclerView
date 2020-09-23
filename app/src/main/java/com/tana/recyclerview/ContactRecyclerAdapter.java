package com.tana.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//import static com.tana.recyclerview.MainActivity.CONTACT_INFO;

public class ContactRecyclerAdapter extends RecyclerView.Adapter<ContactRecyclerAdapter.ContactViewHolder> {

    public final Context mContext;
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
        holder.mCurrentPosition = position;
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {
        public final ImageView mDpImage;
        public final TextView mContactName;
        public final TextView mPhoneNumber;
        public int mCurrentPosition;


        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);

            mDpImage = (ImageView) itemView.findViewById(R.id.img_dp);
            mContactName = (TextView) itemView.findViewById(R.id.contact_name);
            mPhoneNumber = (TextView) itemView.findViewById(R.id.phone_contact);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(mContext, ContactDetailsActivity.class);
                    intent.putExtra(ContactDetailsActivity.CONTACT_INFO, mCurrentPosition);
                    mContext.startActivity(intent);
                }
            });
        }
    }
}
