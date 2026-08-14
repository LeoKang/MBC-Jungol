package q9105;

import java.util.Scanner;

public class Main {
    static int N;
    static int[] dice;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        dice = new int[N];
        dfs(0);
    }

    static void dfs(int depth) {
        if (depth == N) {
            for (int i = 0; i < N; i++) {
                System.out.print(dice[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= 6; i++) {
            dice[depth] = i;
            dfs(depth + 1);
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        StringBuilder sb = new StringBuilder();
//
//        rollDice(0, n, arr, sb);
//
//        System.out.print(sb.toString());
//
//        sc.close();
//    }
//
//    static void rollDice(int depth, int limit, int[] arr, StringBuilder sb) {
//        if (depth == limit) {
//            for (int i = 0; i < limit; i++) {
//                sb.append(arr[i]).append(" ");
//            }
//            sb.append("\n");
//            return;
//        }
//
//        for (int i = 1; i <= 6; i++) {
//            arr[depth] = i;
//            rollDice(depth + 1, limit, arr, sb);
//        }
//    }
//}

//public class Main {
//    static int[] ar;
//
//    static void r(int p) {
//        if (p == ar.length) {
//            for (int i = 0; i < ar.length; i++) {
//                System.out.print(ar[i] + " ");
//            }
//            System.out.println();
//            return;
//        }
//
//        for (int i = 1; i <= 6; i++) {
//            ar[p] = i;
//            r(p + 1);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int N = input.nextInt();
//        input.close();
//
//        ar = new int[N];
//        r(0);
//    }
//}
