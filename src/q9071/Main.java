package q9071;

import java.util.Scanner;
import java.util.Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int even = 0;
        int odd = 9999;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0) {
                if (arr[i] > even) {
                    even = arr[i];
                }
            } else {
                if (arr[i] < odd) {
                    odd = arr[i];
                }
            }
        }
        System.out.println(odd + " " + even);
    }

}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[10];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        Arrays.sort(arr);
//
//        int minOdd = 0;
//        int maxEven = 0;
//
//        for (int i = 0; i < 10; i++) {
//            if (arr[i] % 2 != 0) {
//                minOdd = arr[i];
//                break;
//            }
//        }
//
//        for (int i = 9; i >= 0; i--) {
//            if (arr[i] % 2 == 0) {
//                maxEven = arr[i];
//                break;
//            }
//        }
//
//        System.out.println(minOdd + " " + maxEven);
//        sc.close();
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] inp = new int[10];
//        for (int i = 0; i < inp.length; i++) {
//            inp[i] = sc.nextInt();
//        }
//
/// /        for (int i = 0; i < inp.length; i++) {
/// /            System.out.print(inp[i] + " ");
/// /        }
//
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < inp.length; i++) {
//            if (inp[i] % 2 != 0 && min > inp[i]) {
//                min = inp[i];
//            }
//        }
//        System.out.print(min + " ");
//
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < inp.length; i++) {
//            if (inp[i] % 2 == 0 && max < inp[i]) {
//                max = inp[i];
//            }
//        }
//        System.out.println(max);
//    }
//}
