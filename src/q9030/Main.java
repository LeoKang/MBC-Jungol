package q9030;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        sc.close();

        System.out.println(inp);
        if (inp > 10) {
            System.out.println("10보다 큰 수를 입력하셨습니다.");
        }
    }
}
