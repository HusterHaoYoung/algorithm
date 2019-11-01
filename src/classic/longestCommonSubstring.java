package classic;

public class longestCommonSubstring {
    public static String lcs(String s1, String s2) {
        int[][] arr = new int[s1.length()][];
        int max = 0;
        int maxIdnex = 0;
        String s;
        for (int i = 0; i < s1.length(); i++)
            arr[i] = new int[s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    if (i == 0 || j == 0) {
                       arr[i][j] = 1;
                    }else {
                        arr[i][j] = arr[i - 1][j - 1] + 1;
                    }
                }
                if(arr[i][j] > max){
                    int beforeRev = s1.length() - 1 - j;
                    if(beforeRev + max - 1== i){
                        max = arr[i][j];
                        maxIdnex = i;
                    }

                }
            }
        }
        return s1.substring(maxIdnex - max + 1,maxIdnex + 1);
    }
    public String longestPalindrome(String s) {
        if (s.equals(""))
            return "";
        String origin = s;
        String reverse = new StringBuffer(s).reverse().toString();
        int length = s.length();
        int[][] arr = new int[length][length];
        int maxLen = 0;
        int maxEnd = 0;
        for (int i = 0; i < length; i++)
            for (int j = 0; j < length; j++) {
                if (origin.charAt(i) == reverse.charAt(j)) {
                    if (i == 0 || j == 0) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = arr[i - 1][j - 1] + 1;
                    }
                }
                /**********修改的地方*******************/
                if (arr[i][j] > maxLen) {
                    int beforeRev = length - 1 - j;
                    if (beforeRev + arr[i][j] - 1 == i) { //判断下标是否对应
                        maxLen = arr[i][j];
                        maxEnd = i;
                    }
                    /*************************************/
                }
            }
        return s.substring(maxEnd - maxLen + 1, maxEnd + 1);
    }
    public static void main(String[] args) {
        lcs("abc435cba","abc534cba");
    }
}
