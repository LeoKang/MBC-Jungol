package q9128;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] intTokens = sc.nextLine().split(" ");
        int n1 = Integer.parseInt(intTokens[0]);
        int n2 = Integer.parseInt(intTokens[1]);
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));

        String[] doubleTokens = sc.nextLine().split(" ");
        double d1 = Double.parseDouble(doubleTokens[0]);
        double d2 = Double.parseDouble(doubleTokens[1]);
        System.out.printf("%.2f + %.2f = %.2f\n", d1, d2, (d1 + d2));
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//
//        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//
//        double d1 = sc.nextDouble();
//        double d2 = sc.nextDouble();
//        System.out.printf("%.2f + %.2f = %.2f\n", d1, d2, (d1 + d2));
//    }
//}
