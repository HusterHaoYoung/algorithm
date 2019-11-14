package leetcode;

public class p014_longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String s = "";
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int flag = 0;
        while (index < strs[0].length()) {
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() <= index || strs[0].charAt(index) != strs[i].charAt(index)) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                break;
            }
            sb.append(strs[0].charAt(index++));
        }
        return sb.toString();
    }

    public String longestCommonPrefix1(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        int min = Integer.MAX_VALUE;
        for (String s : strs) {
            min = Math.min(min, s.length());
        }
        int low = 0;
        int high = min;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isCommonPrefix(strs, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return strs[0].substring(0, (low + high) / 2);
    }

    public boolean isCommonPrefix(String[] strings, int len) {
        String prefix = strings[0].substring(0, len);
        for (String s : strings) {
            if (!s.startsWith(prefix)) {
                return false;
            }
        }
        return true;
    }
}