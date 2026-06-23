package q9043;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0;

        while (true) {
            int val = sc.nextInt();
            if (val == 0) break;

            if (val % 2 != 0) {
                sum += val;
                count++;
            }
        }
        sc.close();

        if (count > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("홀수의 합 = ").append(sum).append("\n");
            sb.append("홀수의 평균 = ").append(sum / count).append("\n");
            System.out.print(sb.toString());
        }
    }
}

//public class Main {
//    public static void main() {
//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        int cnt = 0;
//        for (; ; ) {
//            int inp = sc.nextInt();
//            if(inp == 0) break;
//            if(inp % 2 == 1) {
//                sum += inp;
//                cnt++;
//            }
//        }
//        System.out.println("홀수의 합 = " + sum);
//        System.out.println("홀수의 평균 = " + (sum / cnt));
//    }
//}
