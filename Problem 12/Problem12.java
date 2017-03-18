public class Problem12 {

    private static final int MINIMUM_DIVISOR_COUNT = 500;
    public static void main(String[] args) {
        int triangularNumber = 1;
        int divisorCount = 0;
        int index = 1;

        while (divisorCount <= MINIMUM_DIVISOR_COUNT) {
            divisorCount = numberOfDivisors(triangularNumber);
            if (divisorCount < MINIMUM_DIVISOR_COUNT) {
                index++;
                triangularNumber += index;
            } else {
                break;
            }
        }

        System.out.println(triangularNumber);
    }

    private static int numberOfDivisors(int triangularNumber) {
        int divisorCount = 0;

        for (int i = 1; i <= Math.sqrt(triangularNumber); i++) {
            if(triangularNumber % i == 0) {
                divisorCount += 2;
            }
        }

        return divisorCount;
    }
}