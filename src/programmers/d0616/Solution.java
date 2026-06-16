package programmers.d0616;

class Solution {
    public String solution(String n_str) {
        if (n_str.charAt(0) != '0') {
            return n_str;
        }
        return solution(n_str.substring(1));
    }
}

//public class Solution {
//    public String solution(String n_str) {
//        String answer = "";
//
//        System.out.println(n_str);
//
//        boolean b = true;
//        for (int i = 0; i < n_str.length(); i++) {
//            char c = n_str.charAt(i);
//
//            if(c != '0' || b != true){
//                b = false;
//                answer += c;
//            }
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Solution s = new Solution();
//        System.out.println(s.solution("0010"));
//        System.out.println(s.solution("854020"));
//    }
//}
