package q9132;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.next();
        int Korean1 = sc.nextInt();
        int English1 = sc.nextInt();

        String name2 = sc.next();
        int Korean2 = sc.nextInt();
        int English2 = sc.nextInt();

        Student s1 = new Student(name1, Korean1, English1);
        Student s2 = new Student(name2, Korean2, English2);

        int sumKorean = s1.korean + s2.korean;
        int sumEnglish = s1.english + s2.english;

        System.out.println(s1.name + " " + s1.korean + " " + s1.english);
        System.out.println(s2.name + " " + s2.korean + " " + s2.english);
        System.out.println("합계 " + sumKorean + " " + sumEnglish);
    }
}

class Student {
    String name;
    int korean;
    int english;

    public Student(String name, int korean, int english) {
        this.name = name;
        this.korean = korean;
        this.english = english;
    }
}

//import java.util.Scanner;
//// 객체지향 프로그래밍(OOP) ===> 1.캡슐화, 2.상속, 3.다형성 (+ 정보 은닉, 코드 재사용, 유연한 설계)
//public class Main {
//    static class Data {
//        public String name;
//        public int kScore;
//        public int eScore;
//
//        public Data(String name, int kScore, int eScore) {
//            this.name = name;
//            this.kScore = kScore;
//            this.eScore = eScore;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        Data d1 = new Data(sc.next(), sc.nextInt(), sc.nextInt());
//        Data d2 = new Data(sc.next(), sc.nextInt(), sc.nextInt());
//
//        Data sumData = merge(d1, d2);
//
//        System.out.printf("%s %d %d\n", d1.name, d1.kScore, d1.eScore);
//        System.out.printf("%s %d %d\n", d2.name, d2.kScore, d2.eScore);
//        System.out.printf("%s %d %d\n", sumData.name, sumData.kScore, sumData.eScore);
//
//        sc.close();
//    }
//
//    private static Data merge(Data a, Data b) {
//        return new Data("합계", a.kScore + b.kScore, a.eScore + b.eScore);
//    }
//}

//class Student {
//    private String name;
//    private int kor;
//    private int eng;
//
//    public Student(String name, int kor, int eng) {
//        this.name = name;
//        this.kor = kor;
//        this.eng = eng;
//    }
//
//    public int getKor() {
//        return kor;
//    }
//
//    public int getEng() {
//        return eng;
//    }
//
//    public void print() {
//        System.out.println(this.name + " " + this.kor + " " + this.eng);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = 2;
//
//        Student[] stu = new Student[n];
//        for (int i = 0; i < n; i++) {
//            String name = sc.next();
//            int kor = sc.nextInt();
//            int eng = sc.nextInt();
//
//            stu[i] = new Student(name, kor, eng);
//        }
//
//        int korSum = 0;
//        int engSum = 0;
//        for (int i = 0; i < n; i++) {
//            stu[i].print();
//            korSum += stu[i].getKor();
//            engSum += stu[i].getEng();
//        }
//        System.out.println("합계 " + korSum + " " + engSum);
//    }
//}
