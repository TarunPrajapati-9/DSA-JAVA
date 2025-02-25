import java.util.*;

public class MyStack {
    public static void main(String[] args) {
        StackUsingLinkedList s1 = new StackUsingLinkedList();
        s1.push(1);
        s1.push(2);
        s1.push(3);

        s1.pop();

        while (!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}

class StackUsingArray {
    ArrayList<Integer> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public void push(int data) {
        list.add(data);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty(Underflow)");
            return -1;
        }
        int top = list.remove(list.size() - 1);
        return top;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty(Underflow)");
            return -1;
        }
        return list.get(list.size() - 1);
    }
}

class StackUsingLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty(Underflow)");
            return -1;
        }
        return head.data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty(Underflow)");
            return -1;
        }

        int top = head.data;
        head = head.next;
        return top;
    }
}