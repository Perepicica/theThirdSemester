package BTree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    Node root;
    Node parent;


    static class Node {
        int key;
        String value;
        Node left = null;
        Node right = null;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put(int key, String value) {
        root = put(root, null, key, value);
    }

    private Node put(Node t, Node p, int key, String value) {
        if (t == null) {
            t = new Node(key, value);
        } else {
            if (key < t.key) t.left = put(t.left, t, key, value);
            else t.right = put(t.right, t, key, value);
        }

        return t;
    }

    public void prn() {
        Queue<Node> q1 = new LinkedList<Node>();

        q1.add(root);
        prn(q1);
    }

    private void prn(Queue<Node> q1) {
        Queue<Node> q2 = new LinkedList<Node>();
        for (Node n : q1) {
            if (n != null) System.out.print(n.key + " ");
            else System.out.print("N  ");
        }
        System.out.println();
        while (!q1.isEmpty()) {
            Node node = q1.poll();
            if (node != null && node.left != null) q2.add(node.left);
            else q2.add(null);
            if (node != null && node.right != null) q2.add(node.right);
            else q2.add(null);
        }
        q1 = q2;
        int count = 0;
        for (Node n : q2) {
            if (n != null) {
                count++;
                break;
            }

        }
        if (count != 0) prn(q1);
        else System.out.println();

    }


    private void prn2(Queue<Node> q1) {
        Queue<Node> q2 = new LinkedList<Node>();
        for (Node n : q1) {
            System.out.print(n.key + " ");
        }
        System.out.println();
        while (!q1.isEmpty()) {
            Node node = q1.poll();
            if (node.left != null) q2.add(node.left);

            if (node.right != null) q2.add(node.right);
        }
        q1 = q2;
        if (q1.size() != 0) prn(q1);
        else System.out.println();
    }

    public String search(int key) {
        return search(root, key);
    }

    private String search(Node t, int key) {
        if (t == null) return "no such el";
        if (t.key == key) return t.value;
        if (t.key > key) return search(t.left, key);
        else return search(t.right, key);
    }

    public void remove(int key) { // удаление без родителя
        parent = null;
        if (root.key == key && root.left == null && root.right == null) root = null;
        else if (root.key == key && root.left != null && root.right == null) root = root.left;
        else if (root.key == key && root.left == null && root.right != null) root = root.right;
        else
            remove(root, key);
    }

    private void remove(Node t, int key) {
        if (t == null) return;
        if (t.key != key) parent = t;
        if (t.key > key) remove(t.left, key);
        if (t.key < key) remove(t.right, key);
        if (t.key == key) {
            if (t.right == null && t.left == null) {
                if (t == parent.right) parent.right = null;
                else parent.left = null;
            } else if (t.left == null && t.right != null) {
                if (t == parent.right) parent.right = t.right;
                else parent.left = t.right;
            } else if (t.right == null && t.left != null) {
                if (t == parent.right) parent.right = t.left;
                else parent.left = t.left;
            } else if (t.left != null && t.right != null) {
                if (t.right.left == null) {
                    t.key = t.right.key;
                    t.right = t.right.right;
                } else {
                    Node n = searchToRemove(t.right);    //родитель элемента который будем переставлять/поднимать
                    t.key = n.left.key;
                    n.left = null;
                }
            }
        }
    }

    private Node searchToRemove(Node t) {
        if (t.left.left == null) return t;
        else return searchToRemove(t.left);

    }


}
