package q111;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (count < 4) {
            sum += sc.nextInt();
            count++;
        }

        System.out.println("sum " + sum + "\navg " + (sum / 4));
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] score = new int[4];
//        for (int i = 0; i < score.length; i++) {
//            score[i] = sc.nextInt();
//        }
//        sc.close();
//
//        int sum = 0;
//        for (int p : score) {
////            System.out.print(p + " ");
//            sum += p;
//        }
//        System.out.println("sum " + sum);
////        System.out.printf("avg %.0f\n", (double) sum / score.length);
//        System.out.println("avg " + (sum / score.length));
//    }
//}
