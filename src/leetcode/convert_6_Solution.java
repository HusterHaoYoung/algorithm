package leetcode;

import java.util.ArrayList;
import java.util.List;

public class convert_6_Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        int n = Math.min(numRows, s.length());
        ArrayList<StringBuffer> ret = new ArrayList<>();
        for (int i = 0; i < n; i++) ret.add(new StringBuffer());
        int index = 0;
        int direction = 0;
        boolean flag = false;
        for (char x : s.toCharArray()) {
            ret.get(index).append(x);
            if (index == 0 || index == n - 1) {
                flag = !flag;
            }
            index += direction = flag ? 1 : -1;
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuffer sb : ret) {
            ans.append(sb);
        }
        return ans.toString();
    }
}
