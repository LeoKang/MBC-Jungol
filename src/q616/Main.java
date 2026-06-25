package q616;

import java.util.Scanner;

class Point {
    int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Triangle {
    Point p1, p2, p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getCenterX() {
        return (p1.x + p2.x + p3.x) / 3.0;
    }

    public double getCenterY() {
        return (p1.y + p2.y + p3.y) / 3.0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Point p1 = new Point(sc.nextInt(), sc.nextInt());
        Point p2 = new Point(sc.nextInt(), sc.nextInt());
        Point p3 = new Point(sc.nextInt(), sc.nextInt());

        Triangle triangle = new Triangle(p1, p2, p3);

        System.out.printf("(%.1f, %.1f)\n", triangle.getCenterX(), triangle.getCenterY());

        sc.close();
    }
}



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

//class Triangle {
//    private Point[] pnt;
//
//    public Triangle(int[] p) {
//        pnt = new Point[3];
//        for (int i = 0, j = 0; i < pnt.length; i++, j += 2) {
//            pnt[i] = new Point(p[j], p[j + 1]);
//        }
//    }
//
//    public void print() {
//        for (int i = 0; i < pnt.length; i++) {
//            pnt[i].print();
//        }
//    }
//
//    public void getCOG() {
//        double cogX = 0.0, cogY = 0.0;
//
//        for (int i = 0; i < pnt.length; i++) {
//            cogX += pnt[i].getX();
//        }
//        cogX /= pnt.length;
//        for (int i = 0; i < pnt.length; i++) {
//            cogY += pnt[i].getY();
//        }
//        cogY /= pnt.length;
//
//        System.out.printf("(%.1f, %.1f)\n", cogX, cogY);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] inp = new int[6];
//        for (int i = 0; i < inp.length; i++) {
//            inp[i] = sc.nextInt();
//        }
//
////        for (int i = 0; i < inp.length; i++) {
////            System.out.print(inp[i] + " ");
////        }
////        System.out.println();
//
//        Triangle tri = new Triangle(inp);
////        tri.print();
//        tri.getCOG();
//    }
//}
