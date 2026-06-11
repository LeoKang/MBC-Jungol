package q104;

public class Main {
    public static void main(String[] args) {
        String[] subject = {"kor", "mat", "eng"};
        int[] score = {90, 80, 100};

        int sum = 0;

        for (int i = 0; i < subject.length; i++) {
            System.out.println(subject[i] + " " + score[i]);
            sum += score[i];
        }
        System.out.println("sum " + sum);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        int kor = 90;
//        int mat = 80;
//        int eng = 100;
//        System.out.println("kor " + kor);
//        System.out.println("mat " + mat);
//        System.out.println("eng " + eng);
//        System.out.println("sum " + (kor + mat + eng));
//    }
//}
