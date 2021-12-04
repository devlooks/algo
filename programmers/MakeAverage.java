package programmers;

public class MakeAverage {

    public double solution(int[] arr) {
        double answer = 0;
        int num = arr.length;

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        answer = answer/arr.length;
        
        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        MakeAverage ma = new MakeAverage();

        double solution = ma.solution(arr);
        System.out.println(solution);
    }
}
