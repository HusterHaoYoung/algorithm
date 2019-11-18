LeetCode
========

### LeetCode Algorithm



| # | Title | Solution | Difficulty |Keys|note|
|---| ----- | -------- | ---------- |----|----|
|54|[螺旋矩阵](https://leetcode-cn.com/problems/spiral-matrix/submissions/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/p054_spiralOrder.java)|medium|使用一个level变量记录循环层数，分为四个方向的循环，即右下左上，每循环一次判断是否该退出循环|数组、模拟|
|25|[K 个一组翻转链表](https://leetcode-cn.com/problems/reverse-nodes-in-k-group/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/p025_reverseKGroup.java)|hard|24题的变式，使用一个指针记录上一次翻转的尾节点，一个指针记录这一次翻转的尾节点，注意翻转一次后链表断裂|链表|
|24|[两两交换链表中的节点 ](https://leetcode-cn.com/problems/swap-nodes-in-pairs/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/p024_swapPairs.java)|medium|使用一个tail指针每次记录上一次交换的指针位置,新建一个虚拟头结点来解决头结点交换问题|链表|
|21|[合并两个有序链表](https://leetcode-cn.com/problems/merge-two-sorted-lists/solution/hua-jie-suan-fa-21-he-bing-liang-ge-you-xu-lian-bi/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/p021_mergeTwoLists.java)|easy|方法一：迭代法，使用一个假的头结点简化代码。<br>方法二：递归法，终止条件：l1为空或者l2为空。递归体：链表头选择与连接。|链表、递归|
|20|[有效的括号](https://leetcode-cn.com/problems/valid-parentheses/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/p020_isVaild.java)|easy|使用栈，左括号进栈，右括号出栈匹配|栈|
|19|[删除链表的倒数第N个节点](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/p019_removeNthFromEnd.java)|medium|快慢指针法达到一次循环解决问题，即快指针先走n - 1步，快指针走到最后一个节点时，慢指针即为要删除节点，使用一个临时变量存储慢指针的前一个指针即可|快慢指针法|
|18|[四数之和](https://leetcode-cn.com/problems/4sum/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/p018_fourSum.java)|medium|两重循环加双指针|双指针法|
|17|[×××电话号码的字母组合](https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/p017_letterCombinations.java)|medium|回溯法，×××××暂时还不会|××××××××|
|16|[最接近的三数之和](https://leetcode-cn.com/problems/3sum-closest/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/p016_threeSumClosest.java)|medium|15题变形|双指针法|
|15|[三数之和](https://leetcode-cn.com/problems/3sum/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/p015_threeSum.java)|medium|外层循环，加双指针，注意去重|双指针法|
|14|[最长公共前缀](https://leetcode-cn.com/problems/longest-common-prefix/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/p014_romanToInt.java)|easy|使用String的startWith方法，使用二分法加快查找效率，注意二分法边界问题|二分法|
|13|[罗马数字转整数](https://leetcode-cn.com/problems/roman-to-integer/submissions/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/p013_romanToInt.java)|easy|12题的变形|常量编码技巧|
|12|[整数转罗马数字](https://leetcode-cn.com/problems/integer-to-roman/submissions/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/p012_intToRoman.java)|medium|使用数组储存常量使代码简约|常量编码技巧|
|11|[盛最多水的容器](https://leetcode-cn.com/problems/container-with-most-water/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/p011_maxArea.java)|medium|双指针法：短的往中间移|双指针法|
|9|[回文数](https://leetcode-cn.com/problems/palindrome-number/solution/hui-wen-shu-by-leetcode/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/p009_isPalindrome.java)|easy|反转一般的数字，判断反转后的数字和剩下的数字是否相等（偶数位数），或者除10是否相等（奇数位数）|回文数|
|8|[字符串转换整数](https://leetcode-cn.com/problems/string-to-integer-atoi/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/p008_myAtoi.java)|medium|注意数字越界问题，跳过空格，使用set集合判断是否是数字|整形数字越界|
|7|[整数反转](https://leetcode-cn.com/problems/reverse-integer/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/p007_reverse.java)|easy|注意大数越界情况即可|整形数字越界|
|6|[Z 字形变换](https://leetcode-cn.com/problems/zigzag-conversion/submissions/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/p006_convert.java)|medium|按行进行排序，rowNums行的字符容器，当到底或者到头时改变方向添加|数学规律|
|5|[最长回文子串](https://leetcode-cn.com/problems/longest-palindromic-substring/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/p005_longestPalindrome.java)|medium|1.最长公共子串法，即将字符串倒转过来之后与原字符串求最长公共子串，需要注意匹配上后还需检查是否是原字符串倒转前的位置<br>2.中心扩散法|中心扩散法|
|3|[无重复字符的最长子串](https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/submissions/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/p003_lengthOfLongestSubstring.java)|medium|滑动窗口，使用HashMap来查找是否存在重复元素和重复元素位置（数组，滑动窗口）|滑动窗口|
|2|[两数相加](https://leetcode-cn.com/problems/add-two-numbers/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/p002_addTwoNumbers.java)|medium|相加时注意进位，将两个链表虚拟为等长，即将短的链表补足0，即l1==null?0:l1.val（链表）|链表|
|1|[两数之和](https://leetcode-cn.com/problems/two-sum/) | [Java](https://github.com/HusterHaoYoung/algorithm/blob/master/src/leetcode/p001_twoSum.java)|easy|简单遍历即可|
