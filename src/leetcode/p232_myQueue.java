package leetcode;

import java.util.Stack;

public class p232_myQueue {

    Stack<Integer> s1;
    Stack<Integer> s2;

    /**
     * Initialize your data structure here.
     */
    public p232_myQueue() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        s1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (s2.empty()) {
            while (!s1.empty()) s2.push(s1.pop());
            return s2.pop();
        }else
            return s2.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (s2.empty()) {
            while (!s1.empty()) s2.push(s1.pop());
            return s2.peek();
        }else
            return s2.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        if (s1.empty() && s2.empty())
            return true;
        else
            return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */