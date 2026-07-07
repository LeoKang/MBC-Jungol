package q9086;

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        StringBuilder sb = new StringBuilder();
//
//        System.out.print("세과목의 점수를 입력하세요. ");
//        int[] arr = new int[3];
//        for (int i = 0; i < 3; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        double avg = findAverage(arr[0], arr[1], arr[2]);
//
//        sb.append("평균 : ").append(String.format("%.2f", avg));
//
//        System.out.println(sb.toString());
//        sc.close();
//    }
//
//    public static double findAverage(int... scores) {
//        int total = 0;
//        for (int score : scores) {
//            total += score;
//        }
//        return (double) total / scores.length;
//    }
//}

public class Main {
    public static double getAvg(int[] p) {
        int sum = 0;
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i] + " ");
            sum += p[i];
        }

        return sum / (double) p.length;
    }

    public static void main(String[] args) {
        System.out.print("세과목의 점수를 입력하세요. ");
        Scanner sc = new Scanner(System.in);
        int[] inp = new int[3];
        for (int i = 0; i < inp.length; i++) {
            inp[i] = sc.nextInt();
        }
        sc.close();

        System.out.printf("평균 : %.2f\n", getAvg(inp));
    }
}
