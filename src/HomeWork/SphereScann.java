package HomeWork;

import java.util.Scanner;

public class SphereScann {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус сферы R:");
        double r = scanner.nextDouble();
        double s = 4 * Math.PI * Math.pow(r, 2);
        System.out.println("Площадь сферы S = " + s);
    }
}
