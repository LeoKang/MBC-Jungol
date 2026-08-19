package beginner.q1495;

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] arr = new int[n][n];
//        int num = 1;
//
//        for (int d = 0; d < 2 * n - 1; d++) {
//            for (int i = 0; i <= d; i++) {
//                int r = (d % 2 == 0) ? i : d - i;
//                int c = d - r;
//
//                if (r < n && c < n) {
//                    arr[r][c] = num++;
//                }
//            }
//        }
//
//        for (int[] row : arr) {
//            for (int val : row) {
//                System.out.print(val + " ");
//            }
//            System.out.println();
//        }
//
//        sc.close();
//    }
//}

public class Main {
    static int x = 0, y = 0;
    static int[][] box;

    static enum DIRECTION {
        DOWN, RIGHT_UP, RIGHT, LEFT_DOWN
    }

    static void print() {
        //print
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) {
                System.out.print(box[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

//        System.out.println(n);

        box = new int[n][n];

        print();

        int num = 1;
        DIRECTION dir = DIRECTION.DOWN;
        while (true) {
//            if(num == 18) break;

            box[x][y] = num++;
            switch (dir) {
                case DOWN:
                    x++;
                    if (x != box.length) {
                        dir = DIRECTION.RIGHT_UP;
                    } else {
                        x--;
                        y++;
                        dir = DIRECTION.RIGHT;
                    }
                    break;
                case RIGHT_UP:
                    x--;
                    y++;
                    if (x == 0) {
                        dir = DIRECTION.RIGHT;
                    }
                    break;
                case RIGHT:
                    y++;
                    dir = DIRECTION.LEFT_DOWN;
                    break;
                case LEFT_DOWN:
                    x++;
                    y--;
                    if (y == 0) {
                        if (x == box.length - 1) {
                            dir = DIRECTION.RIGHT;
                        } else {
                            dir = DIRECTION.DOWN;
                        }
                    }
                    break;
            }
            print();
        }
    }
}
