package programmers;

import java.util.Stack;

public class crane {
        public static int solution(int[][] board, int[] moves) {
            int answer = 0;

            Stack<Integer> stack = new Stack<>();

            for (Integer move : moves) {
                int moveIndex = move - 1;

                for(int i = 0; i < board.length; i++) {
                    int k = board[i][moveIndex];

                    if (k == 0) continue;

                    if (!stack.empty() && stack.peek() == k) {
                        stack.pop();
                        answer++;
                    }
                    else {
                        stack.push(k);
                    }

                    board[i][moveIndex] = 0;
                    break;
                }
            }
            answer = answer *2;
            return answer;
        }

        public static void main(String[] args) {
            int[][] board = new int[][] {
                    {0, 0, 0, 0, 0}
                    , {0, 0, 1, 0, 3}
                    , {0, 2, 5, 0, 1}
                    , {4, 2, 4, 4, 2}
                    , {3, 5, 1, 3, 1}
            };
            int[] moves = new int[]{1,5,3,5,1,2,1,4};

            int answer = solution(board, moves);
            System.out.println("answer : " + answer);
        }
    }

