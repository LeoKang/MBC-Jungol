package q9034;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주사위를 두 번 던진 결과를 입력하세요. ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (4 <= a && 4 <= b) {
            System.out.print("이겼습니다.");
        }
        else if (4 <= a || 4 <= b) {
            System.out.print("비겼습니다.");
        }
        else {
            System.out.print("졌습니다.");
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("주사위를 두 번 던진 결과를 입력하세요. ");
//
//        int d1 = sc.nextInt();
//        int d2 = sc.nextInt();
//
//        int score = (d1 >= 4 ? 1 : 0) + (d2 >= 4 ? 1 : 0);
//
//        String[] messages = {"졌습니다.", "비겼습니다.", "이겼습니다."};
//
//        System.out.println(messages[score]);
//
//        sc.close();
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("주사위를 두 번 던진 결과를 입력하세요. ");
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//        sc.close();
//
////        System.out.println(n1 + " " + n2);
//
//        if (n1 >= 4 && n2 >= 4) {
//            System.out.println("이겼습니다.");
//        } else if (n1 >= 4 || n2 >= 4) {
//            System.out.println("비겼습니다.");
//        } else {
//            System.out.println("졌습니다.");
//        }
//    }
//}
