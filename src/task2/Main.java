package task2;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String p = sc.nextLine();

        System.out.println(p);
        int[] charCount = new int[123];

        for (int i = 0; i < n; i++) {
            char c = p.charAt(i);
            System.out.println(c);
            charCount[c]++;
        }


        Arrays.sort(charCount);

        System.out.println(Arrays.toString(charCount));

        int[] noNull = Arrays.stream(charCount).filter(x -> x != 0).toArray();
        System.out.println(Arrays.toString(noNull));
        for (int i = 0; i < noNull.length; i++) {
            if (k - noNull[i] >= 0) {
                k -= noNull[i];
                noNull[i] = 0;
            }
        }


        System.out.println(Arrays.stream(noNull).filter(x -> x != 0).count());
    }
}
