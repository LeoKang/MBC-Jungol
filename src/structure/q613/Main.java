package structure.q613;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String school = sc.next();
        int grade = sc.nextInt();
        sc.close();

//        System.out.println(name + " " + school + " " + grade);

        Student st1 = new Student(name, school, grade);
        st1.print();
    }
}

class Student {
    private String name;
    private String school;
    private int grade;

    public Student(String name, String school, int grade) {
        this.name = name;
        this.school = school;
        this.grade = grade;
    }

    public void print() {
        System.out.println("Name : " + name);
        System.out.println("School : " + school);
        System.out.println("Grade : " + grade);
    }
}