package _24_01_22;

public class TaskNew {
    public static void main(String[] args) {
        long x = 1;
        int median = 14;
        System.out.println(1);
        for (int i = 2; i <= median; i++) {
            System.out.println(x + "1");
            x = x * 10;
            if (i == median) {
                x = x / 10;
                for (int j = median-1; j >= 2; j--) {
                    x = x / 10;
                    System.out.println(x + "1");
                }
            }
        }
        System.out.println(1);
    }
}
