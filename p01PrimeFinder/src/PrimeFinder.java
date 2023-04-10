import java.util.ArrayList;

public class PrimeFinder {
    public static boolean isPrime(int num) {
        if (num  <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    public static ArrayList<Integer> getPrimes(int lower, int upper) {
        if (lower > upper)
            throw new IllegalArgumentException("Нижняя граница должна быть не больше верхней");

        if (lower < 1)
            lower = 1;

        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = lower; i <= upper; i++) {
            if (isPrime(i))
                primes.add(i);
        }
        return primes;
    }
}
