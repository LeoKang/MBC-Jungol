package programmers.d0626;

//프로그래머스 > 코딩테스트 연습 > 코딩테스트 입문 > 양꼬치

//class Solution {
//    public int solution(int n, int k) {
//        int answer = (n * 12000) + (k * 2000);
//        int discount = (n / 10) * 2000;
//        answer -= discount;
//
//        return answer;
//    }
//}

public class Solution2 {
    public int solution(int n, int k) {
        // 양꼬치 : n인분 - 12,000원 , 음료수 : k개 - 2,000원
        int answer = n * 12000;
//        System.out.println(answer);

        int service = n / 10;
//        System.out.println("service : " + service);
        answer += (k - service) * 2000;

        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
//        int ret = s.solution(10, 3);
        int ret = s.solution(64, 6);
        System.out.println(ret);
    }
}
