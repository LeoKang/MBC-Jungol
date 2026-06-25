package programmers.d0624;

public class Solution {
    public int solution(int[][] arr) {
        boolean eq = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != arr[j][i]) {
                    eq = false;
                    break;
                }
            }
        }

        return eq ? 1: 0;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {5, 192, 33},
                {192, 72, 95},
                {33, 95, 999}
        };

        int[][] arr2 = {
                {19, 498, 258, 587},
                {63, 93, 7, 754},
                {258, 7, 1000, 723},
                {587, 754, 723, 81}
        };

        Solution s = new Solution();
        System.out.println(s.solution(arr2));
    }
}
