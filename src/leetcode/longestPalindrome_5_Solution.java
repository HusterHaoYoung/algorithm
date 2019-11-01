package leetcode;

public class longestPalindrome_5_Solution {
    public String longestPalindrome(String s) {
        if (s.equals("")) {
            return "";
        }
        int length = s.length();
        String reverse = new StringBuffer(s).reverse().toString();
        int[][] arr = new int[length][length];
        int maxLen = 0;
        int maxIndex = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (s.charAt(i) == reverse.charAt(j)) {
                    if (i == 0 || j == 0) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = arr[i - 1][j - 1] + 1;
                    }
                }
                if (arr[i][j] > maxLen) {
                    int beforeRev = length - j - 1;
                    if (i == beforeRev + arr[i][j] - 1) {
                        maxLen = arr[i][j];
                        maxIndex = i;
                    }
                }
            }
        }
        return s.substring(maxIndex - maxLen + 1, maxIndex + 1);
    }

    public String longestPalindrome1(String s) {
        if (s.equals("")) {
            return "";
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = distance(s, i, i);
            int len2 = distance(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start + 1) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public int distance(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;

    }
}
