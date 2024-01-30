package _2024_01_24;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        int[] myList = {10, 0, 2, 9, 7, 7, 3, 8, 4, 5, 11};
        System.out.println("Сортировки по возрастанию " + Arrays.toString(sortMinMax(myList)));
        System.out.println("Сортировки по убыванию " + Arrays.toString(sortMaxMin(myList)));
    }

    public static int[] sortMinMax(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int max = array[0];
            int index = 0;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > max) {
                    max = array[j];
                    index = j;
                }
            }
                for (int k = index + 1; k < array.length - i; k++) {
                    array[k - 1] = array[k];
                }
            array[array.length - 1 - i] = max;
        }
        return array;
    }

    public static int[] sortMaxMin(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[0];
            int index = 0;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
                for (int k = index + 1; k < array.length - i; k++) {
                    array[k - 1] = array[k];
                }
                array[array.length - 1 - i] = min;
        }
        return array;
    }
}

