package beginner.q4987;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.next();
        String T = input.next();
        input.close();

        StringBuilder sb = new StringBuilder(S);
        while (sb.indexOf(T) >= 0) {
            sb.delete(sb.indexOf(T), sb.indexOf(T) + T.length());
        }
        System.out.println(sb);
    }
}
