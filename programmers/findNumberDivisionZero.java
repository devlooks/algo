package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class findNumberDivisionZero {

    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        ArrayList<Integer> arrList = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % divisor == 0) {
                arrList.add(arr[i]);
            }
        }

        if (arrList.size() == 0) return answer = new int[]{-1};

        answer = new int[arrList.size()];
        for (int i = 0; i < answer.length; i++) {

            answer[i] = arrList.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {

        int [] a = {3,2,6};
        int divisor = 10;

        int[] b = solution(a, divisor);

        System.out.println(Arrays.toString(b));
    }
}
