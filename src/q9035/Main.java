package q9035;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 수를 입력하세요. ");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();

        int max = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;

        System.out.println("입력받은 수 중 가장 큰 수는 " + max + "입니다.");
        sc.close();
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("세 수를 입력하세요. ");
//        int inp1 = scan.nextInt();
//        int inp2 = scan.nextInt();
//        int inp3 = scan.nextInt();
//        scan.close();
//
////        System.out.println(inp1 + " " + inp2 + " " + inp3);
//
//        int max = 0;
//        if (inp1 < inp2) {
//            if (inp2 < inp3) {
//                max = inp3;
//            } else {
//                max = inp2;
//            }
//        } else {
//            if (inp1 < inp3) {
//                max = inp3;
//            } else {
//                max = inp1;
//            }
//        }
//        System.out.println("입력받은 수 중 가장 큰 수는 " + max + "입니다.");
//    }
//}
