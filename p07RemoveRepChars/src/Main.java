import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String removeRepChars(String str) {
        ArrayList<Character> symbols = new ArrayList<>();
        ArrayList<Character> repeating = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //
            if (repeating.contains(c)) {
                continue;
            }
            else if (symbols.contains(c)) {
                repeating.add(c);
            }
            else {
                symbols.add(c);
            }
        }

        String newString = String.copyValueOf(str.toCharArray());
        for (char c : repeating) {
            newString = newString.replace(Character.toString(c), "");
        }
        return newString;
    }
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        input = scanner.nextLine();

        String removedDuplicates = removeRepChars(input);
        System.out.println(removedDuplicates);
    }
}