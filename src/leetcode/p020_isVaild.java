package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class p020_isVaild {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashSet<Character> set1 = new HashSet<>();
        set1.add('(');
        set1.add('[');
        set1.add('{');
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put(')', '(');
        hashMap.put(']', '[');
        hashMap.put('}', '{');
        for (int i = 0; i < s.length(); i++) {
            if (set1.contains(s.charAt(i))) {
                stack.push(s.charAt(i));
            }else {
                if(stack.empty()||!stack.pop().equals(hashMap.get(s.charAt(i)))){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
