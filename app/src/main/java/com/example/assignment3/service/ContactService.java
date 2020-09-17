package com.example.assignment3.service;

import com.example.assignment3.entity.Contact;
import com.example.assignment3.response.ContactsResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ContactService {
    @GET("/contacts")
    Call<ContactsResponse> getContact();

}
