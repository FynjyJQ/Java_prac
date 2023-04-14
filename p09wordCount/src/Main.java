import java.util.Scanner;

public class Main {
    public static int wordCount(String str, String word) {
        if (word.length() > str.length()) return 0;
        int count = 0;
        for (int i = 0; i <= str.length() - word.length(); i++) {
            if (str.substring(i, i + word.length()).equals(word))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.print("Введите исходную строку: ");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.print("Введите слово для поиска: ");
        String word = s.nextLine();
        System.out.println(wordCount(input, word));
    }
}