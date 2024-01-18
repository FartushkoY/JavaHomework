package HomeWork;

import java.util.Scanner;

public class CubeScann {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону куба а: ");
        double a = scanner.nextDouble();
        double v = Math.pow(a, 3);
        System.out.println("Объем куба V=" + v);
    }
}
