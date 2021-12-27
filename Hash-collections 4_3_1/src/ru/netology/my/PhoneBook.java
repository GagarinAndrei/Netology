package ru.netology.my;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<Contact>> contactList = new HashMap<>();

    public PhoneBook(Map<String, List<Contact>> contactList) {
        this.contactList = contactList;
    }

    public PhoneBook() {

    }

    public Map<String, List<Contact>> getContactList() {
        return contactList;
    }

    public void addGroup(String groupName) {
        List<Contact> contacts = new ArrayList<>();
        contactList.put(groupName, contacts);
    }

    public void addContact(String groupName, Contact contact) {
        List<Contact> contacts = new ArrayList<>();
        contacts.addAll(contactList.get(groupName));
        contacts.add(contact);
        contactList.put(groupName, contacts);
    }

    public void findContact(String phoneNumber) {
        for (Map.Entry<String, List<Contact>> entry : contactList.entrySet()) {
            List<Contact> contacts = new ArrayList<>();
            contacts.addAll(entry.getValue());
            for (Contact contact : contacts) {
                if (contact.getPhoneNumber().equals(phoneNumber)) {
                    System.out.println(contact);
                }
            }
        }
    }
}
