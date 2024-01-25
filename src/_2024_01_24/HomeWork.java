package _2024_01_24;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        int[] myList = {5, 24, 15, -10, 0, 12, 55, -4, 35, -43, 75};
        System.out.println("Сортировки по возрастанию " + Arrays.toString(sortMinMax(myList)));
        System.out.println("Сортировки по убыванию " + Arrays.toString(sortMaxMin(myList)));
    }

    public static int[] sortMinMax(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int max = array[0];
            int index = 0;
            for (int j = 0 + i; j < array.length - i; j++) {
                if (array[j] > max) {
                    max = array[j];
                    index = j;
                }

            }
            if (index != array.length) {
                for (int k = index + 1; k < array.length - i; k++) {
                    array[k - 1] = array[k];
                }
            }
            array[array.length - 1 - i] = max;
        }
        return array;
    }

    public static int[] sortMaxMin(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int min = array[0];
            int index = 0;
            for (int j = 0 + i; j < array.length - i; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }

            }
            if (index != array.length) {
                for (int k = index + 1; k < array.length - i; k++) {
                    array[k - 1] = array[k];
                }
            }
            array[array.length - 1 - i] = min;
        }
        return array;
    }
}

