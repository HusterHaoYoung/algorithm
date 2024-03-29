package leetcode;

public class p007_reverse {
    public int reverse(int x) {
        int resNum = 0;
        while (x != 0) {
            int tmp = x % 10;
            if (resNum > Integer.MAX_VALUE / 10 || (resNum == Integer.MAX_VALUE / 10 && tmp > Integer.MAX_VALUE % 10)) {
                resNum = 0;
                break;
            }
            if (resNum < Integer.MIN_VALUE / 10 || (resNum == Integer.MIN_VALUE / 10 && tmp < Integer.MIN_VALUE % 10)) {
                resNum = 0;
                break;
            }
            resNum = 10 * resNum + tmp;
            x /= 10;
        }
        return resNum;
    }
}
