package q9130;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    static class Student {
        private int no;
        private String name;
        private int age;

        public Student(int no, String name, int age) {
            this.no = no;
            this.name = name;
            this.age = age;
        }

        public void display() {
            System.out.printf("%d번 학생 - 당신의 이름은 %s이고 나이는 %d세이군요.\n", this.no, this.name, this.age);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("인원 수? ");
        int count = sc.nextInt();

        Student[] list = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\n[" + (i + 1) + "번째 학생 정보 입력]");

            System.out.print("당신의 이름은 무엇입니까? ");
            String n = sc.next();

            System.out.print("당신의 나이는 몇 살입니까? ");
            int a = sc.nextInt();

            list[i] = new Student(i + 1, n, a);
        }

        System.out.println("\n===================== 결과 출력 =====================");

        for (Student s : list) {
            s.display();
        }

        sc.close();
    }
}


//class Person {
//    private String name;
//    private int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public void print() {
//        System.out.println("당신의 이름은 " + name + "이고 나이는 " + age + "세이군요.");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("인원 수? ");
//        int num = sc.nextInt();
//        Person[] p = new Person[num];
//
//        for (int i = 0; i < num; i++) {
//            System.out.print("당신의 이름은 무엇입니까? ");
//            String name = sc.next();
//            System.out.print("당신의 나이는 몇 살입니까? ");
//            int age = sc.nextInt();
//
//            p[i] = new Person(name, age);
//        }
//        sc.close();
//
//        for (int i = 0; i < num; i++) {
//            p[i].print();
//        }
//    }
//}
