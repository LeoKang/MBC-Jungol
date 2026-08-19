package beginner.q1761;

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[][] hints = new int[n][3];
//        for (int i = 0; i < n; i++) {
//            hints[i] = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
//        }
//
//        int answer = 0;
//
//        for (int i = 123; i <= 987; i++) {
//            String s = String.valueOf(i);
//
//            if (s.contains("0") || s.charAt(0) == s.charAt(1) || s.charAt(1) == s.charAt(2) || s.charAt(0) == s.charAt(2)) {
//                continue;
//            }
//
//            boolean isPossible = true;
//
//            for (int[] h : hints) {
//                String guess = String.valueOf(h[0]);
//                int strike = 0, ball = 0;
//
//                for (int j = 0; j < 3; j++) {
//                    if (s.charAt(j) == guess.charAt(j)) {
//                        strike++;
//                    } else if (guess.contains(String.valueOf(s.charAt(j)))) {
//                        ball++;
//                    }
//                }
//
//                if (strike != h[1] || ball != h[2]) {
//                    isPossible = false;
//                    break;
//                }
//            }
//            System.out.println(s + " " + isPossible);
//            if (isPossible) answer++;
//        }
//
//        System.out.println(answer);
//        sc.close();
//    }
//}


import java.util.Scanner;

public class Main {
    static int[][] map = new int[3][9];

    //print map
    static void printMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] chk = new String[N];
        int[] strike = new int[N];
        int[] ball = new int[N];
        for (int i = 0; i < N; i++) {
            chk[i] = sc.next();
            strike[i] = sc.nextInt();
            ball[i] = sc.nextInt();
        }

        //print input
        for (int i = 0; i < N; i++) {
            System.out.println(chk[i] + " " + strike[i] + " " + ball[i] + " ");
        }


        // 조건 체크
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < chk[i].length(); j++) {
                char c = chk[i].charAt(j);
                if (strike[i] != 0) {
                    System.out.println(c);
                    map[j][c - '0' - 1] = 1;
                } else {
                    map[j][c - '0' - 1] = -1;
                }
                if (ball[i] == 0) {

                }
            }
        }

        printMap();
    }
}
