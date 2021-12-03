package ru.netology.librerianusers;

public interface Librarian {
    String getName();

    void orderBook(Librarian librarian, Supplier supplier, String book);
}
