package q5931;

import java.util.Scanner;

public class Main {
    static class Cell {
        private final int value;

        public Cell(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Cell[][] matrix = new Cell[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = new Cell(i + 1);
            }
        }

        for (Cell[] row : matrix) {
            for (Cell c : row) {
                System.out.print(c.getValue() + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.close();
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
//    }
//}
