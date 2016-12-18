public class Problem5 {
    public static void main(String[] args) {

        long target = 10000000000000L;

        for (int i = 2520; i < target; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i % j == 0) {
                    if (j == 20) {
                        System.out.println(i);
                        System.exit(0); //once found, exit program
                    }

                } else {
                    break;
                }
            }
        }
    }
}