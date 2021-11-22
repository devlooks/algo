package programmers;

public class ReturnEvenOdd {

    public String solution(int num) {
        String answer = "";

        if (num %2 == 0) {
            answer = "Even";
        } else answer = "Odd";

        return answer;
    }

    public static void main(String[] args) {
        ReturnEvenOdd reo = new ReturnEvenOdd();

        int num = 3;
        String solution = reo.solution(num);
        System.out.println(solution);
    }
}
