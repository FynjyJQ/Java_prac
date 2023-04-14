import java.util.Scanner;

public class Main {
    public static String removeChar(String str, char c) {
        StringBuilder sb = new StringBuilder(str);
        while (sb.indexOf(Character.toString(c)) != -1) {
            sb.deleteCharAt(sb.indexOf(Character.toString(c)));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите исходную строку: ");
        String str = scanner.nextLine();
        System.out.print("Символ, который нужно удалить: ");
        char c = scanner.next().charAt(0);

        String removed = removeChar(str, c);
        System.out.println(removed);
    }
}