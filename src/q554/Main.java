package q554;

import java.util.Scanner;

//public class Main {
//    static class MultiGrid {
//        int number;
//        char character;
//        boolean isChar;
//
//        public MultiGrid(int number) {
//            this.number = number;
//            this.isChar = false;
//        }
//
//        public MultiGrid(char character) {
//            this.character = character;
//            this.isChar = true;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        MultiGrid[][] grid = new MultiGrid[n][n + 1];
//
//        int numCounter = 1;
//        char charCounter = 'A';
//
//        for (int i = 0; i < n; i++) {
//            int numBound = n - i;
//
//            for (int j = 0; j < n + 1; j++) {
//                if (j < numBound) {
//                    grid[i][j] = new MultiGrid(numCounter++);
//                } else {
//                    grid[i][j] = new MultiGrid(charCounter++);
//                }
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n + 1; j++) {
//                if (grid[i][j].isChar) {
//                    System.out.print(grid[i][j].character + " ");
//                } else {
//                    System.out.print(grid[i][j].number + " ");
//                }
//            }
//            System.out.println();
//        }
//
//        sc.close();
//    }
//}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int num = 1;
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (j < n - i) {
                    System.out.print(num++ + " ");
                } else {
                    System.out.print(ch++ + " ");
                }
            }
            System.out.println();
        }
    }
}
