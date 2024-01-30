package _2024_01_29;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        String string = "Hello world!";
        String string1 = "ABCDE12345";
        System.out.println(getThreeStrings("Hello world"));
        System.out.println(getThreeStringsJoin(string));
        System.out.println(getFirstMiddleLast(string));
        System.out.println(getStringChange(string1));

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
            String result = new String(new char[] {firt, middle, last});
            return result;
        }
        String result = new String(new char[] {firt, last});
        return result;
    }

    public static String getStringChange(String string) {
        char[] chars = string.toCharArray();
        char[] charsTemp = new char[chars.length];
        charsTemp = Arrays.copyOf(chars, chars.length);
        int temp = 1;
        for (int i = 0; i < chars.length / 2; i++) {
            chars[i+temp] = charsTemp[i];
            temp = temp + 1;
        }
        temp = 1;
        for (int i = chars.length-1; i >= chars.length / 2; i--) {
            chars[i-temp] = charsTemp[i];
            temp = temp + 1;
        }
        String stringNew = String.valueOf(chars);
    return stringNew;
    }
}
