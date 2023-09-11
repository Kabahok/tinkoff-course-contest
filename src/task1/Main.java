package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();

        int indexServer = s;
        boolean flag = true;
        int[] servers = new int[s+1];
        int countData = 0;

//      s = 41
//      [0, 0, 0, 0, 0]


        while (flag) {
            if (n >= indexServer) {
                n = n - indexServer;
                if ((indexServer + 1) >= servers.length) {
                    indexServer = 1;
                } else {
                    indexServer += 1;
                }
            } else {
                countData = n;
                flag = false;
            }
        }

        System.out.println(countData);
    }
}
