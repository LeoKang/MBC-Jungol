package q9045;

import java.util.Scanner;
/*
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] messages = {
                "",
                "입력하기를 선택하였습니다.",
                "출력하기를 선택하였습니다.",
                "삭제하기를 선택하였습니다.",
                "끝내기를 선택하였습니다."
        };

        while (true) {
            System.out.print("1. 입력하기\n2. 출력하기\n3. 삭제하기\n4. 끝내기\n작업할 번호를 선택하세요. ");
            int num = sc.nextInt();
            System.out.println();

            if (num >= 1 && num <= 4) {
                System.out.println(messages[num] + "\n");
                if (num == 4) {
                    break;
                }
            } else {
                System.out.println("잘못 입력하였습니다.\n");
            }
        }

        sc.close();
    }
}
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. 입력하기 ");
            System.out.println("2. 출력하기 ");
            System.out.println("3. 삭제하기 ");
            System.out.println("4. 끝내기 ");
            System.out.println("작업할 번호를 선택하세요. ");
            int inp = sc.nextInt();

            switch (inp) {
                case 1:
                    System.out.println("입력하기를 선택하였습니다. \n");
                    break;
                case 2:
                    System.out.println("출력하기를 선택하였습니다. \n");
                    break;
                case 3:
                    System.out.println("삭제하기를 선택하였습니다. \n");
                    break;
                case 4:
                    System.out.println("끝내기를 선택하였습니다. \n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못 입력하였습니다. \n");
                    break;
            }
        } while (true);
    }
}
