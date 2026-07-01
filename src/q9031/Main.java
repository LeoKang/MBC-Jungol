package q9031;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    static class CompareBox {
        public int num1;
        public int num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CompareBox box = new CompareBox();

        box.num1 = sc.nextInt();
        box.num2 = sc.nextInt();

        int max = (box.num1 > box.num2) ? box.num1 : box.num2;
        int min = (box.num1 > box.num2) ? box.num2 : box.num1;

        System.out.printf("입력받은 수 중 큰 수는 %d이고 작은 수는 %d입니다.\n", max, min);

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
//        int max = Math.max(num1, num2);
//        int min = Math.min(num1, num2);
//        System.out.println("입력받은 수 중 큰 수는 " + max
//                + "이고 작은 수는 " + min + "입니다.");
//    }
//}
