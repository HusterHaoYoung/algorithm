package leetcode;

import java.util.HashSet;
import java.util.Set;

public class p008_myAtoi {
    public static int myAtoi(String str) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }
        int idx = 0;
        while (idx < str.length() && ' ' == str.charAt(idx)) {
            idx++;
        }
        if (idx == str.length()) {
            return 0;
        }
        int flag = 0;
        if ('-' == str.charAt(idx)) {
            flag = 1;
            idx++;
        } else if ('+' == str.charAt(idx)) {
            idx++;
        }
        int tmp = 0;
        while (idx < str.length() && set.contains(str.charAt(idx) - '0')) {
            if (tmp > Integer.MAX_VALUE / 10 || (tmp == Integer.MAX_VALUE / 10 && str.charAt(idx) - '0' > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            } else if (tmp < Integer.MIN_VALUE / 10 || (tmp == Integer.MIN_VALUE / 10 && str.charAt(idx) - '0' > Integer.MIN_VALUE % 10 * -1)) {
                return Integer.MIN_VALUE;
            }
            if (flag == 0)
                tmp = 10 * tmp + str.charAt(idx) - '0';
            else
                tmp = 10 * tmp - (str.charAt(idx) - '0');

            idx++;
        }
        return tmp;

    }
}
