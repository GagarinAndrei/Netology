package ru.netology.librerianusers;

public interface Librarian {
    String getName();

    void orderBook(Supplier supplier, String book);
}
