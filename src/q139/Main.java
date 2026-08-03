package q139;

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        StringBuilder sb = new StringBuilder();
//
//        int start = sc.nextInt();
//        int end = sc.nextInt();
//        int step = (start > end) ? -1 : 1;
//
//        for (int i = 1; i <= 9; i++) {
//            for (int j = start; ; j += step) {
//                sb.append(String.format("%d * %d = %2d", j, i, j * i));
//
//                if (j == end) break;
//                sb.append("   ");
//            }
//            sb.append("\n");
//        }
//
//        System.out.print(sb.toString());
//        sc.close();
//    }
//}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();

        System.out.println(n1 + " " + n2);

        if (n1 > n2) {
            for (int i = 1; i <= 9; i++) {
                for (int j = n1; j >= n2; j--) {
                    System.out.printf("%d * %d = %2d   ", j, i, (j * i));
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= 9; i++) {
                for (int j = n1; j <= n2; j++) {
                    System.out.printf("%d * %d = %2d   ", j, i, (j * i));
                }
                System.out.println();
            }
        }
    }
}
