package programmers;

import java.util.Arrays;

public class IntegerDecentSort {

    public static long solution(long n) {
        long answer = 0;

        String str = n + "";
        int[] arr = new int[str.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i) - '0';
        }

        Arrays.sort(arr);
        str = "";

        for (int i = arr.length-1; i > -1; i--) {
            str += arr[i];
        }

        answer = Long.valueOf(str);

        return answer;
    }

    public static void main(String[] args) {
        
        long n = 118372;
        long solution = solution(n);
        System.out.println(solution);
    }
}
