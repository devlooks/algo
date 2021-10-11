package programmers;

import java.util.Arrays;

public class trainningClothes {

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] students = new int[n];

        // students array에 parameter datas 반영
        for(int i = 0 ; i < n ; i++) {
            students[i] = 1;
        }
        for(int i : reserve) {
            students[i-1]++;
        }
        for(int i : lost) {
            students[i-1]--;
        }

        // 빌려주는 과정
        for(int i = 0 ; i < n ; i++) {
            if(students[i] == 0) {
                if(i > 0 && students[i-1] > 1) {
                    students[i-1]--;
                    students[i]++;
                }
                else if(i < n-1 && students[i+1] > 1) {
                    students[i+1]--;
                    students[i]++;
                }
            }
        }

        // 수업들을 수 있는 학생 수 확인
        for(int i : students) {
            if(i > 0) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        solution(5,lost, reserve);
    }
}
