package ru.netology.my;

public class Event {
    private String title;
    private int releaseYear;
    private int age;

    public String toString() {
        return this.title + " " + this.releaseYear + " " + age;
    }
    
    public Event(String title, int releaseYear, int age) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getAge() {
        return age;
    }
}

