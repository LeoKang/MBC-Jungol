package beginner.q8129;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n, k;
    static int[] target;
    static int[] currentComb;
    static int count = 0;
    static boolean found = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        target = new int[k];
        for (int i = 0; i < k; i++) {
            target[i] = sc.nextInt();
        }

        for (int i = 1; i < k; i++) {
            if (target[i - 1] >= target[i]) {
                System.out.println("None");
                return;
            }
        }

        currentComb = new int[k];

        dfs(0, 1);

        if (!found) {
            System.out.println("None");
        }

        sc.close();
    }

    private static void dfs(int depth, int start) {
        if (found) return;

        if (depth == k) {
            count++;
            if (Arrays.equals(currentComb, target)) {
                System.out.println(count);
                found = true;
            }
            return;
        }

        for (int i = start; i <= n; i++) {
            currentComb[depth] = i;
            dfs(depth + 1, i + 1);
        }
    }
}




//public class Main {
//    static int[] num;
//    static int N, K;
//    static StringBuilder sb;
//
//    public static void recursive(int p) {
//        // 탈출 조건
//        if (p == K) {
//            // 같은 숫자가 있으면 exit
//            if (num[0] == num[1]
//                    || num[1] == num[2]
//                    || num[2] == num[0])
//                return;
//
//            StringBuilder s = new StringBuilder();
//            for (int i = 0; i < num.length; i++) {
//                System.out.print(num[i] + " ");
//                s.append(num[i]);
//            }
//            System.out.println();
//            System.out.println("[" + s + "]");
//
//            // 문자열의 문자를 정렬하여 비교
//            char[] carr = s.toString().toCharArray();
//            Arrays.sort(carr);
//            String sorted = new String(carr);
//            System.out.println(sorted + "----");
//
//            if (sb.indexOf(sorted) != -1) {
////                System.out.println("-1");
//            } else {
//                sb.append(s.toString() + " ");
//            }
//
//            return;
//        }
//
//        // 반복
//        for (int i = 1; i <= N; i++) {
//            num[p] = i;
//            recursive(p + 1);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        N = sc.nextInt();
//        K = sc.nextInt();
//        num = new int[K];
//        int[] A = new int[K];
//        sb = new StringBuilder();
//
//        for (int i = 0; i < num.length; i++) {
//            A[i] = sc.nextInt();
//        }
//        for (int i = 0; i < A.length; i++) {
//            System.out.print(A[i] + " ");
//        }
//        System.out.println();
//
//        recursive(0);
//
//        String str = Arrays.toString(A);
//        StringBuilder sb2 = new StringBuilder();
//        for (int n : A) {
//            sb2.append(n);
//        }
//        String str2 = sb2.toString();
//        System.out.println(str2);
//
//        System.out.println(sb.toString());
////        System.out.println(sb.indexOf(str2));
//    }
//}
