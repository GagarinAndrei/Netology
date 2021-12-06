package ru.netology.librerianusers;

public interface Supplier {
    String getName();

    void broughtBook(Librarian librarian, String book);

}
