package _24_01_22;

public class Task {
    public static void main(String[] args) {
//        Напишите программу, которая выводит на экран числа от 1 до 100. При этом вместо чисел, кратных трем, программа должна
//        выводить слово Fizz, а вместо чисел, кратных пяти — слово Buzz. Если число кратно пятнадцати, то программа должна выводить слово FizzBuzz
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz, ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz, ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz, ");
            } else
                System.out.print(i + ", ");

        }


    }


}


