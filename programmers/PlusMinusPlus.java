package programmers;

// 음양 더하기
public class PlusMinusPlus {

    public static int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;

        for (int i = 0; i < absolutes.length; i++) {

            if (signs[i] == true) {
                sum += absolutes[i];
            } else {
                sum -= absolutes[i];
            }
        }
        return sum;
    }


    public static void main(String[] args) {

        int[] aa = {4, 7, 12};
        boolean[] bb = {true, false, true};

        solution(aa, bb);
    }
}
