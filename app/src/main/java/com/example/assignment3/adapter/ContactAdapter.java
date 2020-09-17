package com.example.assignment3.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment3.R;
import com.example.assignment3.entity.Contact;
import com.example.assignment3.view_holder.ContactViewHolder;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {

    private List<Contact> contacts;
    private Context ctx;

    public ContactAdapter(List<Contact> contacts, Context ctx) {
        this.contacts = contacts;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_contact,parent,false);
        return new ContactViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, final int position) {


        holder.name.setText(contacts.get(position).getName());
        holder.email.setText(contacts.get(position).getEmail());
        holder.phone.setText(contacts.get(position).getPhone().getMobile());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent detailUser = new Intent(ctx, DetailContact.class);
//                detailUser.putExtra("userDetail",contacts.get(position));
//                ctx.startActivity(detailUser);
            }
        });

    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }
}