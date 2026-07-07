package programmers.d07032;

import java.util.ArrayList;

public class Solution {
    static class SliceArr {
        public int[] src;
        public int start;
        public int end;
    }

    public int[] solution(int[] numbers, int num1, int num2) {
        SliceArr arr = new SliceArr();
        arr.src = numbers;
        arr.start = num1;
        arr.end = num2;

        int size = arr.end - arr.start + 1;
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            answer[i] = arr.src[arr.start + i];
        }

        return answer;
    }
}

//public class Solution {
//    public int[] solution(int[] numbers, int num1, int num2) {
//        ArrayList<Integer> lst = new ArrayList<>();
//
//        for (int i = num1; i <= num2; i++) {
//            lst.add(numbers[i]);
//        }
//
//        return lst.stream().mapToInt(Integer::intValue).toArray();
//    }
//
//    public static void main(String[] args) {
//        Solution s = new Solution();
//        int[] numbers = {1, 2, 3, 4, 5};
//        int num1 = 1;
//        int num2 = 3;
//        System.out.println(s.solution(numbers, num1, num2));
//    }
//}
