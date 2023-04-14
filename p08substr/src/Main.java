import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String[] substrings(String str) {
        String[] strArr = new String[str.length() * (str.length() + 1) / 2];
        int i = 0;
        for (int j = 0; j < str.length(); j++) {
            for (int k = j + 1; k <= str.length(); k++) {
                strArr[i++] = str.substring(j, k);
            }
        }
        return strArr;
    }

    public static ArrayList<String> palindromeSubstrings(String[] strings) {
        ArrayList<String> palindromes =
                new ArrayList<>(
                Arrays.stream(strings).filter(s -> isPalindrome(s)).sorted().toList());
        return palindromes;
    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) return true;
        for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] subs = substrings(input);
        ArrayList<String> palindromes = palindromeSubstrings(subs);
        for (String str : palindromes) System.out.println(str);
    }
}