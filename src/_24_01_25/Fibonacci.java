package _24_01_25;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число > 0:  ");
        int num = scanner.nextInt();
        System.out.println("Последовательность Фибоначчи: " + Arrays.toString(getFibonacciSeguenceFor(num)));
        System.out.println("Последовательность Фибоначчи: " + Arrays.toString(getFibonacciSeguenceWhile(num)));
        System.out.println("Последовательность Фибоначчи: " + Arrays.toString(getFibonacciSeguenceDoWhile(num)));
    }

    public static int[] getFibonacciSeguenceFor(int num) {

        if (num < 0) {
            return error();
        }
        int[] sequence = new int[num];
        if (num < 2) {
            return sequence;
        }
        sequence[1] = 1;
        if (num == 2) {
            return sequence;
        } else {
            for (int i = 2; i < sequence.length; i++) {
                sequence[i] = sequence[i - 1] + sequence[i - 2];
            }
            return sequence;
        }

    }


    public static int[] getFibonacciSeguenceWhile(int num) {
        if (num < 0) {
            return error();
        }
        int[] sequence = new int[num];
        if (num < 2) {
            return sequence;
        }
        switch (num) {
            case (2):
                sequence[1] = 1;
                return sequence;
            default:
                sequence[1] = 1;
                int i = 2;
                while (i < num) {
                    sequence[1] = 1;
                    sequence[i] = sequence[i - 1] + sequence[i - 2];
                    i = i + 1;
                }
                return sequence;
        }
    }

    public static int[] getFibonacciSeguenceDoWhile(int num) {
        if (num < 0) {
            return error();
        }
        int[] sequence = new int[num];
        if (num < 2) {
            return sequence;
        }
        switch (num) {
            case (2):
                sequence[1] = 1;
                return sequence;
            default:
                sequence[1] = 1;
                int i = 2;
                do {
                    sequence[i] = sequence[i - 1] + sequence[i - 2];
                    i = i + 1;
                } while (i < num);
                return sequence;

        }

    }

    public static int[] error() {
        System.out.println("Вы ввели недопустимое значение!");
        int[] error = new int[0];
        return error;
    }
}
