package q9032;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("점수를 입력하세요. ");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        String result = (score >= 80) ? "축하합니다. 합격입니다." : "죄송합니다. 불합격입니다.";

        System.out.println(result);
    }
}


//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("점수를 입력하세요. ");
////        int score = sc.nextInt();
//        String str = sc.next();
//        sc.close();
//
////        System.out.println(score);
//        int score = Integer.parseInt(str);
//
//        if (score >= 80) {
//            System.out.println("축하합니다. 합격입니다.");
//        } else {
//            System.out.println("죄송합니다. 불합격입니다.");
//        }
//    }
//}
