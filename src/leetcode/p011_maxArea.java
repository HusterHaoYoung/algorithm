package leetcode;

public class p011_maxArea {
    public int maxArea(int[] height) {
        int head = 0;
        int tail = height.length - 1;
        int maxArea = 0;
        while (head < tail) {
            if (height[head] < height[tail]) {
                maxArea = Math.max(height[head] * (tail - head),maxArea);
                head++;
            }else {
                maxArea = Math.max(height[tail] * (tail - head),maxArea);
                tail--;
            }
        }
        return maxArea;
    }
}
