package q9012;

public class Main {
    public static void main(String[] args) {
        // 1.
//        System.out.println("원주 = 5 * 2 * 3.140000 = 31.400000");
//        System.out.println("넓이 = 5 * 5 * 3.140000 = 78.500000");

        // 2.
//        System.out.print("원주 = 5 * 2 * 3.140000 = 31.400000\n");
//        System.out.println("넓이 = 5 * 5 * 3.140000 = 78.500000");

        // 2.1
        int num1 = 5;
        int num2 = 2;
        double pi = 3.140000;
        System.out.print("원주 = " + num1 + " * " + num2 + " * " + pi + " = " + (num1 * num2 * pi) + "\n");

        // 3.
        System.out.printf("원주 = %d * %d * %.3f = %f\n", num1, num2, pi, (num1 * num2 * pi));
    }
}
