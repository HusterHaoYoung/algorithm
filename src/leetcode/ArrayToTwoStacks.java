package leetcode;

public class ArrayToTwoStacks {
    int array[] = new int[100];
    int top1 = -1, top2 = array.length;

    class Stack1 {

        boolean push(int i) {
            if (top1 + 1 == top2) return false;
            top1++;
            array[top1] = i;
            return true;
        }

        int pop() {
            int tmp = array[top1];
            top1--;
            return array[top1--];
        }
    }

    class Stack2 {
        boolean push(int i) {
            if (top1 + 1 == top2) return false;
            top2--;
            array[top2] = i;
            return true;
        }

        int pop() {
            int tmp = array[top2];
            top2++;
            return tmp;
        }
    }
}
