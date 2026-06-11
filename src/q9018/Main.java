package q9018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("두 개의 수를 입력하시오. ");

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d + %d = %d\n", a, b, (a + b));
        System.out.printf("%d - %d = %d\n", a, b, (a - b));
        System.out.printf("%d * %d = %d\n", a, b, (a * b));
        System.out.printf("%d / %d = %d\n", a, b, (a / b));
        System.out.printf("%d %% %d = %d\n", a, b, (a % b));
    }
}

//public class Main {
//    public static void main(String[] args) {
//        System.out.print("두 개의 수를 입력하시오. ");
//        Scanner sc = new Scanner(System.in);
//        int inp1 = sc.nextInt();
//        int inp2 = sc.nextInt();
//
//        System.out.println(inp1 + " + " + inp2 + " = " + (inp1 + inp2));
//        System.out.println(inp1 + " - " + inp2 + " = " + (inp1 - inp2));
//        System.out.println(inp1 + " * " + inp2 + " = " + (inp1 * inp2));
//        System.out.println(inp1 + " / " + inp2 + " = " + (inp1 / inp2));
//        System.out.println(inp1 + " % " + inp2 + " = " + (inp1 % inp2));
//    }
//}
