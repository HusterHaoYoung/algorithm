LeetCode
========

### LeetCode Algorithm



| # | Title | Solution | Difficulty |Keys|
|---| ----- | -------- | ---------- |----|
|8|[字符串转换整数](https://leetcode-cn.com/problems/string-to-integer-atoi/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/myAtoi_8_Solution.java)|medium|注意数字越界问题，跳过空格，使用set集合判断是否是数字|
|7|[整数反转](https://leetcode-cn.com/problems/reverse-integer/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/reverse_7_Solution.java)|easy|注意大数越界情况即可|
|6|[Z 字形变换](https://leetcode-cn.com/problems/zigzag-conversion/submissions/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/convert_6_Solution.java)|medium|按行进行排序，rowNums行的字符容器，当到底或者到头时改变方向添加|
|5|[最长回文子串](https://leetcode-cn.com/problems/longest-palindromic-substring/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/longestPalindrome_5_Solution.java)|medium|1.最长公共子串法，即将字符串倒转过来之后与原字符串求最长公共子串，需要注意匹配上后还需检查是否是原字符串倒转前的位置<br>2.中心扩散法|
|3|[无重复字符的最长子串](https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/submissions/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/lengthOfLongestSubstring_3_Solution.java)|medium|滑动窗口，使用HashMap来查找是否存在重复元素和重复元素位置（数组，滑动窗口）|
|2|[两数相加](https://leetcode-cn.com/problems/add-two-numbers/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/addTwoNumbers_2_Solution.java)|medium|相加时注意进位，将两个链表虚拟为等长，即将短的链表补足0，即l1==null?0:l1.val（链表）|
|1|[两数之和](https://leetcode-cn.com/problems/two-sum/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/twoSum_1_Solution.java)|easy|简单遍历即可|
