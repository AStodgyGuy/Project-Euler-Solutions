public class Problem7 {
    public static void main(String[] args) {
        int counter  = 1;
        int  i = 2;

        do {
            i++;
            if (isPrime(i)) {
                counter++;
                if(counter == 10001) {
                    System.out.println(i);
                }
            }
        } while (counter < 10001);
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