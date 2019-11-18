package leetcode;

import java.util.ArrayList;
import java.util.List;

public class p054_spiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return ans;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int num = 0;
        int row = 0;
        int col = 0;
        int level = 0;
        while (num < n * m) {
            for (col = level; col < n - level; col++) {
                ans.add(matrix[row][col]);
                num++;
            }
            if (num == n * m) {
                break;
            }
            col--;
            row++;
            for (; row < m - level; row++) {
                ans.add(matrix[row][col]);
                num++;
            }
            if (num == n * m) {
                break;
            }
            row--;
            col--;
            for (; col >= level; col--) {
                ans.add(matrix[row][col]);
                num++;
            }
            if (num == n * m) {
                break;
            }
            col++;
            row--;
            level++;
            for (; row >= level; row--) {
                ans.add(matrix[row][col]);
                num++;
            }
            row++;
        }
        return ans;
    }
}
