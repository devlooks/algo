package programmers;

public class CalcPriceForAmuseLand {

    public static long solution(int price, int money, int count) {
        long answer = -1;

        long sum = 0;
        long nth_price = price;

        for (int i = 1; i <= count ; i++) {
            sum += nth_price;
            nth_price += price;
        }

        answer = sum - money;

        if (answer <= 0) return 0;

        return answer;
    }

    public static void main(String[] args) {

        long aa = solution(3, 20, 4);

        System.out.println(aa);
    }
}
