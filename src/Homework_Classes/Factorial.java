package Homework_Classes;

public class Factorial {
    private int num;


    public Factorial() {
    }

    public Factorial(int num) {
        if (num >= 0) {
            this.num = num;
        } else {
            System.out.println("Вы ввели недопустимое значение!");
        }
    }

    public int useFor() {
        int fact = initiateFactorial();
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public int useWhile() {
        int fact = initiateFactorial();
        int i = 1;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        return fact;
    }

    public int useDoWhile() {
        int fact = initiateFactorial();
        int i = 1;
        do {
            fact = fact * i;
            i++;
        } while (i <= num);
        return fact;
    }

    private int initiateFactorial() {
        if (num == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public void setNumber(int num) {
        if (num > 0) {
            this.num = num;
        } else {
            System.out.println("Число не может быть отрицательным!");
            this.num = 0;
        }
    }

    public int getNumber() {
        return num;
    }
}
