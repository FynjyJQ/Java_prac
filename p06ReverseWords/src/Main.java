import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static String reverseWords(String input) {
        String[] splitArr = input.split(" ");
        StringBuilder sb = new StringBuilder(input.length());

        Collections.reverse(Arrays.asList(splitArr));

        for (String str : splitArr  ) {
            sb.append(str);
            sb.append(' ');
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите исходную строку: ");
        input = scanner.nextLine();
        String reverse = reverseWords(input);
        System.out.println(reverse);
    }
}