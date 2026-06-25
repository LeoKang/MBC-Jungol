package programmers.d0625;


//class Solution {
//    public int[] solution(int[][] score) {
//        int n = score.length;
//        double[] avg = new double[n];
//        int[] answer = new int[n];
//
//
//        for (int i = 0; i < n; i++) {
//            avg[i] = (score[i][0] + score[i][1]) / 2.0;
//        }
//
//
//        for (int i = 0; i < n; i++) {
//            int rank = 1;
//            for (int j = 0; j < n; j++) {
//                if (avg[j] > avg[i]) {
//                    rank++;
//                }
//            }
//            answer[i] = rank;
//        }
//        return answer;
//    }
//}

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        rankRecursive(score, answer, 0);
        return answer;
    }

    private void rankRecursive(int[][] score, int[] answer, int pointer) {
        if (pointer == score.length) {
            return;
        }

        int mySum = score[pointer][0] + score[pointer][1];
        int rank = 1;

        for (int j = 0; j < score.length; j++) {
            if ((score[j][0] + score[j][1]) > mySum) {
                rank++;
            }
        }
        answer[pointer] = rank;

        rankRecursive(score, answer, pointer + 1);
    }


//public class Solution {
//    public int[] solution(int[][] score) {
//        int[] answer = new int[score.length];
//        int[] scoreSum = new int[score.length];
//
//        for (int i = 0; i < score.length; i++) {
//            for (int j = 0; j < score[i].length; j++) {
//                System.out.print(score[i][j] + " ");
//                scoreSum[i] += score[i][j];
//            }
//            System.out.println();
//        }
//
//
//        answer = Arrays.copyOf(scoreSum, scoreSum.length);
//        Arrays.sort(scoreSum);
//
//        System.out.print("scoreSum : ");
//        for (int i = 0; i < answer.length; i++) {
//            System.out.print(scoreSum[i] + " ");
//        }
//        System.out.println("------");
//        System.out.print("answer   : ");
//        for (int i = 0; i < answer.length; i++) {
//            System.out.print(answer[i] + " ");
//        }
//        System.out.println();
//
//        int before = -1;
//        for (int i = 0; i < answer.length; i++) {
//            int num = answer.length - i;
//            before = num;
//            for (int j = 0; j < answer.length; j++) {
//                if (scoreSum[i] == answer[j]) {
//                    answer[j] = num;
//                }
//            }
//        }
//
////        System.out.println("------");
////        System.out.print("answer   : ");
////        for (int i = 0; i < answer.length; i++) {
////            System.out.print(answer[i] + " ");
////        }
//
//        return answer;
//    }
//
    static void main() {
        int score[][] = {
                {80, 70},
                {90, 50},
                {40, 70},
                {50, 80},
        };

        int score2[][] = {
                {80, 70},
                {70, 80},
                {30, 50},
                {90, 100},
                {100, 90},
                {100, 100},
                {10, 30},
        };

        Solution s = new Solution();
        int[] ret = s.solution(score);

        for(int i=0;i< ret.length;i++) {
            System.out.print(ret[i] + " ");
        }
    }
}
