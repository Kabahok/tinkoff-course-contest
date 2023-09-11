package task4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();


        int[] list = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

        list[findIndexMin(list)] -= c*d;


        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static int findIndexMin(int[] list) {
        int min = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
                index = i;
            }
        }

        return index;

    }
}
