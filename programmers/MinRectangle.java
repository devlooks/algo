package programmers;

public class MinRectangle {
    public static int solution(int[][] sizes) {
        int answer = 0;
        int garo = 0;
        int sero = 0;

        for (int i = 0; i < sizes.length; i++) {
//            60 50
//            30 70
//            60 30
//            80 40
            if (sizes[i][0] >= sizes[i][1]) {
                garo = Math.max(sizes[i][0], garo);
                sero = Math.max(sizes[i][1], sero);
            } else {
                garo = Math.max(sizes[i][1], garo);
                sero = Math.max(sizes[i][0], sero);
            }
        }
        answer = garo * sero;
        return answer;
    }

    public static void main(String[] args) {
        int[][] aa = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        int bb = solution(aa);

        System.out.println(bb);
    }
}
