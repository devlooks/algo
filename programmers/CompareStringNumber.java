package programmers;

public class CompareStringNumber {

    public static boolean solution(String s) {
        boolean answer = false;

        int a = 0; // p갯수
        int b = 0; // y갯수

        String SS = s.toUpperCase();

        char c;
        for (int i = 0; i < SS.length(); i++) {
            c = SS.charAt(i);

            if (c == 'Y') {
                a++;
            }
            else if (c == 'P') {
                b++;
            }
        }

        answer = a == b ? true : false;

        return  answer;
    }

    public static void main(String[] args) {
        String a = "pPoooyY";

        boolean b = solution(a);


    }
}
