package programmers;

import java.util.Arrays;
// k 번째수
public class kNumber {

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];

        for (int i = 0; i < commands.length; i++) {
            // arr1, n, n2 -> arr1에서 n번째(index n) 부터 n2(index n2-1) 이전 배열 요소까지 복사
            int temp[] = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);

            answer[i] = temp[commands[i][2]-1];
        }


        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};


        solution(array, commands);
    }
}


