package q9055;

import java.util.Scanner;

//public class Main {
//    static class Result {
//        public int value;
//        public int sum;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int threshold = sc.nextInt();
//
//        Result r = new Result();
//        accumulateRecursive(1, 0, threshold, r);
//
//        System.out.println(r.value + " " + r.sum);
//        sc.close();
//    }
//
//    private static void accumulateRecursive(int current, int currentSum, int limit, Result res) {
//        int nextSum = currentSum + current;
//
//        if (nextSum > limit) {
//            res.value = current;
//            res.sum = nextSum;
//            return;
//        }
//
//        accumulateRecursive(current + 1, nextSum, limit, res);
//    }
//}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        sc.close();

        int sum = 0;
        int i = 1;
        for (; ; i++) {
            sum += i;
            if (sum > inp) break;
        }
        System.out.print(i + " ");
        System.out.println(sum);
    }
}
