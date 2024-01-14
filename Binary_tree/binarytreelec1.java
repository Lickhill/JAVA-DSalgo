package Binary_tree;

import java.util.*;

public class binarytreelec1 {

    public static class Node {
        int val;// default is 0
        Node left;// default is null
        Node right;// default is null

        public Node(int val) {
            this.val = val;
        }
    }

    public int size(Node root) {
        if (root == null) {
            return 0;
        }

        return size(root.right) + size(root.left) + 1;// +1 is for root
    }

    public int summer(Node root) {
        if (root == null) {
            return 0;
        }

        return summer(root.right) + summer(root.left) + root.val;
    }

    public int prdt(Node root) {
        if (root == null) {
            return 1;
        }

        return prdt(root.right) * prdt(root.left) * root.val;
    }

    public void preordertraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preordertraversal(root.left);
        preordertraversal(root.right);
    }

    public void inordertraversal(Node root) {
        if (root == null) {
            return;
        }
        preordertraversal(root.left);
        System.out.print(root.val + " ");
        preordertraversal(root.right);
    }

    public void postordertraversal(Node root) {
        if (root == null) {
            return;
        }

        preordertraversal(root.left);
        preordertraversal(root.right);
        System.out.print(root.val + " ");

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

    public void breadth_for_search_bfs(Node root) {// iterative way with less time complexity
        Queue<Node> q = new LinkedList<>();
        if (root == null) {
            return;
        }
        if (root != null) {
            q.add(root);
        }
        while (q.size() > 0) {
            Node temp = q.peek();
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
            System.out.print(q.remove().val + " ");
        }
    }

    public int max(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int a = root.val;
        return Math.max(a, Math.max(max(root.left), max(root.right)));
    }

    public int min(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        int a = root.val;
        return Math.min(a, Math.min(min(root.left), min(root.right)));
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

    public void display(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + "->");
        if (root.left != null)
            System.out.print(root.left.val + ", ");
        else
            System.out.print(" null ");
        if (root.right != null)
            System.out.print(root.right.val);
        else
            System.out.print(" null ");

        System.out.println();

        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        binarytreelec1 obj = new binarytreelec1();
        Node root = new Node(100);
        System.out.println(root.val);
        System.out.println(root.left);
        Node a = new Node(90);
        Node b = new Node(110);
        Node c = new Node(80);
        Node d = new Node(95);
        Node e = new Node(120);
        Node f = new Node(115);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        e.left = f;
        obj.display(root);
        obj.preordertraversal(root);
        System.out.println();
        obj.postordertraversal(root);
        System.out.println();
        obj.inordertraversal(root);
        System.out.println();

        System.out.println("\n" + obj.size(root));

        System.out.println(obj.summer(root));
        System.out.println(obj.max(root));
        System.out.println(obj.height(root));
        System.out.println(obj.min(root));
        System.out.println(obj.prdt(root));

        obj.nthlevel(root, 4);
        System.out.println();

        int levels = obj.height(root) + 1;
        for (int i = 1; i <= levels; i++) {
            obj.nthlevel(root, i);
            System.out.println();
        }

        obj.breadth_for_search_bfs(root);
        System.out.println();
        System.out.println();

    }
}
