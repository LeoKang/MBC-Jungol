package programmers.d0630;

// 2026, MBC아카데미천호, 이명휘 님
class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n) {
                    answer += 1;
                } else {
                    answer += 2;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 100;
        System.out.println(s.solution(n));
    }
}
