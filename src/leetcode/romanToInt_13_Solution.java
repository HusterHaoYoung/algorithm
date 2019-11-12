package leetcode;

public class romanToInt_13_Solution {
    public int romanToInt(String s) {
        String[] strings = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int index = 0;
        int ans = 0;
        while (s.length() > 0) {
            while (s.length() >= strings[index].length() && s.substring(0, strings[index].length()).equals(strings[index])) {
                ans += nums[index];
                s = s.substring(strings[index].length());
            }
            index++;
        }
        return ans;
    }

}
