package q9023;

import java.util.Scanner;

public class Main {
    static class CompareBox {
        public int a;
        public int b;
        public int c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CompareBox box = new CompareBox();
        box.a = sc.nextInt();
        box.b = sc.nextInt();
        box.c = sc.nextInt();

        int eq1 = (box.a == box.b) ? 1 : 0;
        int eq2 = (box.b == box.c) ? 1 : 0;
        int neq1 = (box.a != box.b) ? 1 : 0;
        int neq2 = (box.b != box.c) ? 1 : 0;

        System.out.printf("%d %d %d %d\n", eq1, eq2, neq1, neq2);

        sc.close();
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        sc.close();
//
//        System.out.println(a + " " + b + " " + c);
//
//        if (a == b) {
//            System.out.print("1 ");
//        } else {
//            System.out.print("0 ");
//        }
//        if (b == c) {
//            System.out.print("1 ");
//        } else {
//            System.out.print("0 ");
//        }
//        if (a != b) {
//            System.out.print("1 ");
//        } else {
//            System.out.print("0 ");
//        }
//        if (b != c) {
//            System.out.print("1 ");
//        } else {
//            System.out.print("0 ");
//        }
//    }
//}
