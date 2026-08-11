package q9062;

public class Main {
    public static void main(String[] args) {
        for (int i = 1, c = 'a', n = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print((char) (c++) + " ");
            }

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print((n++) + " ");
            }

            System.out.println();
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        char alpha = 'a';
//        int num = 1;
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (j <= i) {
//                    System.out.print(alpha + " ");
//                    alpha++;
//                } else {
//                    System.out.print(num + " ");
//                    num++;
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int[][] ar = new int[4][5];
//        int c = 97; //'a'
//        for (int i = 0; i < ar.length; i++) {
//            for (int j = 0; j <= i; j++) {
//                ar[i][j] = c++;
//            }
//        }
//
//        int num = 1;
//        for (int i = 0; i < ar.length; i++) {
//            for (int j = 0; j < ar[i].length; j++) {
//                if (ar[i][j] == 0) {
//                    ar[i][j] = num++;
//                }
//            }
//        }
//
//        // print
//        for (int i = 0; i < ar.length; i++) {
//            for (int j = 0; j < ar[i].length; j++) {
//                if (ar[i][j] > 96) {
//                    System.out.printf("%c ", (char) ar[i][j]);
//                } else {
//                    System.out.print(ar[i][j] + " ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
