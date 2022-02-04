package ua.starovoitov.hw3;
/**
 * Удалить из строки пробелы и определить, является ли она перевертышем
 * Считать строку из консоли. Передать в метод, который удалит из нее все пробелы.
 * После этого определить, является ли она палиндромом (перевертышем),
 * т.е. одинаково пишется как с начала, так и с конца.
 */

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.print("Enter a string (press Enter for exit): ");
            str = sc.nextLine();
            if (str.equals("")) break;
            System.out.println("String \"" + str + "\" without space: \"" +
                    deleteSpace(str) + "\" " + checkPalindrome(str) + "\n");
        }
//        "Я  арка края"
//        "Ад гонит иногда"
//        "А роза упала на лапу Азора"
    }

    /**
     * Deleting all spaces from string
     * @param s string
     * @return string without spaces
     */
    private static String deleteSpace(String s) {
        return s.replaceAll("( )+", "");
    }

    /**
     * checking string for palindrome
     * @param s sting
     * @return string with answer
     */
    private static String checkPalindrome(String s) {
        s = deleteSpace(s.toLowerCase(Locale.ROOT));
        for (int i = 0; i < (s.length() / 2); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return "is not palindrome";
            }
        }
        return "is palindrome";
    }
}
