package programmers;

public class ChangeIntegerToString {

    public static int solution(String s) {
        int answer = 0;

        answer = Integer.parseInt(s);

        return answer;
    }

    public static void main(String[] args) {
        String str = "-1234";

        int solution = solution(str);

        System.out.println(solution);
    }
}
