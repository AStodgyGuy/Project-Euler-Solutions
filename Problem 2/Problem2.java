public class Problem2 {
    public static void main(String[] args) {
        int temp = 0;
        int sum = 0;

        for (int i = 1; temp < 4000000;) {
            for (int j = 2; temp < 4000000;) {
                temp = i + j;
                i = j;
                j = temp;
                
                if (temp % 2 == 0) {
                    sum += temp;
                }
                
            }
        }
        //since starting at 2, add two at the end
        System.out.println(sum + 2);
    }
}