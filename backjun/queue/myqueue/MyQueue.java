package backjun.queue.myqueue;

import java.util.ArrayList;

public class MyQueue <T> {

    private ArrayList<T> queue = new ArrayList<T>();

    public void enqueue(T data) {
        queue.add(data);
    }

    public T dequeue() {
        
        // 빈값 체크
        if (queue.isEmpty()) {
            return null;
        }
        // 맨 앞의 데이터를 지정 및 삭제
        // remove가 위치 정렬 해줌
        return queue.remove(0);
    }
    
    // 비어있는지 체크
    public Boolean isEmpty() {
        return queue.isEmpty();
    }

    public void printAllElement() {
        System.out.println(queue);
    }

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(1);
        myQueue.enqueue(2);

        myQueue.printAllElement();
        myQueue.dequeue();
        myQueue.printAllElement();


    }

}
