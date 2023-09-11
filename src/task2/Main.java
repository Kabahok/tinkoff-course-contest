package task2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String p = sc.nextLine();

        int[] charCount = new int[123];

        for (int i = 0; i < n; i++) {
            char c = p.charAt(i);
            charCount[c]++;
        }


        Arrays.sort(charCount);

        int[] noNull = Arrays.stream(charCount).filter(x -> x != 0).toArray();
        for (int i = 0; i < noNull.length; i++) {
            if (k - noNull[i] >= 0) {
                k -= noNull[i];
                noNull[i] = 0;
            }
        }


        System.out.println(Arrays.stream(noNull).filter(x -> x != 0).count());
    }
}
