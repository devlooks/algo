package programmers;

import java.util.Arrays;

// 로또
public class lottos {

    public static int[] solution(int[] lottos, int[] win_nums) {
        int zero_cnt = 0;
        int matched = 0;

        for (int l : lottos) {
            if (l == 0) {
                zero_cnt++;
            } else {
                for (int w : win_nums) {
                    if (w == l) {
                        matched++;
                        break;
                    }
                }
            }
        }
        
        // 최소 맞춤 점수
        int min = matched;
        
        // 최소 맞춤 점수 + 못알아보는 번호 맞춤 점수
        int max = matched + zero_cnt;
        System.out.println("min : " + min + " max : " + max);
        
        // 낙첨 방지
        int[] answer = {Math.min(7 - max, 6), Math.min(7 -min, 6)};
        return answer;
    }

    public static void main(String[] args) {

        int[] lottos = {44,1,0,0,31,25};
        int[] win_nums = {31,10,45,1,6,19};


        System.out.println(Arrays.toString(solution(lottos, win_nums)));
    }
}
