package _2024_01_29;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        String string0 = "Hello world!";
        String string1 = "ABCDE12345";
        String string2 = "hododkxd";
        String string3 = "hodod";
        String string4 = "hfnfksNwnblKwbmDwyg";
        System.out.println(getThreeStrings("Hello world"));
        System.out.println(getThreeStringsJoin(string0));
        System.out.println(getFirstMiddleLast(string0));
        System.out.println(getStringChange(string1));
        System.out.println(replaceNumbers(string1));
        System.out.println(Arrays.toString(getWanted(string2)));
        System.out.println(shouEveryThird(string0));
        System.out.println(serchElem(string0));
        System.out.println(serchElem(string3));
        System.out.println(findElemBefore(string4));

    }

    public static String getThreeStrings(String string) {
        String string5 = string + ", " + string + ", " + string;
        return string5;
    }

    public static String getThreeStringsJoin(String string) {
        String string5 = String.join(", ", string, string, string);
        return string5;
    }

    public static String getFirstMiddleLast(String string) {
        char[] chars = string.toCharArray();
        char firt = chars[0];
        char last = chars[chars.length - 1];
        if (chars.length % 2 != 0) {
            char middle = chars[chars.length / 2];
            String result = new String(new char[]{firt, middle, last});
            return result;
        }
        String result = new String(new char[]{firt, last});
        return result;
    }

    public static String getStringChange(String string) {
        char[] chars = string.toCharArray();
        char[] charsTemp = Arrays.copyOf(chars, chars.length);
        int temp = 1;
        for (int i = 0; i < chars.length / 2; i++) {
            chars[i + temp] = charsTemp[i];
            temp = temp + 1;
        }
        temp = 1;
        for (int i = chars.length - 1; i >= chars.length / 2; i--) {
            chars[i - temp] = charsTemp[i];
            temp = temp + 1;
        }
        String stringNew = String.valueOf(chars);
        return stringNew;
    }

    public static String replaceNumbers(String string) {
        StringBuilder builder = new StringBuilder();
        String numbers = string.substring(string.length() / 2);
        int index = 0;
        for (int i = 0; i < string.length(); i++) {
            if (i % 2 == 0) {
                builder.append(numbers.charAt(index));
            } else {
                builder.append(string.charAt(index));
                index++;
            }
        }
        return builder.toString();
    }


    public static int[] getWanted(String string) {
        char wanted = string.charAt(string.length() - 1);
        char[] chars = string.toCharArray();
        int[] indexes = new int[chars.length];
        int ind = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == wanted) {
                indexes[ind] = i;
                ind = ind + 1;
            }
        }
        return Arrays.copyOf(indexes, ind);
    }

    public static String shouEveryThird(String string) {
        char[] chars = string.toCharArray();
        StringBuilder third = new StringBuilder();
        for (int i = 0; i < string.length(); i = i + 3) {
            if (i % 3 == 0 && i != 0) {
                third.append(chars[i]);
            }
        }
        return third.toString();
    }

    public static String serchElem(String string) {
        StringBuilder elems = new StringBuilder();
        if (string.length() > 5) {
            elems.append(string.substring(0, 3));
            elems.append(string.substring(string.length() - 3, string.length()));
            return elems.toString();
        } else {
            for (int i = 0; i < string.length(); i++) {
                elems.append(string.substring(0, 1));
            }
            return elems.toString();
        }
    }

    public static String findElemBefore(String string) {
        char[] chars = string.toCharArray();
        StringBuilder sb = new StringBuilder(string);
        StringBuilder beforeElem1 = new StringBuilder();
        StringBuilder beforeElem2 = new StringBuilder();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'x' && i != 0) {
                beforeElem1.append(sb.substring(i - 1, i));
                count1++;
            }else if (chars[i] == 'w' && i != 0) {
                beforeElem2.append(sb.substring(i - 1, i));
                count2++;
            }
        }
        if (count1 == 0) {
            beforeElem1.append("Элемент x не найден. ");
        } else
            beforeElem1.append(" встречается перед элементом х. ");
        if (count2 == 0) {
            beforeElem2.append("Элемент w не найден. ");
        } else
            beforeElem2.append(" встречается перед элементом w . ");
        return (beforeElem1.append(" ").append(beforeElem2)).toString();
    }
}
