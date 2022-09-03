package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    //fake contact Service
    List<Contact> contacts = List.of(
            new Contact(1, "amit@gmail.com", "Amit", 1311),
            new Contact(2, "abhi@gmail.com", "Abhi", 1311)
    );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return contacts;
    }
}
