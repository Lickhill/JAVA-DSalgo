package BST;

import java.util.*;

public class deleteANode {
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

    public Node maxNode(Node root) {
        Node temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        delete(root, temp.val);
        return temp;
    }

    public void delete(Node root, int target) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.left.val == target) {

            if (root.left.left == null && root.left.right == null) {
                root.left = null;
            } else if (root.left.left == null || root.left.right == null) {
                if (root.left.left != null) {
                    root.left = root.left.left;
                } else {
                    root.left = root.left.right;
                }
            }
            return;
        } else if (root.right != null && root.right.val == target) {
            if (root.right.left == null && root.right.right == null) {
                root.right = null;
            } else if (root.right.left == null || root.right.right == null) {
                if (root.right.left != null) {
                    root.right = root.right.left;
                } else {
                    root.right = root.right.right;
                }
            }
            return;
        }

        if (root.val < target) {
            delete(root.right, target);
        } else if (root.val > target) {
            delete(root.left, target);
        } else {// when target is the root of the tree
            if (root.left == null && root.right == null) {
                root = null;
                return;
            } else if (root.left == null || root.right == null) {
                if (root.left.left != null) {
                    root.left = root.left.left;
                } else {
                    root.left = root.left.right;
                }
            } else {
                Node temp = maxNode(root);
                root = new Node(temp.val);
            }
        }
    }

    public void display(Node root) {
        int level = height(root) + 1; // printing of the constructed binary tree
        for (int i = 1; i <= level; i++) {
            nthlevel(root, i);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String arr[] = { "50", "20", "60", "17", "34", "55", "89", "10", "", "28", "", "", "", "70", "", "", "14" };

        Node root = new Node(Integer.parseInt(arr[0]));
        deleteANode obj = new deleteANode();

        Node r = obj.constructTree(root, arr);// root of the constructed binary tree is r

        obj.delete(r, 50);

        // int level = obj.height(r) + 1; // printing of the constructed binary tree
        // for (int i = 1; i <= level; i++) {
        // obj.nthlevel(r, i);
        // System.out.println();
        // }

        obj.display(root);
    }
}
