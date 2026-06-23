package q614;

import java.util.Scanner;

class Student {
    private String school;
    private int grade;

    public Student(String school, int grade) {
        this.school = school;
        this.grade = grade;
    }

    public void print() {
        System.out.println(grade + " grade in " + school + " School");
    }
}

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String school = sc.next();
        int grade = sc.nextInt();
        sc.close();

        System.out.println(school + " " + grade);

        Student st1 = new Student("Jejuelementary", 6);
        Student st2 = new Student(school, grade);
        st1.print();
        st2.print();
    }
}
