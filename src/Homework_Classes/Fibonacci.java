package Homework_Classes;

public class Fibonacci {
    private int num;

    public Fibonacci() {
    }

    public Fibonacci(int num) {
        if (num < 0) {
            System.out.println("Число не может быть отрицательным!");
        }
        this.num = num;
    }

    public int[] getFibonacciSeguenceFor() {
        if (num < 0) {
            return error();
        }
        int[] sequence = new int[num];
        if (num < 0) {
            return error();
        }
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
        if (num < 0) {
            return error();
        }
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

    public int[] getFibonacciSeguenceDoWhile() {
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
        }
        int i = 2;
        do {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
            i = i + 1;
        } while (i < num);
        return sequence;
    }

    public static int[] error() {
        System.out.println("Вы ввели недопустимое значение!");
        int[] error = new int[0];
        return error;
    }

    public void setNumber(int num) {
        if (num < 0) {
            System.out.println("Число не может быть отрицательным!");
        }
        this.num = num;
    }

    public int getNumber() {
        return num;
    }

}
