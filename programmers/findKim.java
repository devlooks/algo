package programmers;

public class findKim {

    public static String solution(String[] seoul) {
        String answer = "";
        int place = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].contains("Kim")) {
                place = i;
            }
        }

        answer = "김서방은 " +  place + "에 있다.";


        return answer;
    }

    public static void main(String[] args) {

        String[] aa = {"Jane", "Kim"};
        String bb = solution(aa);
        System.out.println(bb);
    }
}
