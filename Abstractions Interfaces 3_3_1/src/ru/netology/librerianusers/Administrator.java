package ru.netology.librerianusers;

public interface Administrator {
    void issuedBook(String worker, String user, String book);

    void reported(String worker, String user, String book);
}
