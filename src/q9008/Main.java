package q9008;

public class Main {
    public static void main(String[] args) {
        String[] subjects = {"korean", "english", "computer"};
        int[] scores = {90, 100, 80};

        System.out.printf("%8s %5s\n", "subject", "score");
        System.out.println("==============");

        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%8s %5d\n", subjects[i], scores[i]);
        }
    }
}

//public class Main {
//    public static void main(String[] args){
//        System.out.println(" subject score");
//        System.out.println("==============");
//        System.out.printf("%8s   %3d\n", "korean", 90);
//        System.out.printf("%8s   %3d\n", "english", 100);
//        System.out.printf("%8s   %3d\n", "computer", 80);
//
////        System.out.println("  korean    90");
////        System.out.println(" english   100");
////        System.out.println("computer    80");
//    }
//}
