package programmers;

// 숫자 문자열과 영단어
public class NumAndVoca {

    public static int solution(String s) {
        int answer = 0;

        String[] num = {"0","1","2","3","4","5","6","7","8","9"};
        String[] vacas = {"zero", "one", "two", "three", "four", "five"
                        ,"siz", "seven", "eight", "nine"};

        for (int i = 0; i < vacas.length; i++) {
            s = s.replace(vacas[i], num[i]);
        }

        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution("one4seveneight"));
    }
}
