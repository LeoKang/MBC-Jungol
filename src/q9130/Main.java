package q9130;

import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println("당신의 이름은 " + name + "이고 나이는 " + age + "세이군요.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("인원 수? ");
        int num = sc.nextInt();
        Person[] p = new Person[num];

        for (int i = 0; i < num; i++) {
            System.out.print("당신의 이름은 무엇입니까? ");
            String name = sc.next();
            System.out.print("당신의 나이는 몇 살입니까? ");
            int age = sc.nextInt();

            p[i] = new Person(name, age);
        }
        sc.close();

        for (int i = 0; i < num; i++) {
            p[i].print();
        }
    }
}
