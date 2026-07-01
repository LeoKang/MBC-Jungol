package q582;

import java.util.Scanner;

class Circle {
    private int area;

    public Circle(int area) {
        this.area = area;
    }

    public double getRadius() {
        return Math.sqrt(area / 3.14);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area = sc.nextInt();
        sc.close();

        Circle c = new Circle(area);
        System.out.printf("%.2f\n", c.getRadius());
    }
}
