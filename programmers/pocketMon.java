package programmers;

import java.util.Arrays;
// 포켓몬
public class pocketMon {

    public static int solution(int[] nums) {
        int answer = 0;

        int[] counts = new int[200001];

        for (int i = 0; i < nums.length ; i++) {

            if (counts[nums[i]] == 0) {
                answer++;
            }

            counts[nums[i]]++;
        }

        if (answer > nums.length /2) {
            answer = nums.length /2;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,4};
        int aa = solution(nums);
        System.out.println(aa);
    }
}
