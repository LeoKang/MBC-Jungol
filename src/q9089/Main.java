package q9089;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    static class NumberBox {
        int a, b;
        public NumberBox(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요. ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        firstFunction(a, b);
        System.out.printf("첫 번째 함수 실행후 a = %d, b = %d\n", a, b);

        NumberBox box = new NumberBox(a, b);
        secondFunction(box);

        System.out.printf("두 번째 함수 실행후 a = %d, b = %d\n", box.a, box.b);

        sc.close();
    }

    private static void firstFunction(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.printf("첫 번째 함수 실행중 x = %d, y = %d\n", x, y);
    }

    private static void secondFunction(NumberBox box) {
        int temp = box.a;
        box.a = box.b;
        box.b = temp;
        System.out.printf("두 번째 함수 실행중 x = %d, y = %d\n", box.a, box.b);
    }
}


//public class Main {
//    static Point o1, o2;
//    static class Point {
//        int x;
//
//        public Point(int x) {
//            this.x = x;
//        }
//    }
//
//    public static void changeInt1(int p1, int p2) {
//        int tmp = p1;
//        p1 = p2;
//        p2 = tmp;
//
//        System.out.println("첫 번째 함수 실행중 x = " + p1 + ", y = " + p2);
//    }
//
//    public static void changeInt2(Point p1, Point p2) {
//        Point tmp = p1;
//        p1 = p2;
//        p2 = tmp;
//
//        System.out.println("두 번째 함수 실행중 x = " + p1.x + ", y = " + p2.x);
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("두 수를 입력하세요. ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        sc.close();
//
//        changeInt1(a, b);
//        System.out.println("첫 번째 함수 실행후 x = " + a + ", y = " + b);
//
//        o1 = new Point(a);
//        o2 = new Point(b);
//        changeInt2(o1, o2);
//        System.out.println("두 번째 함수 실행후 x = " + o1.x + ", y = " + o2.x);
//    }
//}
