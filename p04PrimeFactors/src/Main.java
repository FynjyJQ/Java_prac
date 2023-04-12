import java.lang.reflect.Array;
import java.util.*;

public class Main {
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    private static HashMap<Integer, Integer> primeFactors(int n) {
        if (n < 1)
            throw new IllegalArgumentException();
        
        HashMap<Integer, Integer> factors = new HashMap<Integer, Integer>();

        if (n == 1)
            return factors;

//        if (isPrime(n)) {
//            factors.put(n, 1);
//            return factors;
//        }

        int decr = n;
        for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    int count = 0;
                    while (decr % i == 0) {
                        count++;
                        decr /= i;
                    }
                    if (count != 0)
                        factors.put(i, count);
                }
        }
        return factors;
    }
    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Введите натуральное число: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n < 1) {
                    System.out.println("Число должно быть положительным");
                }
                else
                    break;
            }
            else {
                System.out.println("Некорректный ввод");
            }
        } while (true);

        HashMap<Integer, Integer> factors = primeFactors(n);

        if (factors.isEmpty()) {
            System.out.println("У числа нет простых множителей (число 1)");
        }
        else {
            Set<Integer> keys = factors.keySet();
            Integer[] keyArr = keys.toArray(new Integer[keys.size()]);
            Arrays.sort(keyArr);
            for (int key : keyArr) {
                System.out.printf("%d %d%n", key, factors.get(key));
            }
        }
    }
}