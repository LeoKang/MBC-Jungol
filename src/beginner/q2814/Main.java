package beginner.q2814;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        long numbers = 0;

        for(int i = 0; i<str.length(); i++) {
            int a = str.charAt(i) - '0';

            numbers = numbers * 2 + a;
        }
        System.out.println(numbers);
    }
}


//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String binary = sc.next();
//
//        int decimal = 0;
//        int valid = 1;
//
//        for (int i = binary.length() - 1; i >= 0; i--) {
//            if (binary.charAt(i) == '1') {
//                decimal += valid;
//            }
//            valid *= 2;
//        }
//
//        System.out.println(decimal);
//        sc.close();
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String inp = sc.next();
//        sc.close();
//
////        System.out.println(inp);
////         10101
//        int res = 0;
//        for (int i = 0; i < inp.length(); i++) {
//            char c = inp.charAt(i);
//            res += (int) (c - 48) * Math.pow(2, inp.length() - i - 1);
//        }
//
//        System.out.println(res);
//    }
//}
