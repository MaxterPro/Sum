package org.example;

public class Summa {
    public static void main(String[] args) {

        int[] arr = {12, 5, 23, 7, 59, 6, 7, 45, 68, 9, 4, 93};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Summa = " + sum);

    }
}