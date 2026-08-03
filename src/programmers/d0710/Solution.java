package programmers.d0710;

import java.util.Arrays;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int count = 0;

        Arrays.sort(s2);

        for (String word : s1) {
            if (Arrays.binarySearch(s2, word) >= 0) {
                count++;
            }
        }

        return count;
    }
}

//public class Solution {
//    public int solution(String[] s1, String[] s2) {
//        int answer = 0;
//
//        for (String s1str : s1) {
//            for (String s2str : s2) {
//                if (s1str.equals(s2str)) {
//                    answer++;
//                }
//            }
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Solution s = new Solution();
//        String[] s1 = {"a", "b", "c"};
//        String[] s2 = {"com", "b", "d", "p", "c"};
//        System.out.println(s.solution(s1, s2));
//    }
//}