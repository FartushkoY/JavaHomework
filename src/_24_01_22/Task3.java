package _24_01_22;

public class Task3 {
    public static void main(String[] args) {
        long x = 1;
        System.out.println(1);
        for (int i = 2; i <= 25; i++) {
            System.out.println(x + "1");
            x = x * 10;
            if (i == 14) {
                x = x / 10;
                for (i = 13; i <= 24; i++) {
                    x = x / 10;
                    System.out.println(x + "1");
                }
            }
        }
        System.out.println(1);
    }
}