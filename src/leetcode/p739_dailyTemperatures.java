package leetcode;

public class p739_dailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        int res[] = new int[T.length];
        res[T.length - 1] = 0;
        for (int i = T.length - 2; i >= 0; i--) {
            int j = i + 1;
            while (j <= T.length - 1) {
                if (T[j] > T[i]) {
                    res[i] = j - i;
                    break;
                } else {
                    if (res[j] == 0) {
                        res[i] = 0;
                        break;
                    } else {
                        j = j + res[j];
                    }
                }
            }
        }
        return res;
    }
}