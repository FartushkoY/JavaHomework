package org.example.Homework_Classes;

public class Factorial {
    private int num;

    public Factorial() {
    }

   public Factorial(int num) {
       this.num = num;
   }

    public int useFor() {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public int useWhile() {
        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        return fact;
    }

    public int useDoWhile() {
        int fact = 1;
        int i = 1;
        do {
            fact = fact * i;
            i++;
        } while (i <= num);
        return fact;
    }

    public void setNumber(int num) {
        if (num > 0) {
            this.num = num;
        } else {
            System.out.println("Число не может быть отрицательным!");
            this.num = -111;
        }
    }

    public int getNumber() {
        return num;
    }
}
