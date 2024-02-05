package Homework_Classes;

public class Factorial {
    private int num;

    public Factorial() {
    }

    public Factorial(int num) {
        if (num < 0) {
            System.out.println("Число не может быть отрицательным!");
        }
        this.num = num;
    }

    public int useFor() {
        if (num >= 0) {
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            return fact;
        }
        System.out.println("Вы ввели недопустимое значение!");
        return 0;

    }

    public int useWhile() {
        if (num >= 0) {
            int fact = 1;
            int i = 1;
            while (i <= num) {
                fact = fact * i;
                i++;
            }
            return fact;
        }
        System.out.println("Вы ввели недопустимое значение!");
        return 0;
    }

    public int useDoWhile() {
        if (num >= 0) {
            int fact = 1;
            int i = 1;
            do {
                fact = fact * i;
                i++;
            } while (i <= num);
            return fact;
        }
        System.out.println("Вы ввели недопустимое значение!");
        return 0;
    }

    public void setNumber(int num) {
        if (num < 0) {
            System.out.println("Число не может быть отрицательным!");
        }
        this.num = num;
    }

    public int getNumber() {
        return num;
    }
}
