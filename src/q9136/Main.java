package q9136;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//public class Main {
//    static class Member {
//        private String name;
//        private int height;
//        private double weight;
//
//        public Member(String name, int height, double weight) {
//            this.name = name;
//            this.height = height;
//            this.weight = weight;
//        }
//
//        public int getHeight() {
//            return this.height;
//        }
//
//        public String getInfo() {
//            return this.name + " " + this.height + " " + this.weight;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Member[] pool = new Member[5];
//        for (int i = 0; i < 5; i++) {
//            pool[i] = new Member(sc.next(), sc.nextInt(), sc.nextDouble());
//        }
//
//        for (int i = 0; i < pool.length - 1; i++) {
//            for (int j = i + 1; j < pool.length; j++) {
//                if (pool[i].getHeight() > pool[j].getHeight()) {
//                    Member holder = pool[i];
//                    pool[i] = pool[j];
//                    pool[j] = holder;
//                }
//            }
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for (Member m : pool) {
//            sb.append(m.getInfo()).append("\n");
//        }
//        System.out.print(sb.toString());
//        sc.close();
//    }
//}

class Person {
    private String name;
    private int height;
    private double weight;

    // method 구현
    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
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
        // 사용자 입력
        Scanner sc = new Scanner(System.in);
        Person[] arr = new Person[5];

        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();

//            System.out.println(name + " " + height + " " + weight);
            // Object Array ~>
            arr[i] = new Person();
            arr[i].setName(name);
            arr[i].setHeight(height);
            arr[i].setWeight(weight);
            // Print Array
//            System.out.println(arr[i].getName() + " " + arr[i].getHeight() + " " + arr[i].getWeight());
        }
        // Sort - Arrays.sort()
        //           -> Compare(), Comparator
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getHeight() - o2.getHeight();
            }
        });

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName() + " " + arr[i].getHeight() + " " + arr[i].getWeight());
        }
    }
}
