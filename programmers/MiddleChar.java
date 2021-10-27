package programmers;

public class MiddleChar {

    public static String solution(String s) {
        String answer = "";

        if (s.length()%2 == 0) {
            answer =String.valueOf(s.charAt(s.length()/2 - 1))
                    + String.valueOf(s.charAt(s.length()/2));
        } else {
            answer = String.valueOf(s.charAt(Math.round(s.length()/2)));
        }


        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        String aa = "abcde";
        solution(aa);
    }
}
