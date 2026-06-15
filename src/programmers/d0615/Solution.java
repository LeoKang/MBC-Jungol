package programmers.d0615;

public class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = num_list.length - 1, j=0; i >= 0; i--, j++) {
            answer[j] = num_list[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] num_list = {1, 2, 3, 4, 5};
        int[] ret = {};
        ret = s.solution(num_list);

        for (int item : ret) {
            System.out.print(item + " ");
        }
    }
}
