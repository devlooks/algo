package programmers;

import algo.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ExceptDupNumber {

    public static int[] solution(int[] arr) {
        int[] answer = {};

        ArrayList<Integer> arrList = new ArrayList<>();
        int num = 10; // 0보다 크거나 같고 9보다 작거나 같은 정수
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != num) {
                arrList.add(arr[i]);
                num = arr[i];
            }
        }

        answer = new int[arrList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        int [] aa = {1,1,3,3,0,1,1};
        int[] bb = solution(aa);

        System.out.println(Arrays.toString(bb));

    }
}
