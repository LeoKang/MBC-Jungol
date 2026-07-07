package q9068;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[100];
        int i = 0;
        for (; i < ar.length; i++) {
            ar[i] = scan.nextInt();
            if (ar[i] == 0) break;
        }
        scan.close();

        for (int j = 0; j < i; j++) {
            if (j % 2 == 1) {
                System.out.print(ar[j] + " ");
            }
        }
    }
}
