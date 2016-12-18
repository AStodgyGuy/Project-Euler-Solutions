public class Problem10 {
    public static void main(String[] args) {
        long sum = 2;
        double n;

        for (int i = 3; i < 2000000; i++) {
            n = Math.sqrt((double)i);
            if(isPrime(n, i)){
                sum += i;
            }
        }
        System.out.println(sum); 
    }

    public static boolean isPrime(double n, int i) {
        for (int j = 2; j <= n; j++) {
            if (i % j == 0){ 
                return false;
            }
        }
        return true;
    }
}