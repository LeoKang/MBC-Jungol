package q618;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    static class Member {
        String name;
        int height;
        double weight;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Member[] group = new Member[5];

        for (int i = 0; i < 5; i++) {
            group[i] = new Member();

            group[i].name = sc.next();
            group[i].height = sc.nextInt();
            group[i].weight = sc.nextDouble();
        }

        Arrays.sort(group, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        System.out.println("name");

        for (Member m : group) {
            System.out.printf("%s %d %.1f%n",
                    m.name, m.height, m.weight);
        }

        System.out.println();

        Arrays.sort(group, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return Double.compare(o2.weight, o1.weight);
            }
        });

        System.out.println("weight");

        for (Member m : group) {
            System.out.printf("%s %d %.1f%n", m.name, m.height, m.weight);
        }
        sc.close();
    }
}

//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.Scanner;
//
//class Person {
//    private String name;
//    private int height;
//    private double weight;
//
//    public Person(String name, int height, double weight) {
//        this.name = name;
//        this.height = height;
//        this.weight = weight;
//    }
//
//    public void print() {
//        System.out.println(name + " " + height + " " + weight);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getWeight() {
//        return weight;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Person[] ar = new Person[5];
//        for (int i = 0; i < ar.length; i++) {
//            String name = sc.next();
//            int height = sc.nextInt();
//            double weight = sc.nextDouble();
//
//            ar[i] = new Person(name, height, weight);
//        }
//
//        for (int i = 0; i < ar.length; i++) {
//            ar[i].print();
//        }
//
//        Arrays.sort(ar, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                String name1 = o1.getName();
//                String name2 = o2.getName();
//
//                if (name1.charAt(0) < name2.charAt(0))
//                    return -1;
//                else
//                    return 0;
//            }
//        });
//        System.out.println("name");
//        for (int i = 0; i < ar.length; i++) {
//            ar[i].print();
//        }
//
//        Arrays.sort(ar, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                double weight1 = o1.getWeight();
//                double weight2 = o2.getWeight();
//
//                if (weight1 > weight2)
//                    return -1;
//                else
//                    return 0;
//            }
//        });
//
//        System.out.println("\nweight");
//        for (int i = 0; i < ar.length; i++) {
//            ar[i].print();
//        }
//    }
//}
