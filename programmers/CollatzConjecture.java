package programmers;

public class CollatzConjecture {

    public static int solution(int num) {
        int answer = 0;

        while (num != 1) {

            if (num%2 == 0) {
                num /= 2;
            }else {
                num  = 3*num+1;
            }
            answer++;

            if (answer > 400) {
                answer = -1; break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        int n = 626331;

        int solution = solution(n);
        System.out.println(solution);
    }
}
