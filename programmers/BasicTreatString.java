package programmers;

public class BasicTreatString {

    public static boolean solution(String s) {

        if (s.length() != 4 && s.length() != 6) return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0'|| s.charAt(i) > '9') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String aa = "a234";

        solution(aa);
    }
}
