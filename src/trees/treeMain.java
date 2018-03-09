package trees;

public class treeMain {
    public static void main(String[] args) {
        Trees tree = new Trees(10);
        tree.insert(10);
        tree.insert(10);
        tree.insert(10);
        tree.insert(25);
        tree.insert(19);
        tree.insert(4);
        IsBST isBST = new IsBST(tree);
        isBST.checkisBST();
    }
}
