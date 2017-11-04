package BTree;

public class MainTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.put(2, "a ");
        tree.put(0, "");
        tree.put(7, "");
        //   tree.put(4, "ссс");
        tree.put(5, "вв");
        //   tree.put(3, "");
        tree.put(9, "");

        tree.put(8, "");
        tree.put(10, "");
        tree.prn();
        tree.remove(2);
        tree.prn();
    }
}
