package programmers;

public class MakeRectagleToStar {

    public void solution(int a, int b){

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        MakeRectagleToStar mrt = new MakeRectagleToStar();
        mrt.solution(5,3);
    }
}
