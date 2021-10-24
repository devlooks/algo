package programmers;

import algo.Array;

import java.util.ArrayList;
import java.util.Arrays;

// 배열에 없는 숫자 더하기
public class addNumberNotInArray {
    public static int solution(int[] numbers) {
        int answer = 0;
        int sum = 0;
        int sum1 = 0;

        int[] standardArr = {0,1,2,3,4,5,6,7,8,9};

        for(int num : numbers) {
            sum += num;
        }

        for(int num1 : standardArr) {
            sum1 += num1;
        }

        answer = sum1 - sum;

        return answer;
    }

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,6,7,8,0};

        solution(numbers);

    }
}
