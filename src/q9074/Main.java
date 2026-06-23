package q9074;

import java.util.Scanner;

public class Main {
    public static void main() {
        int[] cnt = new int[10];
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            if (1 > num || num > 10) {
                break;
            }
            cnt[num - 1]++;
        }
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] != 0) {
                System.out.println((i + 1) + " : " + cnt[i] + "개");
            }
        }
    }
}
