package intermediate.q2000;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] unit = new int[N];
        for (int i = 0; i < N; i++) {
            unit[i] = sc.nextInt();
        }
        int W = sc.nextInt();
        sc.close();

        System.out.println(N);
        for (int i = 0; i < N; i++) {
            System.out.print(unit[i] + " ");
        }
        System.out.println();
        System.out.println(W);


        int sum = 0;
        int cnt = 0;

        for (int i = unit.length - 1; i >= 0; i--) {
            while (sum < W) {
                if (sum + unit[i] <= W) {
                    sum += unit[i];
                    cnt++;
                }
            }
        }

    }
}
