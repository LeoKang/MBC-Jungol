package q9015;

import java.util.Scanner;

public class Main {
    static class CalcInp {
        public int num1;
        public int num2;
        public int sum;
        public int product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두 수를 입력하시오. ");

        CalcInp inp = new CalcInp();
        inp.num1 = sc.nextInt();
        inp.num2 = sc.nextInt();

        inp.sum = inp.num1 + inp.num2;
        inp.product = inp.num1 * inp.num2;

        System.out.printf("%d + %d = %d\n", inp.num1, inp.num2, inp.sum);
        System.out.printf("%d * %d = %d\n", inp.num1, inp.num2, inp.product);

        sc.close();
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("두 수를 입력하시오. ");
//        int inp1 = sc.nextInt();
//        int inp2 = sc.nextInt();
//        sc.close();
//
//        System.out.println(inp1 + " + " + inp2 + " = " + (inp1 + inp2));
//        System.out.println(inp1 + " * " + inp2 + " = " + (inp1 * inp2));
//
//    }
//}
