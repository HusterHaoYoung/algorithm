package leetcode;

public class p069_mySqrt {
    public int mySqrt(int x) {
        long left = 0;
        long right = x / 2 + 1;
        while (left < right) {
            long y = (left + right + 1) / 2;
            if (y * y > x) {
                right = y - 1;
            } else {
                left = y;
            }
        }
        return (int) left;
    }
}
