package q9042;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = 0;
        int sum = 0;
        int cnt = 0;

        while (true) {
            inp = sc.nextInt();
            if (inp == 0) {

                break;
            }
            sum += inp;
            cnt++;
        }
        sc.close();


        System.out.println("입력된 자료의 개수 = " + cnt);
        System.out.println("입력된 자료의 합계 = " + sum);
        System.out.printf("입력된 자료의 평균 = %.2f\n", ((double) sum / cnt));
    }
}
