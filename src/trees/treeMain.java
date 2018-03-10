package trees;

public class treeMain {
    public static void main(String[] args) {
        Trees tree = new Trees(10);
        tree.insert(20);
        tree.insert(5);
        tree.insert(7);
        tree.insert(25);
        tree.insert(19);
        tree.insert(4);
        BfsTraversal BfsTraversal = new BfsTraversal(tree);
        BfsTraversal.performBFS();
    }
}
