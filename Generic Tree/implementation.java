import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class implementation {

    private static class Node {
        int val;
        ArrayList<Node> child;

        Node(int val) {
            this.val = val;
            child = new ArrayList<>();
        }
    }

    private static void formtree(Node root) {
        root.child.add(new Node(5));
        root.child.add(new Node(11));
        root.child.add(new Node(63));

        root.child.get(0).child.add(new Node(1));
        root.child.get(0).child.add(new Node(4));
        root.child.get(0).child.add(new Node(8));

        root.child.get(1).child.add(new Node(6));
        root.child.get(1).child.add(new Node(7));
        root.child.get(1).child.add(new Node(15));

        root.child.get(2).child.add(new Node(31));
        root.child.get(2).child.add(new Node(55));
        root.child.get(2).child.add(new Node(65));
    }

    private static void preorder(Node root) {
        if (root.child.isEmpty()) {
            System.out.print(root.val + " ");
            return;
        }
        System.out.print(root.val + " ");
        for (int i = 0; i < root.child.size(); i++) {
            preorder(root.child.get(i));
        }

    }

    private static void postorder(Node root) {
        if (root.child.isEmpty()) {
            System.out.print(root.val + " ");
            return;
        }

        for (int i = 0; i < root.child.size(); i++) {
            preorder(root.child.get(i));
        }
        System.out.print(root.val + " ");

    }

    private static void BreadthFirstSearch(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root != null) {
            q.add(root);
        }
        while (!q.isEmpty()) {
            Node curr = q.peek();
            System.out.println(curr.val + " ");
            q.remove();

            for (int i = 0; i < curr.child.size(); i++) {
                q.add(curr.child.get(i));
            }
        }

    }

    public static int maxx(Node root) {
        int childmax;
        if (root.child == null) {
            return root.val;
        }
        int maxele = root.val;
        for (int i = 0; i < root.child.size(); i++) {
            childmax = maxx(root.child.get(i));
            if (childmax > maxele) {
                maxele = childmax;
            }
        }
        return maxele;
    }

    public static void main(String[] args) {
        Node root = new Node(30);
        formtree(root);
        preorder(root);
        postorder(root);
    }
}