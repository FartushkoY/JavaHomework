package HomeWork;

import java.util.Scanner;

public class TrapezeScann {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стороны трапеции:");
        System.out.println("a");
        double a = scanner.nextDouble();
        System.out.println("b");
        double b = scanner.nextDouble();
        System.out.println("c");
        double c = scanner.nextDouble();
        System.out.println("d");
        double d = scanner.nextDouble();
        double p = a + b + c + d;
        System.out.println("Периметр трапеции Р=" + p);
    }
}
