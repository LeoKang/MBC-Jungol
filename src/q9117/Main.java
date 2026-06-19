package q9117;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();

        for (int i = 0; i < len; i++) {
            str = str.substring(1) + str.substring(0, 1);

            System.out.println(str);
        }
        sc.close();
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String inp = sc.next();
//        sc.close();
//
//        StringBuilder sb = new StringBuilder(inp);
//        for (int i = 0; i < sb.length(); i++) {
//            sb.append(sb.charAt(0));
//            sb.delete(0, 1);
//            System.out.println(sb);
//        }
//    }
//}
