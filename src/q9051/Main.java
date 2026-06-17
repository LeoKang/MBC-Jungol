package q9051;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                cnt++;
            }
        }
        sc.close();

        System.out.println("입력받은 짝수는 " + cnt + "개입니다.");
    }



        //1 . -----------------
//        try {
//            BufferedReader br = new BufferedReader((new InputStreamReader((System.in))));
//            String line = br.readLine();
//        } catch (Exception e) {
//            System.out.println(e);
//        }

        // 2. -------------------
//        BufferedReader br = new BufferedReader((new InputStreamReader((System.in))));
//        String line = br.readLine();
////        System.out.println(line);
//        StringTokenizer st = new StringTokenizer(line);
//        int cnt = 0;
//        while (st.hasMoreTokens()) {
//            String num = st.nextToken();
////            System.out.println(num);
//            int n = Integer.parseInt(num);
//            if (n % 2 == 0) {
//                cnt++;
//            }
//        }
//        System.out.printf("입력받은 짝수는 %d개입니다.", cnt);
//    }
}
