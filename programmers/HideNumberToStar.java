package programmers;

public class HideNumberToStar {

    public String solution(String phone_number) {
        String answer = "";

        for (int i = 0; i < phone_number.length(); i++) {
            if (i < phone_number.length()-4){
                answer += "*";
            }
            else {
                answer += phone_number.charAt(i);
            }
        }
        

        return answer;
    }

    public static void main(String[] args) {
        HideNumberToStar hts = new HideNumberToStar();

        String aa = "01033334444";
        String solution = hts.solution(aa);
        System.out.println(solution);
    }
}
