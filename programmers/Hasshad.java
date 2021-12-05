package programmers;

public class Hasshad {

    public boolean solution(int x) {
        boolean answer = true;

        int num = x;
        int sum = 0;

        while(num != 0) {
            sum += num%10;
            num = num/10;
        }

        if (x%sum != 0) {
            answer = false;
        }

        return answer;
    }
    public static void main(String[] args) {
        Hasshad hs = new Hasshad();

        int n = 10;

        hs.solution(n);
    }
}
