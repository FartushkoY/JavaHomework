package _2024_01_29;

import java.util.Scanner;

public class TaskString {
    public static void main(String[] args) {
        System.out.println("Введите строку из нескольких слов");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(getWord(string.toString()));

    }
    public static StringBuilder getWord(String string) {
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        StringBuilder result = new StringBuilder();
        int indSpace = sb.indexOf(" ");
        for (int i = 0; i < string.length() - 1; i++) {
            int counter = 0;
            for (int j = 0; j < indSpace; j++) {
                if (string.charAt(j) == string.charAt(j + 1)) {
                    counter++;
                }
            }
            if (counter == 0) {
                return result.append(sb.substring(0, indSpace));
            } else {
                sb.delete(0, indSpace + 1);
                indSpace = (sb.toString()).indexOf(" ");
            }
        }
        return result;
    }
}
