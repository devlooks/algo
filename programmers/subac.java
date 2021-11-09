package programmers;

public class subac {

    public static String solution(int n ) {
        String answer = "";

        for (int i = 1; i <= n; i++) {

            if (i%2 == 0) {
                answer += "박";
            } else answer += "수";
        }

        return answer;
    }

    public static void main(String[] args) {
        String aa = solution(3);

        System.out.println(aa);
    }
}
