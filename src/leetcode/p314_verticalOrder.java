package leetcode;

import java.util.*;

public class p314_verticalOrder {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        Queue<TreeNodePlus> queue = new LinkedList<>();
        queue.add(new TreeNodePlus(root,0));
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(0, new ArrayList<>());
        map.get(0).add(root.val);
        List<List<Integer>> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (!queue.isEmpty()) {
            TreeNodePlus tmp = queue.poll();
            max = Math.max(max,tmp.level);
            min = Math.min(max,tmp.level);

            if (tmp.root.left != null) {
                queue.add(new TreeNodePlus(root.left,tmp.level - 1));
                if (map.get(tmp.level - 1)==null) {
                    map.put(tmp.level-1 , new ArrayList<>(root.val));
                }else {
                    map.get(tmp.level -1 ).add(root.val);
                }
            }
            if (tmp.root.right != null) {
                queue.add(new TreeNodePlus(root.right,tmp.level + 1));
                if (map.get(tmp.level + 1)==null) {
                    map.put(tmp.level + 1 , new ArrayList<>(root.val));
                }else {
                    map.get(tmp.level + 1 ).add(root.val);
                }
            }
        }
        for (int i = min;i<max + 1;i++){
            List<Integer> list = map.get(i);
            if(list!=null) ans.add(list);
        }
        return ans;
    }
}

class TreeNodePlus {
    TreeNode root;
    int level;

    TreeNodePlus(TreeNode x, int y) {
        root = x;
        level = y;
    }
}