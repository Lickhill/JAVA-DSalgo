package Binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class constructTreeFromLevelOrderTraversal {

    public static class Node {
        int val;// default is 0
        Node left;// default is null
        Node right;// default is null

        public Node(int val) {
            this.val = val;
        }
    }

    public int height(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }

        return 1 + Math.max(height(root.left), height(root.right));
    }

    public void nthlevel(Node root, int n) {
        if (root == null) {
            return;
        }
        if (n == 1) {
            System.out.print(root.val + " ");
        }
        nthlevel(root.left, n - 1);
        nthlevel(root.right, n - 1);

    }

    public Node constructTree(Node root, String arr[]) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        for (int i = 1; i < arr.length - 1; i += 2) {
            Node left = new Node(-999);
            Node right = new Node(-999);
            if (!arr[i].equals("")) {
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            } else {
                left = null;
            }
            if (!arr[i + 1].equals("")) {
                int r = Integer.parseInt(arr[i + 1]);
                right.val = r;
                q.add(right);
            } else {
                right = null;
            }
            q.peek().left = left;
            q.peek().right = right;
            q.remove();

        }
        return root;
    }

    public static void main(String[] args) {
        String arr[] = { "1", "2", "3", "4", "5", "", "6", "", "7", "", "", "8", "", "", "", "9", "" };

        Node root = new Node(Integer.parseInt(arr[0]));
        constructTreeFromLevelOrderTraversal obj = new constructTreeFromLevelOrderTraversal();

        Node r = obj.constructTree(root, arr);

        int level = obj.height(r) + 1;
        for (int i = 1; i <= level; i++) {
            obj.nthlevel(r, i);
            System.out.println();
        }
    }
}
