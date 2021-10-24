package programmers;

import java.util.Arrays;

// 예산
public class Budget {

    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget <0) break;
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] aa = {1,3,2,5,4};
        solution(aa, 9);
    }
}
