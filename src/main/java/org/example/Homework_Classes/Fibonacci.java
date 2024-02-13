package org.example.Homework_Classes;

public class Fibonacci{
    int num;

    public Fibonacci(int num) {
        this.num = num;
    }

    public int[] getFibonacciSeguenceFor() {
            int[] sequence = new int[num];
            if (num < 2) {
                return sequence;
            }
            sequence[1] = 1;
            for (int i = 2; i < sequence.length; i++) {
                sequence[i] = sequence[i - 1] + sequence[i - 2];
            }
            return sequence;
    }

    public int[] getFibonacciSeguenceWhile() {
        int[] sequence = new int[num];
        if (num < 2) {
            return sequence;
        }
        sequence[1] = 1;
        int i = 2;
        while (i < num) {
            sequence[1] = 1;
            sequence[i] = sequence[i - 1] + sequence[i - 2];
            i = i + 1;
        }
        return sequence;
    }

    protected int[] getFibonacciSeguenceDoWhile() {
        int[] sequence = new int[num];
        if (num < 2) {
            return sequence;
        }
        sequence[1] = 1;
        if (num == 2) {
            return sequence;
        }
        int i = 2;
        do {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
            i = i + 1;
        } while (i < num);
        return sequence;
    }

    public void setNumber(int num) {
        if (num >= 0) {
            this.num = num;
        } else {
            System.out.println("Число не может быть отрицательным!");
        }
    }

    public int getNumber() {
        return num;
    }
}
