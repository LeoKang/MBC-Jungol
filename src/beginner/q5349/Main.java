package beginner.q5349;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            if (i % 2 == 1) {
                System.out.print(words[i] + " ");
            }
        }

        sc.close();
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String inp = sc.nextLine();
//        sc.close();
//
//        StringTokenizer st = new StringTokenizer(inp);
//        StringBuilder sb = new StringBuilder();
//        int order = 1;
//        while (st.hasMoreTokens()) {
//            String s = st.nextToken();
//            if(order++ % 2 == 0) {
//                sb.insert(0, s + " ");
//            }
//        }
//        System.out.println(sb);
//    }
//}
