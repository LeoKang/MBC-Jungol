package q9066;

public class Main {
    public static void main(String[] args) {
        char[] ar = new char[26];
        char ch = 'A';

        for (int i = 0; i < ar.length; i++) {
            ar[i] = ch++;
        }

//        for (int i = 0; i < ar.length; i++) {
//            System.out.print(ar[i] + " ");
//        }

        for (int i = 25; i >= 0; i--) {
            System.out.print(ar[i] + " ");
        }

        char[] alphabet = new char[26];
        for (int i = alphabet.length - 1; i >= 0; i--) {
            alphabet[i] = ch;
            ch++;
        }

        for (char alpha : alphabet) {
            System.out.print(alpha + " ");
        }
    }
}
