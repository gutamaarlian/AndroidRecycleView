package com.example.assignment3.view_holder;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment3.R;

public class ContactViewHolder extends RecyclerView.ViewHolder {

    public TextView name, email, phone;
    public RelativeLayout layout;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.txt_name);
        email = itemView.findViewById(R.id.txt_email);
        phone = itemView.findViewById(R.id.txt_mobile_phone);
        layout = itemView.findViewById(R.id.row_contact_layout);



    }


}
