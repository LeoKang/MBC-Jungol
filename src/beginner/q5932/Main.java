package beginner.q5932;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    a++;
                    System.out.print(a + " ");
                } else {
                    System.out.print(a + " ");
                    a--;
                }
            }
            System.out.println();
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            if (i % 2 == 0) {
//                for (int j = 1; j <= n; j++) {
//                    System.out.print(j + " ");
//                }
//            }else {
//                for (int j = n; j >= 1; j--) {
//                    System.out.print(j + " ");
//                }
//            }
//            System.out.println();
//        }
//
//        sc.close();
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.close();
//
//        int step = 1;
//        int num = 1;
//        for (int i = 0; i < n; i++) {
//            while(1 <= num && num <= n) {
//                System.out.print(num + " ");
//                num += step;
//            }
//            step *= -1;
//            num += step;
//            System.out.println();
//        }
//    }
//}
