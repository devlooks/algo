package programmers;

public class JudgeSquareRoot {

    public static long solution(long n) {
       long answer = 0;

       // 제곱근 구하는 메서드
       double base = Math.sqrt(n);

       if (base %1 > 0) {
           answer = -1;
       }

       // pow 제곱
       else answer = (long) Math.pow(base+1, 2);
       return answer;
    }

    public static void main(String[] args) {
        long num = 100;

        long solution = solution(num);
        System.out.println(solution);
    }
}
