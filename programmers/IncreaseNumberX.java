package programmers;

import java.util.Arrays;

public class IncreaseNumberX {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long temp = x;

        for (int i = 0; i < n; i++) {
            answer[i] = temp*(i+1);
        }
        
        return answer;
    }

    public static void main(String[] args) {
        IncreaseNumberX inx = new IncreaseNumberX();

        int x = 2;
        int n = 5;

        long[] solution = inx.solution(x, n);

        System.out.println(Arrays.toString(solution));
    }
}
