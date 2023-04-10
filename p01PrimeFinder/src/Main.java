import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int lower, upper;

        do {
            System.out.print("Нижняя граница диапазона: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                lower = scanner.nextInt();
                break;
            }
            System.out.println("Некорректный ввод");
        } while (true);
        do {
            System.out.print("Верхняя граница диапазона: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                upper = scanner.nextInt();
                break;
            }
            System.out.println("Некорректный ввод");
        } while (true);

        try
        {
            ArrayList<Integer> primes = PrimeFinder.getPrimes(lower, upper);
            for (int prime : primes) {
                System.out.println(prime);
            }
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println("Ошибка: " + ex.getMessage());
        }
    }
}