package org.example.Homework_Classes;

import java.util.Arrays;

public class Meneger {
    private int algoritmId;
    private int loopType;
    private int num;

    public Meneger(int algoritmId, int loopType, int num) {
        this.algoritmId = algoritmId;
        this.loopType = loopType;
        if (num >= 0) {
            this.num = num;
        } else {
            System.out.println("Число не может быть отрицательным!");
            this.num = -1111;
        }
    }



    public int[] getResult() {
        if (algoritmId == 1) {
            int[] result = getFibonacci();
            return result;
        } else if (algoritmId == 2) {
            int[] result = getFactorial();
            return result;
        } else {
            System.out.println("Вы ввели некорректное значение");
            return new int[]{-1111};
        }
    }

    public int[] getFibonacci() {
        int[] result = new int[num];
        Fibonacci fibonacci = new Fibonacci(num);
        if (loopType == 1) {
            result = Arrays.copyOf(fibonacci.getFibonacciSeguenceWhile(), num);
        } else if (loopType == 2) {
            result = Arrays.copyOf(fibonacci.getFibonacciSeguenceDoWhile(), num);
        } else if (loopType == 3) {
            result = Arrays.copyOf(fibonacci.getFibonacciSeguenceFor(), num);
        } else {
            System.out.println("Вы ввели некорректное значение");
            result[0] = -1111;
            result = Arrays.copyOf(result, 1);
        }
        return result;
    }


    public int[] getFactorial() {
        int[] result = new int[1];
        Factorial factorial = new Factorial(num);
        if (loopType == 1) {
            result[0] = factorial.useWhile();
        } else if (loopType == 2) {
            result[0] = factorial.useDoWhile();
        } else if (loopType == 3) {
            result[0] = factorial.useFor();
        } else {
            System.out.println("Вы ввели некорректное значение");
            result[0] = -1111;
        }
        return result;
    }


    public void setLoopType(int loopType) {
        if (loopType >= 1 && loopType <= 3) {
            this.loopType = loopType;
        } else {
            System.out.println("Вы ввели некорректное значение");
        }
    }

    public void setAlgoritmId(int algoritmId) {
        if (algoritmId == 1 || algoritmId == 2) {
            this.algoritmId = algoritmId;
        } else {
            System.out.println("Вы ввели некорректное значение");
        }
    }

    public void setNum(int num) {
        if (num >= 0) {
            this.num = num;
        } else {
            System.out.println("Число не может быть отрицательным!");
        }
    }
}