package programmers;

import java.util.ArrayList;
import java.util.*;
import java.util.Collection;
import java.util.Collections;

public class DescendingString {

    public static String solution(String s) {
        String answer = "";

        String[] array = s.split("");
        Arrays.sort(array);
        Collections.reverse(Arrays.asList(array));

        return String.join("", array);
    }

    public static void main(String[] args) {
        String aa = "Zbcdefg";

        solution(aa);
    }
}
