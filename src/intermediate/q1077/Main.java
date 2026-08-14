package intermediate.q1077;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();    // 보석의 가지 수
        int W = input.nextInt();    // 배낭의 용량
        int[][] wv = new int[N][2]; // 무게(weight), 가치(value)
        for (int i = 0; i < N; i++) {
            wv[i][0] = input.nextInt();
            wv[i][1] = input.nextInt();
        }
        input.close();

        System.out.println(W);
        for (int i = 0; i < N; i++) {
            System.out.println(wv[i][0] + " " + wv[i][1]);
        }


    }
}
