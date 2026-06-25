package programmers.d0625;

// 프로그래머스>코딩테스트 연습>코딩테스트 입문> 저주의 숫자3
class Solution2 {
    public int solution(int n) {
        int count = 0;
        int num = 0;

        while(count < n) {
            num++;
            if(isValid(num)) {
                count++;
            }
        }
        return num;
    }

    //3의 배수가 아니고, 숫자에 '3'이 안 들어간 수 인지 체크
    private boolean isValid(int num) {
        if (num % 3 == 0){
            return false;
        }
        if (String.valueOf(num).contains("3")) {
            return false;
        }
        return true;
    }
}




    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            answer++;

            while (true) {
                sb.setLength(0);
                sb.append(answer);

                if (answer % 3 == 0 || sb.indexOf("3") != -1) {
                    answer++;
                } else {
                    break;
                }
            }
        }

        return answer;
    }
}



//public class Solution2 {
//    public int solution(int n) {
//        int answer = 1;
//
//        for (int i = 1; i <= n; i++, answer++) {
//            if (answer % 3 == 0) {
//                answer++;
//            }
//
//                String str = String.valueOf(answer);
//                if (answer < 10) {
//                    if (str.charAt(0) == '3') {
//                        answer++;
//                    }
//                } else {
//                    if (str.charAt(0) == '3' || str.charAt(1) == '3') {
//                        answer++;
//                    }
//                }
//
//            System.out.print("i : " + i);
//            System.out.println(", answer : " + answer);
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Solution2 sol = new Solution2();
//        System.out.println(sol.solution(40));
//    }
//}
