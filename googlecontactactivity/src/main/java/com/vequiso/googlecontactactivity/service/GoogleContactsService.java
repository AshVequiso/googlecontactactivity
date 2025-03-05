package com.vequiso.googlecontactactivity.service;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class GooglePeopleService {

    public List<Map<String, String>> getContacts() {
        // TODO: Implement API call to fetch contacts
        return List.of();
    }

    public void addContact(String name, String email) {
        // TODO: Implement API call to add a new contact
    }

    public void editContact(String contactId, String newName, String newEmail) {
        // TODO: Implement API call to modify an existing contact
    }

    public void removeContact(String contactId) {
        // TODO: Implement API call to remove a contact
    }
}
