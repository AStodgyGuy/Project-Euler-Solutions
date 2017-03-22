import java.lang.Math;

public class Problem3 {
    public static void main(String[] args) {
        long target = 600851475143L;
        for (int i = 2; i < Math.sqrt(target); i++) {
            if (target % i == 0) {
                if (isPrime(i)) {
                    System.out.println(i + " Is a prime factor");
                }
            }
        }
    }
    
    public static boolean isPrime(int n) {
        for(int i = 2 ; i < n; i++) {
            if(n % i == 0) {
                return false;
            }     
        }
        return true;
    }
}