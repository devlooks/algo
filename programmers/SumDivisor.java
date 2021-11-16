package programmers;

public class SumDivisor {

    public static int solution(int n ) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int num = 5;

        int solution = solution(num);

        System.out.println(solution);
    }
}
