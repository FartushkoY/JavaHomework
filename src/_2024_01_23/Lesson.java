package _2024_01_23;

import java.util.Arrays;

public class Lesson {
    public static void main(String[] args) {
        int[] myList = {1, -1, 5, 7, -8};
        System.out.println("Наибольшее значение:" + getMaxNumber(myList));
        System.out.println("Наибольшее значение с четным индексом:" + getMaxEven(myList));
        System.out.println("Сумма положительных четных элементов:" + getPlusSum(myList));
        System.out.println("Среднее арифметическое:" + getMediumNumber(myList));
        System.out.println("Массив с элементами меньше среднего арифметического:" + Arrays.toString(getLessMedium(myList)));
        System.out.println("Минимальные элементы массива" + Arrays.toString(getTwooLess(myList)));
        System.out.println("Минимальные элементы массива" + Arrays.toString(getTwooLessNew(myList)));
        System.out.println("Сумма модулей элементов массива: " + getSumAbs(myList));
        System.out.println("Номер минимального по модулю элемента массива: " + getIndexMin(myList));
        System.out.println("Новый массив " + Arrays.toString(getChange(myList)));
    }

    public static int getMaxNumber(int[] myList) {
        int max = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }
        return max;
    }

    public static int getMaxEven(int[] myList) {
        int max = myList[0];
        for (int i = 0; i < myList.length; i = i + 2) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }
        return max;

    }

    public static int getPlusSum(int[] myList) {
        int sum = 0;
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > 0 && myList[i] % 2 == 0) {
                sum += myList[i];
            }
        }
        return sum;

    }

    public static double getMediumNumber(int[] myList) {
        double sum = 0;
        for (int i = 0; i < myList.length; i++) {
            sum += myList[i];
        }
        double medium = sum / myList.length;
        return medium;
    }

    public static int[] getLessMedium(int[] myList) {
        int[] lessMedium = new int[myList.length];
        int counter = 0;
        for (int j = 0; j < myList.length; j++) {
            if (myList[j] < getMediumNumber(myList)) {
                lessMedium[counter] = myList[j];
                counter = counter + 1;
            }
        }
        int[] result = Arrays.copyOf(lessMedium, counter);
        return result;
    }

    public static int[] getTwooLess(int[] myList) {
        int[] twooLess = new int[2];
        int min1 = myList[0];
        int min2 = Integer.MAX_VALUE;
        int indMin = 0;

        for (int i = 0; i < myList.length; i++) {
            if (myList[i] < min1) {
                min1 = myList[i];
                indMin = i;
            }
        }
        for (int j = 0; j < myList.length; j++) {
            if (myList[j] <= min2 && j != indMin) {
                min2 = myList[j];
            }
        }
        twooLess[0] = min1;
        twooLess[1] = min2;
        return twooLess;
    }

    public static int[] getTwooLessNew(int[] myList) {
        int[] twooLess = new int[2];
        int min1 = myList[0];
        int min2;
        int indMin = 0;
        int indMin2;
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] < min1) {
                min1 = myList[i];
                indMin = i;
            }
        }
        if (indMin > 0) {
            min2 = myList[indMin - 1];
        } else min2 = myList[indMin + 1];
        for (int j = 0; j < myList.length; j++) {
            if (myList[j] <= min2 && j != indMin) {
                min2 = myList[j];
            }
        }
        twooLess[0] = min1;
        twooLess[1] = min2;
        return twooLess;
    }



    public static int getSumAbs(int[] myList) {
        int sumAbs = 0;
        for (int i = 0; i < myList.length; i++) {
            sumAbs = sumAbs + Math.abs(myList[i]);
        }
        return sumAbs;
    }

    public static int getIndexMin(int[] myList) {
        int number = 0;
        int min = Math.abs(myList[0]);
        for (int i = 0; i < myList.length; i++) {
            if (Math.abs(myList[i]) < min) {
                min = Math.abs(myList[i]);
                number = i;
            }
        }
        return number;
    }

//    Найти минимальный и максимальный элемент массива, и поменять их местами

    public static int[] getChange(int[] myList) {
//        int[] newList = new int [myList.length];
        int max = myList[0];
        int min = myList[0];
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] < min) {
                min = myList[i];
                indexMin = i;
            }
            if (myList[i] > max) {
                max = myList[i];
                indexMax = i;
            }
        }
        myList[indexMin] = max;
        myList[indexMax] = min;
        return myList;

    }
}


