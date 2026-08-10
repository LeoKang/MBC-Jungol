package q9134;

import java.util.Scanner;

class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점의 좌표는?(x, y) ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        Point p1 = new Point(x1, y1);

        System.out.print("점의 좌표는?(x, y) ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        Point p2 = new Point(x2, y2);

        double midX = (p1.x + p2.x) / 2.0;
        double midY = (p1.y + p2.y) / 2.0;

        System.out.printf("중심점의 위치 = (%.1f, %.1f)\n", midX, midY);
        sc.close();
    }

}


//public class Main {
//    static class MPoint {
//        public double x;
//        public double y;
//
//        public MPoint getMidPoint(MPoint other) {
//            MPoint mid = new MPoint();
//            mid.x = (this.x + other.x) / 2.0;
//            mid.y = (this.y + other.y) / 2.0;
//            return mid;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        MPoint p1 = new MPoint();
//        System.out.print("점의 좌표는?(x, y) ");
//        p1.x = sc.nextDouble();
//        p1.y = sc.nextDouble();
//
//        MPoint p2 = new MPoint();
//        System.out.print("점의 좌표는?(x, y) ");
//        p2.x = sc.nextDouble();
//        p2.y = sc.nextDouble();
//
//        MPoint mid = p1.getMidPoint(p2);
//
//        System.out.printf("중심점의 위치 = (%.1f, %.1f)\n", mid.x, mid.y);
//
//        sc.close();
//    }
//}


//import java.util.Scanner;
//
//class Point {
//    private int x, y;
//
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public void print() {
//        System.out.println(x + " " + y);
//    }
//
//    public int getX() {
//        return x;
//    }
//
//    public int getY() {
//        return y;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Point[] parr = new Point[2];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < parr.length; i++) {
//            System.out.print("점의 좌표는?(x, y) ");
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            parr[i] = new Point(x, y);
//        }
//
////        for (int i = 0; i < parr.length; i++) {
////            parr[i].print();
////        }
//
//        int sumX = 0;
//        int sumY = 0;
//        for (int i = 0; i < parr.length; i++) {
//            sumX += parr[i].getX();
//            sumY += parr[i].getY();
//        }
//
//        double centerX = sumX / (double) 2;
//        double centerY = sumY / (double) 2;
//        System.out.printf("중심점의 위치 = (%.1f, %.1f)\n", centerX, centerY);
//    }
//}
