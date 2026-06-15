package q9041;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        processScore(sc);
    }

    public static void processScore(Scanner sc) {
        System.out.print("점수를 입력하세요. ");
        int score = sc.nextInt();

        if (score < 0 || score > 100) {
            return;
        }

        if (score >= 80) {
            System.out.println("축하합니다. 합격입니다.");
        } else {
            System.out.println("죄송합니다. 불합격입니다.");
        }

        processScore(sc);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int inp = 0;
//        do {
//            System.out.print("점수를 입력하세요. ");
//            inp = sc.nextInt();
//            if (0 > inp || inp > 100) break;
//
//            if (inp >= 80) {
//                System.out.println("축하합니다. 합격입니다.");
//            } else {
//                System.out.println("죄송합니다. 불합격입니다.");
//            }
//        } while (true);
//    }
//}
