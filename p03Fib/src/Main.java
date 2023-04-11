import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static int fib(int n) {
        if (n < 1)
            throw new IllegalArgumentException("Некорректное значение номера");

        if (n < 3)
            return 1;

        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {

        int n;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите номер n члена ряда (n > 0): ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n < 1) {
                    System.out.println("Число должно быть больше нуля");
                }
                else {
                    break;
                }
            }
            else {
                System.out.println("Некорректный ввод");
            }
        } while (true);

        int f = fib(n);

        System.out.println(f);
    }
}