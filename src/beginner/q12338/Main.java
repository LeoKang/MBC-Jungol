package beginner.q12338;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int step = (a <= b) ? 1 : -1;

        int currentInp = a;
        while (true) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(currentInp + " * " + j + " = " + (currentInp * j));
            }

            if (currentInp == b) {
                break;
            }

            System.out.println();
            currentInp += step;
        }
        sc.close();
    }
}


//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        sc.close();
//
//        System.out.println(num1 + " " + num2);
//
//        if (num1 < num2) {
//            for (int i = num1; i <= num2; i++) {
//                for (int j = 1; j <= 9; j++) {
//                    System.out.println(i + " * " + j + " = " + (i * j));
//                }
//                System.out.println();
//            }
//        } else {
//            for (int i = num1; i >= num2; i--) {
//                for (int j = 1; j <= 9; j++) {
//                    System.out.println(i + " * " + j + " = " + (i * j));
//                }
//                System.out.println();
//            }
//        }
//
//
//    }
//}
