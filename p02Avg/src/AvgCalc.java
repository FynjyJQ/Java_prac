import java.util.Arrays;

public class AvgCalc {
    public static double arithmeticMean(double[] nums)
    {
        double sum = Arrays.stream(nums).sum();
        return sum / nums.length;
    }

    public static double geometricMean(double[] nums)
    {
        for (double d : nums) {
            if (d <= 0.0 || !Double.isFinite(d))
                throw new IllegalArgumentException("Среднее геометрическое может быть вычислено только от положительных чисел");
        }

        double prod = 1.0;
        for (double d : nums) {
            prod *= d;
        }
        return Math.pow(prod, 1.0 / ((double)nums.length));
    }
}
