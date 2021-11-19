package com.company.mypackage;

import java.util.Random;

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
        System.out.println("================================");
        printMatrix(rotateMatrix(matrix));
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrix(int[][] matrix) {
        int[][] rotatedMatrix = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedMatrix[i][j] = matrix[(SIZE - 1) - j][i];
            }
        }
        return rotatedMatrix;
    }
}
