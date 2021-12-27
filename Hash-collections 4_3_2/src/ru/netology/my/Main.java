package ru.netology.my;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Student> studentSet = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter student information: Name, group, studentID");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Students list:");
                for (Student student : studentSet) {
                    System.out.println(student);
                }
                break;
            }
            String[] data = input.split(", ");
            if (studentSet.add(new Student(data[0], data[1], data[2]))) {
                System.out.println("Data received");
            } else {
                System.out.println("A student with this ID already exists!");
            }
        }
    }
}
