package ua.starovoitov.hw3;
/**
 * Количество слов в строке
 * Вводится строка, состоящая из слов, разделенных пробелами.
 * Требуется посчитать количество слов в ней.
 */
// for commit
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String string;
        while (true){
            System.out.print("Enter a string (press Enter for exit): ");
            string = sc.nextLine();
            if (string.equals("")) break;
            System.out.println("in string: \"" + string + "\" ... " + countWords(string) + " words");
        }
    }

    /**
     *  returns the number of words in a sentence
     * @param string
     * @return number of words
     */
    private static int countWords(String string) {
        string = string.trim().replaceAll("( )+", " ");
        int count = 0;
        if(string.length() > 0) {
            for (char ch : string.toCharArray()) {
                if (ch == ' ') {
                    count++;
                }
            }
            count++;
        }
        return count;
    }
}
