package q9020;

public class Main {
    public static void main(String[] args) {
        double d = 10.0;
        if(10.0d == 10.0f) {
            System.out.println("10.0d == 10.0f");
        }else{
            System.out.println("10.0d != 10.0f");
        }

        if(0.1d == 0.1f) {
            System.out.println("0.1d == 0.1f");
        }else{
            System.out.println("0.1d != 0.1f");
        }

//        int share = 10 / 8;
//        int remain = 10 % 8;
//
//        System.out.println(share);
//        System.out.println(remain);

//        int i = 'B' - 'A';
//        System.out.println(i);
//
//        int c = 1000000 * 1000000 / 1000000;
//        System.out.println(c);
//
//        int d = 1000000 / 1000000 * 1000000;
//        System.out.println(d);
    }
}


//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int [] nums = new int[5];
//
//        System.out.print("5개의 수를 입력하시오. ");
//
//        for(int i = 0; i < 5; i++){
//            nums[i] = sc.nextInt();
//        }
//
//        int a = nums[0] + 3;
//        int b = nums[1] -3;
//        int c = nums[2] * 3;
//        int d = nums[3] / 3;
//        int e = nums[4] % 3;
//        System.out.println(a +  " " + b + " " + c + " " + d + " " + e);
//
//        sc.close();
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        Number nb = new Number(5);
//
//        nb.input(sc);
//        nb.process();
//        nb.print();
//    }
//}
//class Number {
//    private final int[] num;
//
//    public Number(int size) {
//        num = new int[size];
//    }
//    public void input(Scanner sc) {
//        System.out.print(num.length + "개의 수를 입력하시오. ");
//        for(int i =0;i<num.length;i++){
//            num[i] = sc.nextInt();
//        }
//    }
//    public void process() {
//        num[0] +=3;
//        num[1] -=3;
//        num[2] *=3;
//        num[3] /=3;
//        num[4] %=3;
//    }
//    public void print() {
//        for(int i = 0;i< num.length;i++){
//            System.out.print(num[i]+" ");
//        }
//    }
//}
//
//public class Main {
//    static class ResultState {
//        public int[] values = new int[5];
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("5개의 수를 입력하시오. ");
//        ResultState state = new ResultState();
//
//        processInputRecursive(sc, state, 0);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print(state.values[i] + " ");
//        }
//
//        sc.close();
//    }
//
//    private static void processInputRecursive(java.util.Scanner sc, ResultState state, int idx) {
//        if (idx == 5) return;
//
//        int val = sc.nextInt();
//
//        if (idx == 0) state.values[idx] = val + 3;
//        else if (idx == 1) state.values[idx] = val - 3;
//        else if (idx == 2) state.values[idx] = val * 3;
//        else if (idx == 3) state.values[idx] = val / 3;
//        else if (idx == 4) state.values[idx] = val % 3;
//
//        processInputRecursive(sc, state, idx + 1);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] ar = new int[5];
//        System.out.print("5개의 수를 입력하시오. ");
//        for (int i = 0; i < 5; i++) {
//            ar[i] = sc.nextInt();
//        }
//
//        ar[0] += 3;
//        ar[1] -= 3;
//        ar[2] *= 3;
//        ar[3] /= 3;
//        ar[4] %= 3;
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print(ar[i] + " ");
//        }
//    }
//}
