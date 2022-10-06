import java.util.Scanner;

public class bruteforce {
    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5 };
        pairsarray(num);

    }

    public static void pairsarray(int num[]) {

        int s = 0, e = 0;
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i <= num.length - 1; i++) {
            s = i;
            for (int j = i; j <= num.length - 1; j++) {
                e = j;
                currsum = 0;
                for (int k = s; k <= e; k++) {
                    currsum += num[k];
                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
          
        }
        System.out.println("max sum is = " + maxsum);
    }

}
