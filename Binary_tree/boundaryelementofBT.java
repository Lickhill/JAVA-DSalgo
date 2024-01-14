package Binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class boundaryelementofBT {
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

    public void leftboundary(Node root) {
        if (root == null) {
            return;
        }
        if (root.right == null && root.left == null) {
            return;
        }
        System.out.print(root.val + " ");
        if (root.left != null) {
            leftboundary(root.left);
        } else {
            leftboundary(root.right);
        }
    }

    public void rightboundary(Node root, Node temp) {
        if (root == null) {
            return;
        }
        if (root.right == null && root.left == null) {
            return;
        }
        if (root.right != null) {
            rightboundary(root.right, temp);
        } else {
            rightboundary(root.left, temp);
        }
        if (temp.val != root.val)
            System.out.print(root.val + " ");
    }

    public void leafnode_bottom_boundary(Node root) {
        if (root == null) {
            return;
        }
        if (root.right == null && root.left == null) {
            System.out.print(root.val + " ");
            return;
        }
        leafnode_bottom_boundary(root.left);
        leafnode_bottom_boundary(root.right);
    }

    public static void main(String[] args) {
        String arr[] = { "1", "2", "3", "4", "5", "", "6", "7", "", "8", "", "9", "10", "", "11", "", "12", "", "13",
                "", "14", "15", "16", "", "17", "", "", "18", "", "19", "", "", "", "20", "21", "22", "23", "", "24",
                "25", "26", "27", "", "", "28", "", "" };

        Node root = new Node(Integer.parseInt(arr[0]));
        boundaryelementofBT obj = new boundaryelementofBT();

        Node r = obj.constructTree(root, arr);

        int level = obj.height(r) + 1;
        for (int i = 1; i <= level; i++) {
            obj.nthlevel(r, i);
            System.out.println();
        }
        System.out.println();

        obj.leftboundary(r);
        obj.leafnode_bottom_boundary(r);
        obj.rightboundary(r, r);
    }
}