package ru.netology.librerianusers;

public interface Supplier {
    String getName();

    void broughtBook(Supplier supplier, Librarian librarian, String book);

}
