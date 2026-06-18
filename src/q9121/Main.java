package q9121;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = {
                "champion", "tel", "pencil", "jungol", "olympiad",
                "class", "information", "lesson", "book", "lion"
        };

        System.out.print("문자를 입력하세요. ");
        char inputChar = sc.next().charAt(0);

        boolean found = false;

        for (int i = 0; i < words.length; i++) {
            if (words[i].charAt(0) == inputChar) {
                System.out.println(words[i]);
                found = true;
            }
        }
        sc.close();

        if (!found) {
            System.out.println("찾는 단어가 없습니다.");
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        String[] str = {"champion", "tel", "pencil", "jungol",
//                "olympiad", "class", "information", "lesson", "book", "lion"};
//        Scanner sc = new Scanner(System.in);
//        System.out.print("문자를 입력하세요. ");
//        char ch = sc.next().charAt(0);
//        sc.close();
//
//        for (int i = 0; i < str.length; i++) {
//            if (ch == str[i].charAt(0)) {
//                System.out.println(str[i]);
//            }
//        }
//    }
//}
