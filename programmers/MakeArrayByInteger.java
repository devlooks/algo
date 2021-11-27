package programmers;

import java.util.Arrays;

public class MakeArrayByInteger {

    public static int[] solution(long n ) {
        String str = String.valueOf(n);

        int[] answer = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            answer[str.length() - i- 1]  = Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        return answer;
    }


    public static void main(String[] args) {

        long num = 12345;

        int[] solution = solution(num);

        System.out.println(Arrays.toString(solution));
    }
}
