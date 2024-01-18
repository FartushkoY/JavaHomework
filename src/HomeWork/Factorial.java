package HomeWork;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        System.out.println(useFor(a));
        System.out.println(useWhile(a));
        System.out.println(useDoWhile(a));
    }

    public static int useFor(int a) {
        int fact1 = 1;
        for (int i = 1; i <= a; i++) {
            fact1 = fact1 * i;
        }
        return fact1;
    }

    public static int useWhile(int a) {
        int fact2 = 1;
        int num = 1;
        while (num <= a){
            fact2 = fact2 * num;
            num ++;
        }
        return fact2;
    }

    public static int useDoWhile(int a) {
     int fact3 = 1;
     int num = 1;
     do {
         fact3 = fact3 * num;
         num ++;
     }while (num <= a);
     return fact3;
    }


}
