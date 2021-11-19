package com.company.mypackage;

import java.util.Random;
import java.util.Scanner;

public class Main {
    final static int SIZE = 8;

    public static void main(String[] args) {
        int[][] matrix = new int[SIZE][SIZE];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(256);
            }
        }

        printMatrix(matrix);
        printLine();
        printMenu();
        printLine();
        chooseTurn(matrix);
    }

    public static void chooseTurn(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> ");
        int turnAngle = Integer.parseInt(scanner.nextLine());
        printLine();

        switch (turnAngle) {
            case 1:
                printMatrix(matrix);
                break;
            case 2:
                printMatrix(rotateMatrix90(matrix));
                break;
            case 3:
                printMatrix(rotateMatrix180(matrix));
                break;
            case 4:
                printMatrix(rotateMatrix270(matrix));
                break;
        }
    }

    public static void printLine() {
        System.out.println("================================");
    }

    public static void printMenu() {
        System.out.println("Выберите угол поворота матрицы:");
        System.out.println("1 - для поворота на 0 градусов");
        System.out.println("2 - для поворота на 90 градусов");
        System.out.println("3 - для поворота на 180 градусов");
        System.out.println("4 - для поворота на 270 градусов");
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrix90(int[][] matrix) {
        int[][] rotatedMatrix = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedMatrix[i][j] = matrix[(SIZE - 1) - j][i];
            }
        }
        return rotatedMatrix;
    }
    public static int[][] rotateMatrix180(int[][] matrix) {
        int[][] rotatedMatrix = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedMatrix[i][j] = matrix[(SIZE -1) - i][(SIZE -1) - j];
            }
        }
        return rotatedMatrix;
    }public static int[][] rotateMatrix270(int[][] matrix) {
        int[][] rotatedMatrix = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedMatrix[i][j] = matrix[j][(SIZE - 1) - i];
            }
        }
        return rotatedMatrix;
    }
}
