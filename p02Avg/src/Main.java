import java.text.DecimalFormat;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int size;
        do {
            System.out.print("Размер массива: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt())
            {
                size = scanner.nextInt();
                if (size > 0)
                    break;
            }
            System.out.println("Некорректный ввод");
        } while (true);

        double[] nums = new double[size];

        for (int i = 0; i < nums.length; i++) {
            do {
                System.out.printf("%d-й элемент массива: ", i + 1);
                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextDouble()) {
                    nums[i] = scanner.nextDouble();
                    break;
                }
                System.out.println("Некорректный ввод");
            } while (true);
        }

        double aMean, gMean;
        aMean = AvgCalc.arithmeticMean(nums);
        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println("Среднее арифметическое и среднее геометрическое чисел: ");
        System.out.printf(df.format(aMean) + ' ');
        try {
            gMean = AvgCalc.geometricMean(nums);
            System.out.printf(df.format(gMean));
        }
        catch (IllegalArgumentException ex) { }
    }
}