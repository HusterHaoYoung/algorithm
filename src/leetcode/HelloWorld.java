package leetcode;

import java.util.HashMap;
import java.util.Map;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("helloworld".substring(0,2));
    }

    public int lengthOfLongestSubstring(String s) {
        int head = 0;
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                head = Math.max(head, map.get(s.charAt(i)));
            }
            map.put(s.charAt(i), i + 1);
            ans = Math.max(ans, i - head + 1);
        }
        return ans;
    }
}