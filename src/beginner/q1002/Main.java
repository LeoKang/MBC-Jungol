package beginner.q1002;

import java.util.Scanner;

// 이명휘 님
public class Main {
    static class MathPoint {
        public long gcd;
        public long lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        MathPoint state = new MathPoint();

        long first = sc.nextLong();
        state.gcd = first;
        state.lcm = first;

        for (int i = 1; i < n; i++) {
            long next = sc.nextLong();

            state.lcm = (state.lcm / getGcd(state.lcm, next)) * next;

            state.gcd = getGcd(state.gcd, next);
        }

        System.out.println(state.gcd + " " + state.lcm);

        sc.close();
    }

    private static long getGcd(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}



/*
3
78 39 104

res
13 312

 */

//import java.util.Scanner;
//
//public class Main {
//    public static int gcd(int p, int q) {
//        if (q == 0) return p;
//        return gcd(q, p % q);
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int N = input.nextInt();
//        int[] ar = new int[N];
//        for (int i = 0; i < N; i++) {
//            ar[i] = input.nextInt();
//        }
//        input.close();
//
//        // print
////        for (int i = 0; i < N; i++) {
////            System.out.print(ar[i] + " ");
////        }
//
//        // gcd
//        int gcdRes = ar[0];
//        for (int i = 1; i < N; i++) {
//            gcdRes = gcd(gcdRes, ar[i]);
//        }
//
//        System.out.print(gcdRes + " ");
//
//        // lcm
//        for (int i = 0; i < N; i++) {
//            ar[i] /= gcdRes;
//        }
//
//        // print
//        for (int i = 0; i < N; i++) {
//            System.out.print(ar[i] + " ");
//        }
//
//        int lcmRes = gcdRes;
//        for (int i = 0; i < N; i++) {
//            lcmRes *= ar[i];
//        }
//        System.out.println(lcmRes);
//    }
//}
