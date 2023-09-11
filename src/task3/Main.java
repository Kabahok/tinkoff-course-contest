package task3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int m = sc.nextInt();

        int[] list = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < m; i ++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            int[] otrezok = Arrays.copyOfRange(list, x, y + 1);

            if ((otrezok.length == 2 && otrezok[0] > otrezok[1])) {
                System.out.println("YES");
            } else if (otrezok.length == 1) {
                System.out.println("YES");
            }
            else if (otrezok.length != 0) {
                int maxNum = Arrays.stream(otrezok).max().getAsInt();
                int indexMaxNum = checkIndex(otrezok, maxNum);
                if (otrezok[0] == maxNum && otrezok.length != 1 && otrezok[otrezok.length - 1] == Arrays.stream(otrezok).min().getAsInt()) {

                        System.out.println("YES");

                } else if (otrezok[0] == maxNum || otrezok[otrezok.length - 1] == maxNum) {
                    System.out.println("NO");
                } else {
                    int[] left = Arrays.copyOfRange(otrezok, 0, indexMaxNum + 1);
                    int[] right = Arrays.copyOfRange(otrezok, indexMaxNum, otrezok.length);
                    if (Arrays.stream(left).min().getAsInt() == left[0] && Arrays.stream(right).min().getAsInt() == right[right.length - 1]) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }

    public static int checkIndex(int[] list, int num) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == num) return i;
        }
        return -1;
    }

}
