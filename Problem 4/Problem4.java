import java.util.ArrayList;

public class Problem4 {
    public static void main(String[] args) {
        int temp = 0;

        for (int i = 900; i <= 999; i++) {
            for (int j = 900; j <= 999; j++) {
                temp = i * j;
                if (isPalindrome(temp)) {
                    System.out.println(temp);
                }
            }
        }
    }

    public static boolean isPalindrome(int n) {
        ArrayList<Integer> numberList = new ArrayList<>();

        //put the multiplied number into an array list
        while (n > 0) {
            numberList.add(n % 10);
            n /= 10;
        }

        //check if the number is a palindrome
        for (int i = 0; i < numberList.size() / 2; i++) {
            if (!(numberList.get(i) == numberList.get(numberList.size() - 1 - i ))) {
                return false;
            }
        }

        return true;
    }
}