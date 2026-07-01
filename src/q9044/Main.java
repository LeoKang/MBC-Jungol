package q9044;

import java.util.Scanner;

//public class Main {
//    static class ZeroNode {
//        public int sum = 0;
//        public int count = 0;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ZeroNode tracker = new ZeroNode();
//
//        while (true) {
//            int num = sc.nextInt();
//            if (num == 0) {
//                break;
//            }
//
//            if (num % 2 != 0) {
//                tracker.sum += num;
//                tracker.count++;
//            }
//        }
//
//        if (tracker.count > 0) {
//            int avg = tracker.sum / tracker.count;
//            System.out.println("홀수의 합 = " + tracker.sum);
//            System.out.println("홀수의 평균 = " + avg);
//        }
//        sc.close();
//    }
//}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;
        while (true) {
            int inp = sc.nextInt();
//            System.out.println(inp);

            if (inp == 0) break;

            if (inp % 2 == 1) {
                sum += inp;
                cnt++;
            }
        }
        System.out.println("홀수의 합 = " + sum);
        System.out.println("홀수의 평균 = " + (sum / cnt));
    }
}
