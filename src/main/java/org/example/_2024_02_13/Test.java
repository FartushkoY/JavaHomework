package org.example._2024_02_13;

import java.util.Arrays;
import java.util.Random;

/**
 * Задача
 * Напишите программу которая выводит на конслоь простые числа в промежутке от 2 до 100 включительно.
 */

public class Test {
    public static void main(String[] args) {
        int[] simpleNumbers = new int[100];
        int counter = 0;
        for (int i = 2; i <= 100; i++) {
            int coincidence = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    coincidence++;
                }
            } if (coincidence == 1) {
                simpleNumbers[counter] = i;
                counter++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(simpleNumbers, counter)));
    }
}
