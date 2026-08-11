package beginner.q12422;

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        while (sc.hasNextInt()) {
//            int A = sc.nextInt();
//            int B = sc.nextInt();
//
//            while (A < 2 || A > 9 || B < 2 || B > 9) {
//                System.out.println("INPUT ERROR!");
//                A = sc.nextInt();
//                B = sc.nextInt();
//            }
//
//            int step = (A <= B) ? 1 : -1;
//            for (int dan = A; dan != B + step; dan += step) {
//                for (int i = 1; i <= 9; i++) {
//                    System.out.println(dan + " * " + i + " = " + (dan * i));
//                }
//                if (dan != B) {
//                    System.out.println();
//                }
//            }
//        }
//    }
//}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int a, b;
        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();

            if (a >= 2 && a <= 9 && b >= 2 && b <= 9) {
                break;
            }
            sb.append("INPUT ERROR!\n");
        }

        int step = (a > b) ? -1 : 1;

        for (int i = a; ; i += step) {
            for (int j = 1; j <= 9; j++) {
                sb.append(i).append(" * ").append(j).append(" = ").append(i * j).append("\n");
            }
            if (i == b) break;
            sb.append("\n");
        }

        System.out.print(sb.toString());
        sc.close();
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int A = 0, B = 0;
//        do {
//            A = input.nextInt();
//            B = input.nextInt();
//
//            if (2 <= A && A <= 9 && 2 <= B && B <= 9) {
//                break;
//            } else {
//                System.out.println("INPUT ERROR!");
//            }
//        } while (true);
//
//        System.out.println(A + " " + B);
////        int m = (A < B) ? 1 : -1;
//
//        if (A < B) {
//            for (int i = A; i <= B; i++) {
//                for (int j = 1; j <= 9; j++) {
//                    System.out.printf("%d * %d = %d\n", i, j, i * j);
//                }
//                System.out.println();
//            }
//        } else {
//            for (int i = A; i >= B; i--) {
//                for (int j = 1; j <= 9; j++) {
//                    System.out.printf("%d * %d = %d\n", i, j, i * j);
//                }
//                System.out.println();
//            }
//        }
//    }
//}
