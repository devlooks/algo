package programmers;

import algo.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 모의고사 채점하기
public class GradeMockExam {

    public static int[] solution(int[] answers) {
        int[] point = {0,0,0}; // 점수 카운트
        int[] pointCopy = {}; // 점수표 정렬용
        int max = 0; // 점수 최대 값

        List<Integer> list = new ArrayList<>();

        int[][] resolvePattern = {
            {1,2,3,4,5}
            , {2,1,2,3,2,4,2,5}
            , {3,3,1,1,2,2,4,4,5,5}
        };

        for (int i = 0; i < answers.length; i++) {
            if (resolvePattern[0][i%5] == answers[i]) {
                point[0]++;
            }

            if (resolvePattern[1][i%8] == answers[i]) {
                point[1]++;
            }

            if (resolvePattern[2][i%10] == answers[i]) {
                point[2]++;
            }
        }

        pointCopy = point.clone();
        Arrays.sort(pointCopy);
        max = pointCopy[2];

        for (int i = 0; i < point.length; i++) {
            if (point[i] == max) {
                list.add(i+1);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] bb = {1,2,3,4,5};
        int[] aa = solution(bb);

        System.out.println(Arrays.toString(aa));
    }
}
