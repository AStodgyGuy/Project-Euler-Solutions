import java.lang.Math;

public class Problem9 {
    public static void main(String[] args) {
        for (int i = 400; i < 500; i++) {
            for(int j = 300; j < 400; j++) {
                for(int k = 200; k < 300; k++) {
                    if (i + j + k == 1000) {
                        if((Math.pow(k ,2) + Math.pow(j, 2)) == (Math.pow(i, 2))) {
                            System.out.println(i*j*k);
                        }
                    }
                }
            }
        }
    }
}