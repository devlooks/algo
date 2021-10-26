package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class FindRemainderOne {

    public static int solution(int n) {
        int answer = 0;

        ArrayList xList = new ArrayList();

        for (int i = 1; i <= n; i++) {
            if (n%i == 1) {
                xList.add(i);
            }
        }

        Collections.sort(xList);
        answer = (int) xList.get(0);

        return answer;
    }

    public static void main(String[] args) {

        int aa = solution(100);

        System.out.println(aa);
    }
}
