package function3.p587;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printRecursive(0, n);
    }

    public static void printRecursive(int count, int target) {
        if (count == target) {
            return;
        }

        System.out.println("recursive");

        printRecursive(count + 1, target);
    }
}

//public class Main {
//    public static void recursive(int p) {
//        if(p == 0) {
//            return;
//        }else{
//            System.out.println("recursive");
//        }
//        recursive(--p);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner((System.in));
//        int inp = sc.nextInt();
//        sc.close();
//
//        recursive(inp);
//    }
//}
