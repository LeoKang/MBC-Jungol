package programmers.d0615;
// 코딩테스트 연습 > 코딩테스트 입문 > 세균 증식

public class Solution2 {
    public int solution(int n, int t) {
        int answer = n * (int) Math.pow(2, t);
        return answer;
    }
//    public int solution(int n, int t) {
//        int answer = n;
//        for (int i = 1; i <= t; i++) {
//            answer *= 2;
//        }
//        return answer;
//    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(2, 10));
        System.out.println(s.solution(7, 15));
    }
}
