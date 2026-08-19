package q198;

import java.util.Scanner;

class Person {
    private int height;
    private double weight;

    public Person(int height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public void print() {
        System.out.println(height + ", " + weight);
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] p = new Person[2];
        for (int i = 0; i < p.length; i++) {
            p[i] = new Person(sc.nextInt(), sc.nextDouble());
        }

        int sumHeight = 0;
        double sumWeight = 0.0;
        for (int i = 0; i < p.length; i++) {
//            p[i].print();
            sumHeight += p[i].getHeight();
            sumWeight += p[i].getWeight();
        }

        Person student = new Person((sumHeight / 2) + 5, sumWeight / 2 - 4.5);
        System.out.println("height : " + student.getHeight() + "cm");
        System.out.printf("weight : %.1fkg\n", student.getWeight());
    }
}
