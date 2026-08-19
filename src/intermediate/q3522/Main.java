package intermediate.q3522;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int MOD = 1000000007;

        int a = 1;
        int b = 1;
        int c = 0;

        for (int i = 3; i <= n; i++) {
            c = (a + b) % MOD;

            a = b;
            b = c;
        }

        System.out.println(c);

        sc.close();
    }
}

//public class Main {
//    static int[] d;
//
//    public static int dp(int p) {
//        d[0] = 0;
//        d[1] = 1;
//        for (int i = 2; i <= p; i++) {
//            d[i] = (d[i - 1] + d[i - 2]) % 1000000007;
//        }
//
//        return d[p];
//    }
//
//    public static int fibo(int p) {
////        System.out.println("f(" + p + ")");
//        if (p == 0) {
//            return 0;
//        } else if (p == 1) {
//            return 1;
//        } else {
//            return fibo(p - 1) + fibo(p - 2);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int N = input.nextInt();
//        input.close();
//
//        d = new int[N + 1];
////        System.out.println(fibo(N));
//        System.out.println(dp(N));
//    }
//}
