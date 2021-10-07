package programmers;

// 배열 숫자들로 소수 만들기
public class makePrimeNumberinArray {

    public static int solution(int[] nums) {
        int ans = 0;

        // nums.length-2 = 2
        // 배열의 수를 각각 뽑아와 더한다.
        // i 는 영번째 부터,
        // j 는 i 부터 1을 더하며 순회(0을 제외 시킨다)
        // k 는 j 부터 1을 더하며 순회(1을 제외 시킨다)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int n = nums[i] + nums[j] + nums[k];

                    System.out.println(nums[i] + "" + nums[j] + "" + nums[k]);

                    if (isPrime(n)) {
                        ans++;
                    }
                }
            }
        }


        return ans;
    }

    // 소수 개념 : 1과 자신 이외의 자연수로는 나눌 수 없는, 1보다 큰 자연수이다
    private static boolean isPrime(int n) {
        
        // 1 외 이므로 2부터 그리고 자기 숫자 까지의 수를 가지고 나눔
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        solution(a);
    }
}
