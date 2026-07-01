package q1658;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int gcd = getGCD(num1, num2);
        System.out.println(gcd);
        System.out.println((num1 * num2) / gcd);
    }

    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }

        return getGCD(num2, num1 % num2);
    }
}

//class NumberPair {
//    private final int a;
//    private final int b;
//
//    public NumberPair(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }
//
//    public int getGCD() {
//        int min = (a < b) ? a : b;
//
//        for (int i = min; i >= 1; i--) {
//            if (a % i == 0 && b % i == 0) {
//                return i;
//            }
//        }
//        return 1;
//    }
//
//    public int getLCM() {
//        return (a * b) / getGCD();
//    }
//
//    public void printResults() {
//        System.out.println(getGCD());
//        System.out.println(getLCM());
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int inputA = sc.nextInt();
//        int inputB = sc.nextInt();
//
//        NumberPair numbers = new NumberPair(inputA, inputB);
//
//        numbers.printResults();
//        sc.close();
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//        sc.close();
//
//        if (n1 == n2) {
//            System.out.println(n1);
//            System.out.println(n1);
//        } else {
//            int min = Math.min(n1, n2);
//            int max = Math.max(n1, n2);
//
////        System.out.println(max + " " + min);
//
//            int max_gcd = min;
//            int gcd = 1;
//            boolean isDiv = true;
//
//            while (isDiv) {
//                if (max % max_gcd == 0 && min % max_gcd == 0) {
//                    max /= max_gcd;
//                    min /= max_gcd;
//                    gcd *= max_gcd;
//                    max_gcd = min;
//                } else {
//                    max_gcd--;
//                    if (max_gcd == 1) break;
//                }
//            }
//            System.out.println(gcd);
//            System.out.println(gcd * max * min);
//        }
//    }
//}
