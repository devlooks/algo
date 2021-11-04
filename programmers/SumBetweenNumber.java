package programmers;

public class SumBetweenNumber {

    public static long solution(int a, int b) {
        long answer = 0L;
        int max = 0;
        int min = 0;

        max = Math.max(a, b);
        min = Math.min(a, b);

        for (int i = min; min <= max; min++) {
            answer += min;
        }

        return answer;
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        long c = solution(a, b);

    }

}
