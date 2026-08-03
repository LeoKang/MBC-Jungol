package q9069;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (true) {
            System.out.print("YEAR = ");
            int YEAR = sc.nextInt();
            System.out.print("MONTH = ");
            int MONTH = sc.nextInt();

            if (MONTH == 0) break;

            if (MONTH < 1 || MONTH > 12) {
                System.out.println("잘못 입력하였습니다.");
                System.out.println();
                continue;
            }

            int day = days[MONTH - 1];

            if (MONTH == 2) {
                boolean isLeap = (YEAR % 400 == 0) || (YEAR % 4 == 0 && YEAR % 100 != 0);
                if (isLeap) day = 29;
            }

            System.out.println("입력하신 달의 날 수는 " + day + "일입니다.");
            System.out.println();
        }
    }
}

//public class Main {
//    static class CalendarDate {
//        public int year;
//        public int month;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            CalendarDate date = new CalendarDate();
//
//            System.out.print("YEAR = ");
//            date.year = sc.nextInt();
//
//            System.out.print("MONTH = ");
//            date.month = sc.nextInt();
//
//            if (date.month == 0) {
//                break;
//            }
//
//            if (date.month < 1 || date.month > 12) {
//                System.out.println("잘못 입력하였습니다.\n");
//                continue;
//            }
//
//            int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//
//            if ((date.year % 4 == 0 && date.year % 100 != 0) || (date.year % 400 == 0)) {
//                days[2] = 29;
//            }
//
//            System.out.printf("입력하신 달의 날 수는 %d일입니다.\n\n", days[date.month]);
//        }
//
//        sc.close();
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.print("YEAR = ");
//            int year = sc.nextInt();
//            System.out.print("MONTH = ");
//            int month = sc.nextInt();
//
//            if (month == 0) break;
//            switch (month) {
//                case 1, 3, 5, 7, 8, 10, 12:
//                    System.out.println("입력하신 달의 날 수는 31일입니다. \n");
//                    break;
//                case 4, 6, 9, 11:
//                    System.out.print("입력하신 달의 날 수는 30일입니다. \n");
//                    break;
//                case 2:
//                    if (year % 400 == 0) {
//                        System.out.print("입력하신 달의 날 수는 29일입니다. \n\n");
//                    } else if (year % 4 == 0 && year % 100 != 0) {
//                        System.out.print("입력하신 달의 날 수는 29일입니다. \n\n");
//                    } else {
//                        System.out.print("입력하신 달의 날 수는 28일입니다. \n\n");
//                    }
//                    break;
//                default:
//                    System.out.println("잘못 입력하였습니다. \n");
//            }
//        }
//
//
////        Date d = new Date(2000, 1, 0);
////        System.out.println(d.getDate());
//
////        Calendar cal = Calendar.getInstance();
////        int year = 2000;
////        int month = 1;
////        cal.set(year, month - 1, 1);
////        int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
////        System.out.println(days);
//    }
//}
