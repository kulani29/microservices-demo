package com.contact.controller;

import com.contact.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.contact.service.ContactService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ContactController {

    @Autowired
    private ContactService contactService;


    @GetMapping("/{userId}")
    public List<Contact> getUser(@PathVariable("userId") Long userId) {

        return this.contactService.getContactsOfUser(userId);

    }
}
