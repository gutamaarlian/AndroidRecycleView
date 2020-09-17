package com.example.assignment3.util;

import com.example.assignment3.service.ClientService;
import com.example.assignment3.service.ContactService;

public class ContactUtil {
    public ContactUtil() {
    }

    public ContactService getContacts(){
        return ClientService.getClient().create(ContactService.class);
    }
}
