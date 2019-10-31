package leetcode;

public class isPalindrome_9_Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String s = String.valueOf(x);
        for (int i = 0, j = s.length() - 1; i <= s.length() / 2; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }

    public boolean isPalindrome1(int x) {
        if (x < 0 || x != 0 && x % 10 == 0) return false;
        int reverseNum = 0;
        while (x > reverseNum) {
            int tmp = x % 10;
            reverseNum = 10 * reverseNum + tmp;
            x /= 10;
        }
        return x == reverseNum || x == reverseNum / 10;
    }
}
