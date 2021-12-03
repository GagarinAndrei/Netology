package ru.netology.librerianusers;

public interface Reader {
    void takeBook(String user, String user2, String book);

    void giveBook(String user, String user2, String book);

}