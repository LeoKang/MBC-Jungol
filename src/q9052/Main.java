package q9052;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += sc.nextInt();
        }
        sc.close();

        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.1f\n", sum / 5.0);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int[] score = new int[5];
//        for (int i = 0; i < score.length; i++) {
//            score[i] = scan.nextInt();
//        }
//        scan.close();
//
////        for (int p : score) {
////            System.out.print(p + " ");
////        }
//
//        int sum = 0;
//        for (int p : score) {
//            sum += p;
//        }
//
//        System.out.println("총점 : " + sum);
//        System.out.printf("평균 : %.1f\n", (double)sum / score.length);
//    }
//}
