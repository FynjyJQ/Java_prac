import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import java.util.Scanner;

public class Main {
    public static int arithmeticProgressionMember(int first, int d, int n) {
        return first + d * n;
    }

    public static int input(String msg) {
        int result;
        do {
            System.out.print(msg);
            Scanner scanner = new Scanner(System.in);

            if (scanner.hasNextInt()) {
                result = scanner.nextInt();
                return result;
            }
            else {
                System.out.println("Некорректный ввод");
            }
        } while (true);
    }

    public static void main(String[] args) {
        int first = input("Первый член арифметической прогрессии: ");
        int d = input("Разность арифметической прогрессии: ");
        int n;
        do {
            n = input("Номер члена прогрессии: ");
            if (n < 0)
                System.out.println("Номер не должен быь отрицательным");
        } while (n < 0);

        int num = arithmeticProgressionMember(first, d, n);

        System.out.println(num);
    }
}