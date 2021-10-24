package programmers;

import java.util.HashMap;

// 마라톤
public class Marathon {

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        // 모든 플레이어의 value를 1로 만든다.
        for (String player : participant) {

            if (map.containsKey(player) == true) {
                int result = map.get(player);
                map.put(player, result+1);
            } else {
                map.put(player, 1);
            }
        }

        // 그중에 완주한 player만 0으로 만든다.
        for (String player : completion) {
            int result = map.get(player);
            map.put(player, result -1);
        }

        // 그러면 0이 아닌 플레이어는 완주를 못한것으로 처리하면 된다.
        for (String player : participant) {
            if (map.get(player) != 0) {
                answer = player;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(solution(participant, completion));
    }
}
