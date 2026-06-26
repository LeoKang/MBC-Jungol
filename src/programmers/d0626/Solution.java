package programmers.d0626;

import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int limit = sides[0] + sides[1];

        for (int x = 1; x < limit; x++) {
            int currentMax = sides[0];
            if (sides[1] > currentMax) currentMax = sides[1];
            if (x > currentMax) currentMax = x;

            int restSum = sides[0] + sides[1] + x - currentMax;
            if (currentMax < restSum) {
                answer++;
            }
        }

        return answer;
    }
}

//public class Solution {
//    public int solution(int[] sides) {
//        int answer = 0;
//
//        Arrays.sort(sides);
//        Set<Integer> res = new HashSet<>();
//
//        //case 1 - {3, 6} : 가장 긴 변이 6
//        // 3 + x > 6
//        // x > 3 ... 4 5 6
//
//        //case 3 - {7, 11} : 가장 긴 변이 11
//        // 7 + x > 11
//        // x > 4 ... 5 6 7 8 9 10 11
//
//        for (int i = sides[1] - sides[0] + 1; i <= sides[1]; i++) {
//            res.add(i);
//        }
//        System.out.println(res);
//
//        //case 2 - {3, 6} : 가장 긴 변이 나머지
//        // 3 + 6 > x
//        // 6 < x < 9 ... 7 8
//
//        //case 3 - {7, 11} : 가장 긴 변이 나머지
//        // 7 + 11 > x
//        // 18 > x ... 17 16 ~ 12
//        for (int i = sides[0] + sides[1] - 1; i > sides[1]; i--) {
//            res.add(i);
//        }
//
//        System.out.println(res);
//
//        answer = res.size();
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Solution s = new Solution();
////        int sides[] = {1, 2};
////        int sides[] = {3, 6};
//        int sides[] = {11, 7};
//        System.out.println(s.solution(sides));
//    }
//}
