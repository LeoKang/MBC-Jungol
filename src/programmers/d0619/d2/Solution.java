package programmers.d0619.d2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 코딩테스트 연습 > 코딩 기초 트레이닝 > 세 개의 구분자

class Solution {
    public String[] solution(String myStr) {
        String[] splitArr = myStr.split("[abc]");

        List<String> result = new ArrayList<>();
        for (String s : splitArr) {
            if (!s.isEmpty()) {
                result.add(s);
            }
        }

        if (result.isEmpty()) {
            return new String[]{"EMPTY"};
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("baconlettucetomato"));
    }
}
/*
class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replace('b', 'a').replace('c', 'a');

        myStr = myStr.replaceAll("a+", " ").trim();

        if (myStr.isEmpty()) {
            return new String[]{"EMPTY"};
        }

        return myStr.split(" ");
    }
}
*/
/*
class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        List<String> lst = new ArrayList<>();

        String temp = "";
        int idx = 0;
        for (int i = 0; i < myStr.length(); i++) {
            char c = myStr.charAt(i);
            if (c == 'a' || c == 'b' || c == 'c') {
                if (temp != "") {
                    System.out.println(temp);
                    lst.add(temp);
                    temp = "";
                }
            } else {
                temp += c;
            }
        }
        System.out.println(temp);
        lst.add(temp);

        String[] array = lst.toArray(new String[0]);
        System.out.println(Arrays.toString(array));

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("baconlettucetomato"));
    }
}
*/