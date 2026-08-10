package q9075;

import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[10];
        do {
            int inp = sc.nextInt();
            if (inp == 0) break;
            cnt[inp % 10]++;
        } while (true);

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] != 0) {
                System.out.println(i + " : " + cnt[i] + "개");
            }
        }
    }
}
