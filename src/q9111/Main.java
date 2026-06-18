package q9111;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = "jungol olympiad";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            int idx = sc.nextInt();
            sb.append(target.charAt(idx));
        }
        sc.close();
        System.out.println(sb.toString());
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = "jungol olympiad";
//        for (int i = 0; i < 5; i++) {
//            int inp = sc.nextInt();
//            System.out.print(str.charAt(inp));
//        }
//        sc.close();
//    }
//}
