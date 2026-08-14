package q9135;

import java.util.Scanner;

public class Main {
    static class Saver {
        public final int id;
        public final int amount;

        public Saver(int id, int amount) {
            this.id = id;
            this.amount = amount;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Saver king = new Saver(0, -1);

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "번 저축금액은? ");

            int inputAmount = sc.nextInt();

            Saver current = new Saver(i, inputAmount);

            if (current.amount > king.amount) {
                king = current;
            }
        }

        System.out.println("저축왕 " + king.id + "번 " + king.amount + "원");

        sc.close();
    }
}

//class Deposit {
//    private int num;
//    private int amount;
//
//    public Deposit(int num, int amount) {
//        this.num = num;
//        this.amount = amount;
//    }
//
//    public void print() {
//        System.out.printf("%d번 %d원\n", num, amount);
//    }
//
//    public int getNum() {
//        return num;
//    }
//
//    public int getAmount() {
//        return amount;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = 5;
//        Deposit[] d = new Deposit[size];
//        for (int i = 0; i < d.length; i++) {
//            System.out.printf("%d번 저축금액은? ", i + 1);
//            int amount = sc.nextInt();
//            d[i] = new Deposit(i + 1, amount);
//        }
//
//        int max = -1;
//        int num = -1;
//        for (int i = 0; i < d.length; i++) {
////            d[i].print();
//            if (max < d[i].getAmount()) {
//                max = d[i].getAmount();
//                num = d[i].getNum();
//            }
//        }
//        System.out.println("저축왕 " + num + "번 " + max + "원");
//    }
//}
