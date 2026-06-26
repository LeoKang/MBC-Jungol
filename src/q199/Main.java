package q199;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static class ScoreNode {
        public String id;
        public int s1, s2, s3, sum;

        public ScoreNode(String id, int s1, int s2, int s3) {
            this.id = id;
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
            this.sum = s1 + s2 + s3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ScoreNode[] group = new ScoreNode[n];

        for (int i = 0; i < n; i++) {
            group[i] = new ScoreNode(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (group[j].sum < group[j + 1].sum) {
                    ScoreNode temp = group[j];
                    group[j] = group[j + 1];
                    group[j + 1] = temp;
                }
            }
        }

        for (ScoreNode node : group) {
            System.out.printf("%s %d %d %d %d\n", node.id, node.s1, node.s2, node.s3, node.sum);
        }
        sc.close();
    }
}


//class Student {
//    private String name;
//    private int sub1, sub2, sub3;
//    private int total;
//
//    public Student(String name, int sub1, int sub2, int sub3) {
//        this.name = name;
//        this.sub1 = sub1;
//        this.sub2 = sub2;
//        this.sub3 = sub3;
//        this.total = sub1 + sub2 + sub3;
//    }
//
//    public void print() {
//        System.out.println(name + " " + sub1 + " " + sub2 + " " + sub3 + " " + total);
//    }
//
//    public int getTotal() {
//        return total;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        Student[] stu = new Student[n];
//        for (int i = 0; i < n; i++) {
//            String name = sc.next();
//            int sub1 = sc.nextInt();
//            int sub2 = sc.nextInt();
//            int sub3 = sc.nextInt();
//
//            stu[i] = new Student(name, sub1, sub2, sub3);
//        }
//
////        for (int i = 0; i < stu.length; i++) {
////            stu[i].print();
////        }
//
//        Arrays.sort(stu, (s1, s2) -> s2.getTotal() - s1.getTotal());
//
//        for (int i = 0; i < stu.length; i++) {
//            stu[i].print();
//        }
//    }
//}
