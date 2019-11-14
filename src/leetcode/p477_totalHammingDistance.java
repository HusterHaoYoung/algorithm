package leetcode;

public class p477_totalHammingDistance {
    public int totalHammingDistance(int[] nums) {
        int ans = 0;
        int[][] data = new int[nums.length][];
        for (int i = 0; i < nums.length; i++) {
            data[i] = new int[31];
            int m = 1;
            for (int j = 0; j < 31; j++) {
                data[i][j] = (nums[i] & m) != 0 ? 1 : 0;
                m = m << 1;
            }
        }
        for (int i = 0; i < 31; i++) {
            int cnt0 = 0;
            int cnt1 = 0;
            for (int j = 0; j < nums.length; j++) {
                if (data[j][i] == 0)
                    cnt0++;
                else
                    cnt1++;
            }
            ans += cnt0 * cnt1;
        }
        return ans;

    }


    public static void main(String[] args) {
        System.out.println(8 & 7);
    }
}
