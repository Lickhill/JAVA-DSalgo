package Binary_tree;

import java.util.ArrayList;
import java.util.List;

public class rightViewBT {
    class Solution {

        public static class TreeNode {
            int val;// default is 0
            TreeNode left;// default is null
            TreeNode right;// default is null

            public TreeNode(int val) {
                this.val = val;
            }
        }

        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            rightboundary(root, ans, 1);
            return ans;
        }

        public void rightboundary(TreeNode root, List<Integer> ans, int count) {
            if (root == null) {
                nthlevel(root, count, ans);
                return;
            }
            ans.add(root.val);
            count++;
            if (root.right != null) {
                rightboundary(root.right, ans, count);
            } else if (root.left != null) {
                rightboundary(root.left, ans, count);
            } else {
                nthlevel(root, count, ans);
                return;
            }
        }

        public void leftboundary(TreeNode root, List<Integer> ans) {
            if (root == null) {
                return;
            }
            if (root.right == null && root.left == null) {
                return;
            }
            ans.add(root.val);
            System.out.println(root.val);
            if (root.right != null) {
                leftboundary(root.right, ans);
            } else if (root.left != null) {
                leftboundary(root.left, ans);
            } else {
                return;
            }
        }

        public void nthlevel(TreeNode root, int n, List<Integer> ans) {
            if (root == null) {
                return;
            }
            if (n == 1) {
                leftboundary(root, ans);
            }
            nthlevel(root.left, n - 1, ans);
        }
    }
}
