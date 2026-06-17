package q9067;

import java.util.*;

public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int[] targets = new int[3];
//
//        for (int i = 0; i < 10; i++) {
//            int input = sc.nextInt();
//
//            if (i == 2) targets[0] = input;
//            else if (i == 4) targets[1] = input;
//            else if (i == 9) targets[2] = input;
//        }
//        sc.close();
//
//        System.out.printf("%d %d %d\n", targets[0], targets[1], targets[2]);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[10];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
            sc.close();
        }

//        for (int n : ar) {
//            System.out.print(n + " ");
//        }

        System.out.print(ar[2] + " ");
        System.out.print(ar[4] + " ");
        System.out.print(ar[ar.length - 1]);
    }
}