package programmers.d0617;

//코딩테스트 연습 > 코딩 기초 트레이닝 > 배열의 길이에 따라 다른 연산하기
class Solution {

    public int[] solution(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if ((arr.length % 2) != (i % 2)) {
                arr[i] += n;
            }
        }
        return arr;
    }

//    public int[] solution(int[] arr, int n) {
//        int[] answer = new int[arr.length];
//
//        if (arr.length % 2 == 0) {
//            for (int i = 0; i < arr.length; i++) {
//                if (i % 2 != 0) {
//                    answer[i] = arr[i] + n;
//                } else {
//                    answer[i] = arr[i];
//                }
//            }
//        } else {
//            for (int i = 0; i < arr.length; i++) {
//                if (i % 2 != 0) {
//                    answer[i] = arr[i];
//                } else {
//                    answer[i] = arr[i] + n;
//                }
//            }
//        }
//
//        return answer;
//    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {49, 12, 100, 276, 33};
        int n = 27;
        int[] res = s.solution(arr, n);
        for(int p : res) {
            System.out.print(p + " ");
        }
        System.out.println();
    }
}
