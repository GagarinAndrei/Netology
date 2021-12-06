package ru.netology.librerianusers;

public interface Administrator {
    String getName();

    void issuedBook(Reader reader, String book);

    void reported(Reader reader, String book);
}
