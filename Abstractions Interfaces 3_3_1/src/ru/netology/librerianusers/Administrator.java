package ru.netology.librerianusers;

public interface Administrator {
    String getName();

    void issuedBook(Administrator administrator, Reader reader, String book);

    void reported(Administrator administrator, Reader reader, String book);
}
