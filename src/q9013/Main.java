package q9013;

public class Main {
    public static void main(String[] args) {
        double x = 1.234;
        double y = 10.3459;

        char c = '\0';  // NULL
        char d = '\u0000';
//        char e = NULL;
//        char f = null;
//        char g = '';

        String str = "";

        System.out.println(c);
        System.out.println(d);

        System.out.println("전체 7자리로 맞추고 소수 4자리까지 출력");
        System.out.printf("x = %7.4f\n", x);
        System.out.printf("y = %7.4f\n", y);
        System.out.println("\n소수 2자리까지 출력(반올림)");
        System.out.printf("x = %.2f\n", x);
        System.out.printf("y = %.2f\n", y);
    }
}
