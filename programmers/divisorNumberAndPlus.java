package programmers;

// 약수의 개수와 덧셈
public class divisorNumberAndPlus {

    public static int solution(int left, int right) {
        int answer = 0;
        int count;

        for (int i = left; i <= right; i++) {
            count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count % 2 == 0) {
                answer +=i;
            } else {
                answer -=i;
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        int aa = solution(13, 17);
        System.out.println("aa : " + aa);
    }

}
