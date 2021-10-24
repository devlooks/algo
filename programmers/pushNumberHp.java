package programmers;

// 핸드폰 버튼 누르기
public class pushNumberHp {
    public static String solution(int[] numbers, String hand) {
        String answer ="";

        StringBuilder sb = new StringBuilder();
        int left = 10, right = 12; // 10 -> *, 12 -> #
        int L_dis = 0, R_dis= 0;
        for(int n : numbers) {

            // 누른 버튼이 1,4,7일 경우
            if (n == 1 || n == 4 || n == 7) {

                sb.append("L");
                left = n;
            // 누른 버튼이 3,6,9일 경우
            } else if (n == 3 || n == 6 || n == 9) {

                sb.append("R");
                right = n;
            // 누른버튼이 가운데 2.5.8.0 일 경우
            } else {
                // 0 버튼 -> 11
                if (n == 0) n += 11;
                
                // 왼손에서의 버튼 거리 계산
                L_dis = (Math.abs(n-left)/3 + Math.abs(n-left)%3);
                
                // 오른손에서의 버튼 거리 계산
                R_dis = (Math.abs(right-n)/3 + Math.abs(n-right)%3);

                if (L_dis == R_dis) {
                    // 범위가 같을때, 그리고 오른손잡이 일 때,
                    if(hand.equals("right")) {
                        sb.append("R");
                        right = n;
                    // 범위가 같지 않을때, 그리고 왼손잡이 일 때,    
                    } else {
                        sb.append("L");
                        left = n;
                    }
                    
                // 왼손에서 거리가 멀때,    
                } else if (L_dis > R_dis) {
                    sb.append("R");
                    right = n;
                // 오른손에서 거리가 더 벌 멀때,    
                } else {
                    sb.append("L");
                    left = n;
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        String ans = solution(numbers, hand);
        System.out.println(ans);
    }
}
