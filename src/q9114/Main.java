package q9114;

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            char ch = sc.next().charAt(0);
//
//            if (Character.isUpperCase(ch)) {
//                System.out.println("대문자입니다.");
//            } else if (Character.isLowerCase(ch)) {
//                System.out.println("소문자입니다.");
//            } else if (Character.isDigit(ch)) {
//                System.out.println("숫자문자입니다.");
//            } else {
//                System.out.println("영문, 숫자 이외의 문자입니다.");
//                break;
//            }
//        }
//        sc.close();
//    }
//}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            char c = sc.next().charAt(0);

            if ('a' <= c && c <= 'z') {
                System.out.println("소문자입니다.");
            } else if ('A' <= c && c <= 'Z') {
                System.out.println("대문자입니다.");
            } else if ('0' <= c && c <= '9') {
                System.out.println("숫자문자입니다.");
            } else {
                System.out.println("영문, 숫자 이외의 문자입니다.");
                break;
            }
        }
    }
}
