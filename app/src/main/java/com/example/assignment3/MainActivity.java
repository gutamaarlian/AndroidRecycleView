package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.assignment3.adapter.ContactAdapter;
import com.example.assignment3.entity.Contact;
import com.example.assignment3.response.ContactsResponse;
import com.example.assignment3.util.ContactUtil;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ContactUtil contactUtil;
    RecyclerView recyclerView;
    ContactAdapter contactAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        contactUtil = new ContactUtil();
        recyclerView = findViewById(R.id.contact_recycler_view);

        contactUtil.getContacts().getContact().enqueue(new Callback<ContactsResponse>() {

            @Override
            public void onResponse(Call<ContactsResponse> call, Response<ContactsResponse> response) {
                List<Contact> contacts = response.body().getContacts();
                 contactAdapter = new ContactAdapter(contacts, getApplicationContext());
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager((getApplicationContext()));
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayoutManager.VERTICAL));
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(contactAdapter);
            }

            @Override
            public void onFailure(Call<ContactsResponse> call, Throwable t) {

            }
        });
    }
}