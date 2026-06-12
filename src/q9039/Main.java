package q9039;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            sb.append(ch);
        }
        System.out.print(sb.toString());
    }
}

//public class Main {
//    public static void main(String[] args) {
//        char ch = 'A';
//
//        for (int i = 0; i < 26; i++) {
//            System.out.print(ch++);
//        }
//    }
//}
