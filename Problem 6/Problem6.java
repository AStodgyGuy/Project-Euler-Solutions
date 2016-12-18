import java.lang.Math;

public class Problem6 {
    public static void main(String[] args) {
        long sumOfSquares = 0L;
        long squareOfSums = 0L;
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
            sumOfSquares += ((long)Math.pow(i,2));
        }

        squareOfSums = ((long)Math.pow(sum, 2));

        System.out.println(squareOfSums - sumOfSquares);

    }

}