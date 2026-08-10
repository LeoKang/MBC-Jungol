package beginner.q1438;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

//t = int(input())
//l = set()
//for _ in range(t):
//x, y = map(int, input().split())
//        for i in range(x, x+10):
//        for j in range(y, y+10):
//        l.add((i,j))
//print(len(l))
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        boolean[][] paper = new boolean[100][100];
//
//        for (int i = 0; i < n; i++) {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            for (int dx = 0; dx < 10; dx++)
//                for (int dy = 0; dy < 10; dy++)
//                    paper[x + dx][y + dy] = true;
//        }
//
//        int area = 0;
//        for (int i = 0; i < 100; i++)
//            for (int j = 0; j < 100; j++)
//                if (paper[i][j]) area++;
//
//        System.out.println(area);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        boolean[] flatCanvas = new boolean[10000];
//
//        for (int i = 0; i < n; i++) {
//            int startX = sc.nextInt();
//            int startY = sc.nextInt();
//
//            for (int dx = 0; dx < 10; dx++) {
//                for (int dy = 0; dy < 10; dy++) {
//                    int targetIndex = (startX + dx) * 100 + (startY + dy);
//                    flatCanvas[targetIndex] = true;
//                }
//            }
//        }
//
//        int area = 0;
//        for (boolean isBlack : flatCanvas) {
//            if (isBlack) area++;
//        }
//
//        System.out.println(area);
//        sc.close();
//    }
//}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] p = new int[100][100];
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                p[i][j] = 0;
            }
        }
        int n = sc.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        sc.close();

//		for (int i = 0; i < n; i++) {
//			System.out.print(x[i] + " ");
//			System.out.println(y[i]);
//		}

		System.out.println("print -------------------1");
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[i].length; j++) {
				System.out.print(p[i][j]);
			}
			System.out.println();
		}

        for (int i = 0; i < n; i++) {
            for (int a = x[i]; a <= x[i] + 9; a++) {
                for (int b = y[i]; b <= y[i] + 9; b++) {
                    p[a][b] = 1;
                }
            }
        }
		System.out.println("print -------------------2");
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[i].length; j++) {
				System.out.print(p[i][j]);
			}
			System.out.println();
		}

        int sum = 0;
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                if (p[i][j] == 1)
                    sum++;
            }
        }
        System.out.println(sum);
    }
}