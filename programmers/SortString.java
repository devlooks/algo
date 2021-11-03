package programmers;

import java.util.*;

public class SortString {

    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        ArrayList<String> array = new ArrayList<String>();

        for (int i=0; i<strings.length; i++) {
            array.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(array);

        for (int i=0; i<array.size(); i++) {
            answer[i] = array.get(i).substring(1);
        }

        return answer;
    }

    public static void main(String[] args) {

        String[] aa = {"sun", "bed", "car"};

        String[] bb = solution(aa, 1);

        System.out.println(Arrays.toString(bb));
    }
}
