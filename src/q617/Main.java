package q617;

import java.util.Scanner;

public class Main {
    static class Person {
        String name;
        int height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person minPerson = null;
        int minHeight = 999;


        for (int i = 0; i < 5; i++) {
            Person p = new Person();
            p.name = sc.next();
            p.height = sc.nextInt();

            if (p.height < minHeight) {
                minHeight = p.height;
                minPerson = p;
            }
        }
        sc.close();

        System.out.println(minPerson.name + " " + minPerson.height);
    }
}


//import java.util.Arrays;
//import java.util.Scanner;
//
//class Person implements Comparable<Person>{
//    private String name;
//    private int height;
//
//    public Person(String name, int height) {
//        this.name = name;
//        this.height = height;
//    }
//
//    public void print() {
//        System.out.println(name + " " + height);
//    }
//
//    @Override
//    public int compareTo(Person o) {
//        if(height < o.height)
//            return -1;
//        else
//            return 1;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Person[] p = new Person[5];
//        for (int i = 0; i < p.length; i++) {
//            String name = sc.next();
//            int height = sc.nextInt();
//            p[i] = new Person(name, height);
//        }
//
////        for (int i = 0; i < p.length; i++) {
////            p[i].print();
////        }
//        Arrays.sort(p);
//        p[0].print();
//    }
//}
