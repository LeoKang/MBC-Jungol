package q590;

import java.util.Scanner;

public class Main {
    static int n;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        dfs(0, 1);

        sc.close();
    }

    static void dfs(int depth, int start) {
        if (depth == n) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= 6; i++) {
            arr[depth] = i;
            dfs(depth + 1, i);
        }
    }
}

//public class Main {
//    public static int[] r;
//    public static int N;
//
//    public static void func(int loc) {
//        if (loc == N) {
//            for (int i = 0; i < r.length; i++) {
//                System.out.print(r[i] + " ");
//            }
//            System.out.println();
//            return;
//        }
//
//        for (int i = 1; i <= 6; i++) {
//            r[loc] = i;
//            func(loc + 1);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        N = sc.nextInt();
//        sc.close();
//
//        System.out.println(N);
//        r = new int[N];
//       func(0);
//    }
//}
