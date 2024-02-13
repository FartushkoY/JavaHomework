package org.example.Homework_Classes;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип алгоритма:");
        System.out.println("1. вычисление ряда чисел Фибоначчи");
        System.out.println("2. вычисление факториала");
        int algoritmId = scanner.nextInt();
        System.out.println("Выберите тип цикла:");
        System.out.println("1. цикл while");
        System.out.println("2. цикл do-while");
        System.out.println("3. цикл for");
        int loopType = scanner.nextInt();
        System.out.println("Введите число >= 0:");
        int num = scanner.nextInt();
        Meneger meneger = new Meneger(algoritmId, loopType, num);
        System.out.println(Arrays.toString(meneger.getResult()));




//        Fibonacci fibonacci1 = new Fibonacci();
//        fibonacci1.setNumber(2);
//        System.out.println("Последовательность Фибоначчи с количеством элементов " + fibonacci1.getNumber() + " : " + Arrays.toString(fibonacci1.getFibonacciSeguenceFor()));
//        System.out.println("Последовательность Фибоначчи с количеством элементов " + fibonacci1.getNumber() + " : " + Arrays.toString(fibonacci1.getFibonacciSeguenceWhile()));
//        System.out.println("Последовательность Фибоначчи с количеством элементов " + fibonacci1.getNumber() + " : " + Arrays.toString(fibonacci1.getFibonacciSeguenceDoWhile()));
//        System.out.println("--------------------------------------------");
//
//        Fibonacci fibonacci2 = new Fibonacci(-4);
//        System.out.println("Последовательность Фибоначчи с количеством элементов " + fibonacci2.getNumber() + " : " + Arrays.toString(fibonacci2.getFibonacciSeguenceFor()));
//        System.out.println("Последовательность Фибоначчи с количеством элементов " + fibonacci2.getNumber() + " : " + Arrays.toString(fibonacci2.getFibonacciSeguenceWhile()));
//        System.out.println("Последовательность Фибоначчи с количеством элементов " + fibonacci2.getNumber() + " : " + Arrays.toString(fibonacci2.getFibonacciSeguenceDoWhile()));
//        System.out.println("--------------------------------------------");
//
//        Fibonacci fibonacci3 = new Fibonacci(5);
//        System.out.println("Последовательность Фибоначчи с количеством элементов " + fibonacci3.getNumber() + " : " + Arrays.toString(fibonacci3.getFibonacciSeguenceFor()));
//        System.out.println("Последовательность Фибоначчи с количеством элементов " + fibonacci3.getNumber() + " : " + Arrays.toString(fibonacci3.getFibonacciSeguenceWhile()));
//        System.out.println("Последовательность Фибоначчи с количеством элементов " + fibonacci3.getNumber() + " : " + Arrays.toString(fibonacci3.getFibonacciSeguenceDoWhile()));
//        System.out.println("--------------------------------------------");
//
//        Factorial factorial1 = new Factorial();
//        factorial1.setNumber(-3);
//
//        Factorial factorial2 = new Factorial(3);
//
//        System.out.println("Факториал числа " + factorial1.getNumber() + " : " + factorial1.useFor());
//        System.out.println("Факториал числа " + factorial1.getNumber() + " : " + factorial1.useWhile());
//        System.out.println("Факториал числа " + factorial1.getNumber() + " : " + factorial1.useDoWhile());
//        System.out.println("-------------------------------------------------------------------------");
//
//        System.out.println("Факториал числа " + factorial2.getNumber() + " : " + factorial2.useFor());
//        System.out.println("Факториал числа " + factorial2.getNumber() + " : " + factorial2.useWhile());
//        System.out.println("Факториал числа " + factorial2.getNumber() + " : " + factorial2.useDoWhile());
//    }
    }
}
