package q9108;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            char c = sc.next().charAt(0);

            sb.append(c).append(" -> ").append((int) c).append("\n");

            if (c == '0') break;
        }
        System.out.print(sb);
        sc.close();


//    public static void main(String[] args) throws java.io.IOException {
//        while (true) {
//            int ascii = System.in.read();
//
//            if (ascii == ' ' || ascii == '\n') {
//                continue;
//            }
//
//            System.out.println((char) ascii + " -> " + ascii);
//
//            if (ascii == 48) {
//                break;
//            }
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        char c = '\0';
//        do {
//            c = sc.next().charAt(0);
//            System.out.printf("%c -> %d\n", c, (int) c);
//        } while (c != '0');
    }
}
