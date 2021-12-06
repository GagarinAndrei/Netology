package ru.netology.librerianusers;

public interface Reader {
    String getName();

    void takeBook(Administrator administrator, String book);

    void giveBook(Administrator administrator, String book);

}