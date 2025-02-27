//Deque = Double Ended Queue
//Dequeue = Deletion operation in queue

import java.util.Deque;
import java.util.LinkedList;

public class MyDeque {
    public static void main(String args[]) {
        // StackUsingDeque s = new StackUsingDeque();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // while (!s.isEmpty()) {
        // System.out.println(s.pop());
        // }

        QueueUsingDeque q = new QueueUsingDeque();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}

class StackUsingDeque {
    Deque<Integer> q = new LinkedList<>();

    public boolean isEmpty() {
        return q.isEmpty();
    }

    public void push(int data) {
        q.addLast(data);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return q.removeLast();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return q.getLast();
    }

}

class QueueUsingDeque {
    Deque<Integer> q = new LinkedList<>();

    public boolean isEmpty() {
        return q.isEmpty();
    }

    public void add(int data) {
        q.addLast(data);
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return q.removeFirst();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return q.getFirst();
    }
}