package ru.netology.my;

import java.util.Objects;

public class Contact {
    final String phoneNumber;
    private String name;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(phoneNumber, contact.phoneNumber) && Objects.equals(name, contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, name);
    }

    @Override
    public String toString() {
        return phoneNumber + " - " + name;
    }
}
