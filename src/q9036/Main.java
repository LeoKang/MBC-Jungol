package q9036;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. 삽입\n2. 수정\n3. 삭제");
        System.out.print("숫자를 선택하세요. ");

        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();

        String[] menuNames = {"", "삽입", "수정", "삭제"};

        if (menu >= 1 && menu < menuNames.length) {
            System.out.println(menuNames[menu] + "을 선택하셨습니다.");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("1. 삽입");
//        System.out.println("2. 수정");
//        System.out.println("3. 삭제");
//        System.out.print("숫자를 선택하세요. ");
//        int menu = sc.nextInt();
//        sc.close();
//
////        System.out.println(menu);
//        switch (menu) {
//            case 1:
//                System.out.println("삽입을 선택하셨습니다.");
//                break;
//            case 2:
//                System.out.println("수정을 선택하셨습니다.");
//                break;
//            case 3:
//                System.out.println("삭제를 선택하셨습니다.");
//                break;
//            default:
//                System.out.println("잘못 입력하셨습니다.");
//                break;
//        }
//    }
//}
