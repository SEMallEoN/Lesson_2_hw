package ru.geekbrains.lesson2_hw.semenov;

public class Homework2 {
    public static void main(String[] args) {
        reversArray();
        fillInArray();
        multiArray();
        squareArray();
        minmaxArray();
        balanceArray();
        offsetArray();
    }

    // Задание 1
    public static void reversArray() {
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Задание 1");
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 0) {
                array1[i] = 1;
            } else {
                array1[i] = 0;
            }
            System.out.print(array1[i] + " ");
        }
        System.out.println();
    }

    // Задание 2
    public static void fillInArray() {
        int[] array2 = new int[8];
        int j = 0;
        System.out.println("Задание 2");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = j;
            j = j + 3;
            System.out.print(array2[i] + " ");
        }
        System.out.println();
    }

    // Задание 3
    public static void multiArray() {
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Задание 3");
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] = array3[i] * 2;
            } else {
                array3[i] = array3[i];
            }
            System.out.print(array3[i] + " ");
        }
        System.out.println();
    }

    // Задание 4
    public static void squareArray() {
        int[][] array4 = new int[5][5];
        System.out.print("Задание 4");
        int k = 0;
        k = array4.length - 1;
        for (int i = 0; i < array4.length; i++) {
            System.out.println();
            for (int j = 0; j < array4.length; j++) {
                if (i == j) {
                    array4[i][j] = 1;
                }
                array4[i][k - i] = 1;
                System.out.print(array4[i][j]);
            }
        }
        System.out.println();
    }

    // Задание 5
    public static void minmaxArray() {
        int[] array5 = {5, 12, 123, 23, 45, 65, 345, 53, 87, 12, 4, 3, 67};
        int max = array5[0];
        int min = array5[0];
        System.out.println("Задание 5");
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] > max) {
                max = array5[i];
            }
            if (array5[i] < min) {
                min = array5[i];
            }
        }
        System.out.println("Максимально значение " + max);
        System.out.println("Минимальное значение " + min);
    }

    // Задание 6
    public static void balanceArray() {
        int[] array6 = {1, 1, 2, 3, 2, 3, 1, 2, 3, 4, 2, 1, 2, 1, 2, 1, 2};
        int k = 0;
        int l = 0;
        int m = array6.length;
        System.out.println("Задание 6");
        for (int i = 0; i < array6.length; i++) {
            k = array6[i] + array6[i + 1];
            l = array6[m] + array6[m - 1];
            if (k == l) {
                System.out.println(true);
                break;
            }
        }
    }

    // Задание 7
    public static void offsetArray() {

    }

}