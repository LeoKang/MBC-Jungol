package programmers.d0708;

class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String onlyNums = my_string.replaceAll("[^0-9]", "");

        for (char numChar : onlyNums.toCharArray()) {
            answer += (numChar - '0');
        }

        return answer;
    }
}
/*
public class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                answer += Character.getNumericValue(c);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
//        String my_string = "aAb1B2cC34oOp";
        String my_string = "1a2b3c4d123";
        System.out.println(s.solution(my_string));
    }
}
*/