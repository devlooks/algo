package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveMinimum {

    public int[] solution(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);
        int min = temp[0];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                list.add(arr[i]);
            }
        }

        int[] answer;
        if (list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {4,3,2,1};
        RemoveMinimum rm = new RemoveMinimum();
        int[] solution = rm.solution(arr);
        System.out.println(Arrays.toString(solution));
    }
}
