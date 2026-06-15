package q9022;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a + 1;

        int c = a + b;

        b = b - 1;

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        sc.close();
//
////        System.out.println(a);
////        System.out.println(b);
//
//        int c = ++a + b--;
//        System.out.print("a = " + a);
//        System.out.print(", b = " + b);
//        System.out.print(", c = " + c);
//
//    }
//}
