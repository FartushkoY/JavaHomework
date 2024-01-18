package HomeWork;

import java.util.Scanner;

public class TriangleScann {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону треугольника а ");
        double a = scanner.nextDouble();
        System.out.println("Введите высоту, проведенную к стороне а");
        double h = scanner.nextDouble();
        double s = 0.5 * a * h;
        System.out.println("Площадь треугольнка S = " + s);
    }
}
