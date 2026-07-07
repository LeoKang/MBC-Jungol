package programmers.d0703;

//class Solution {
//    public String solution(String my_string) {
//        return my_string.replaceAll("[aeiou]", "");
//    }
//}
//
//class Solution {
//    public String solution(String my_string) {
//        String vowels = "aeiou";
//        StringBuilder answer = new StringBuilder();
//
//        for (int i = 0;i < my_string.length();i++) {
//            char c = my_string.charAt(i);
//            if (!vowels.contains(String.valueOf(c))) {
//                answer.append(c);
//            }
//        }
//
//        return answer.toString();
//    }
//}
//
//class Solution {
//    public String solution(String my_string) {
//        StringBuilder b = new StringBuilder();
//        for(char c : my_string.toCharArray()){
//            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
//                b.append(c);
//            }
//        }
//        String answer = b.toString();
//        return answer;
//    }
//}
//
//class Solution {
//    public String solution(String my_string) {
//        String answer = "";
//
//        for (int i = 0; i < my_string.length(); i++) {
//            char ch = my_string.charAt(i);
//
//            if (ch != 'a' && ch != 'e' && ch != 'i'
//                    && ch != 'o' && ch != 'u') {
//                answer += ch;
//            }
//        }
//
//        return answer;
//    }
//}

public class Solution {
    public String solution(String my_string) {
        String answer = "";

        char dif[] = {'a', 'e', 'i', 'o', 'u'};
        StringBuilder sb = new StringBuilder(my_string);
//        for (int i = 0; i < sb.length(); i++) {
////            System.out.print(sb.charAt(i));
//            for (int j = 0; j < dif.length; j++) {
//                if (sb.charAt(i) == dif[j]) {
//                    sb.deleteCharAt(i);
//                    if (i > 0) i--;
//                }
//            }
//        }


        answer = sb.toString();

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
//        System.out.println(s.solution("bus"));
        System.out.println(s.solution("aaa"));
    }
}
