package ru.netology.librerianusers;

public interface Reader {
    String getName();

    void takeBook(Reader reader, Administrator administrator, String book);

    void giveBook(Reader reader, Administrator administrator, String book);

}