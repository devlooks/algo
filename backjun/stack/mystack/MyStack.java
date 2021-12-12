package backjun.stack.mystack;

import java.util.ArrayList;
import java.util.Arrays;

public class MyStack <T>{
    private ArrayList<T> stack = new ArrayList<T>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        // size는 1부터, 하지만 Array 인덱스는 0 부터이기 떄문에 -1
        return stack.remove(stack.size() - 1);
    }

    public boolean isFull() {
        boolean flag = false;



        return flag;
    }

    public String top() {
        String top = "";

        return top;
    }


    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        MyStack<Integer> ms = new MyStack<>();

        ms.push(1);
        ms.push(2);
        System.out.println(ms.pop());
        ms.push(3);
        System.out.println(ms.pop());
        System.out.println(ms.pop());
    }

}
