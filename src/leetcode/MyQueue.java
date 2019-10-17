package leetcode;

import java.util.LinkedList;
import java.util.Queue;

class MyListNode<T> {
    MyListNode next;
    T val;

    MyListNode(T val) {
        this.val = val;
    }
}

public class MyQueue<T> {
    MyListNode<T> head;
    MyListNode<T> tail = head;

    boolean add(T val) {
        try {
            MyListNode<T> tmp = new MyListNode<T>(val);
            tail.next = tmp;
            tail = tmp;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    boolean isEmpty() {
        return head == null;
    }

    MyListNode pop() {
        if (this.isEmpty()){
            return null;
        }
        MyListNode tmp = head;
        head = head.next;
        return tmp;
    }
}
