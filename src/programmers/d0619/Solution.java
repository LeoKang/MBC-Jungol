package programmers.d0619;

// 코딩테스트 연습 > 코딩 기초 트레이닝 > 주사위 게임2

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;

        if (a != b && b != c && a != c) {
            answer = a + b + c;
        } else if (a == b && b == c) {
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else {
            answer = (a + b + c) * (a * a + b * b + c * c);
        }

        return answer;
    }
}

//class Solution {
//    public int solution(int a, int b, int c) {
//        return (a == b && b == c)
//                ? (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c)
//                : (a == b || b == c || a == c)
//                  ? (a + b + c) * (a * a + b * b + c * c)
//                  : a + b + c;
//    }
//}

//class Solution {
//    public int solution(int a, int b, int c) {
//        int answer = 0;
//
//        if (a != b && b != c && c != a) {
//            answer = a + b + c;
//        } else if (a == b && b == c) {
//            answer = (a + b + c)
//                    * ((int) Math.pow(a, 2) + (int) Math.pow(b, 2) + (int) Math.pow(c, 2))
//                    * ((int) Math.pow(a, 3) + (int) Math.pow(b, 3) + (int) Math.pow(c, 3));
//        } else {
//            answer = (a + b + c)
//                    * ((int) Math.pow(a, 2) + (int) Math.pow(b, 2) + (int) Math.pow(c, 2));
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Solution s = new Solution();
//        int a = 4;
//        int b = 4;
//        int c = 4;
//        System.out.println(s.solution(a, b, c));
//    }
//}