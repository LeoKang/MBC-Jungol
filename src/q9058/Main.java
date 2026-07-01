package q9058;

import java.util.Scanner;

//public class Main {
//    static class MultiGrid {
//        public char displayChar;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        MultiGrid[][] grid = new MultiGrid[n][n];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                grid[i][j] = new MultiGrid();
//
//                if (j < n - 1 - i) {
//                    grid[i][j].displayChar = ' ';
//                }
//                else {
//                    grid[i][j].displayChar = '*';
//                }
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(grid[i][j].displayChar);
//            }
//            System.out.println();
//        }
//        sc.close();
//    }
//}

public class Main {
    public static void main(String[] args) {
        /*
             ' '      '*'
             4         1
             3         2
             2         3
             1         4
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

//        System.out.println(n);

        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
