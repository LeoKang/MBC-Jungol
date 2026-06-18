package beginner.q2604;

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String bowls = sc.next();
//
//        int height = 10;
//
//        for (int i = 1; i < bowls.length(); i++) {
//            height += (bowls.charAt(i) == bowls.charAt(i - 1)) ? 5 : 10;
//        }
//        sc.close();
//
//        System.out.println(height);
//    }
//}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        sc.close();

        int height = 0;
        char bf = '\0'; // NULL
        for (int i = 0; i < inp.length(); i++) {
            char c = inp.charAt(i);
            System.out.println(c);

            if (i == 0) {
                height = 10;
            } else {
                if (bf == c) {
                    height += 5;
                } else {
                    height += 10;
                }
            }
            bf = c;
        }
        System.out.println(height);
    }
}
