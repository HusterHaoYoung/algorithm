package leetcode;

import java.util.HashMap;
import java.util.Map;

public class p003_lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int head = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                head = Math.max(head, hashMap.get(s.charAt(i)));
            }
            ans = Math.max(ans, i - head + 1);
            hashMap.put(s.charAt(i), i + 1);
        }
        return ans;
    }

}
