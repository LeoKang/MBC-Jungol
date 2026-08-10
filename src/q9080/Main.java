package q9080;

public class Main {
    public static void main(String[] args) {
        int[][] memo = new int[5][5];
        printPascalRecursive(0, 0, 5, memo);
    }

    private static void printPascalRecursive(int r, int c, int max, int[][] memo) {
        if (r >= max) return;

        if (c == 0 || c == r) {
            memo[r][c] = 1;
        } else {
            memo[r][c] = memo[r-1][c-1] + memo[r-1][c];
        }

        System.out.print(memo[r][c] + " ");

        if (c == r) {
            System.out.println();
            printPascalRecursive(r + 1, 0, max, memo);
        } else {
            printPascalRecursive(r, c + 1, max, memo);
        }
    }
}

//public class Main {
//    static int[][] arr;
//
//    public static void print() {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] != 0)
//                    System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        int N = 10;
//        arr = new int[N][N];
//        arr[0][0] = 1;
//        for (int i = 1; i < N; i++) {
//            arr[i][0] = 1;
//            for (int j = 1; j < N; j++) {
//                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
//            }
//        }
//
//        print();
//    }
//}
