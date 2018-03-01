package trees;

public class Dfs {
    private Trees tree;
    private Node root;
    Dfs(Trees tree)
    {
        this.tree = tree;
        this.root = tree.getRoot();
    }
    //private functions (mostly helpers) meant for internal use only.

    /*
     *Pre-order traversal helper function.
     *Takes Node type object as argument and recursively iterates through each children of that object.
     *Prints value of currently passed object(here, root Node, local to the helper function).
     */
    private void applyPreOrderHelper(Node root)
    {
        if(root==null)return;//break condition.

        System.out.println(root.data);
        applyPreOrderHelper(root.left);
        applyPreOrderHelper(root.right);
    }
    private void applyPostOrderHelper(Node root)
    {
        if(root==null)return;//break condition.


        applyPostOrderHelper(root.left);
        applyPostOrderHelper(root.right);
        System.out.println(root.data);
    }
    private void applyInOrderHelper(Node root)
    {
        if(root==null)return; //break condition.


        applyInOrderHelper(root.left);
        System.out.println(root.data);
        applyInOrderHelper(root.right);
    }

    //public functions meant to be called from main function.
    void applyPreOrder()
    {
        applyPreOrderHelper(this.root);
    }
    void applyPostOrder()
    {
        applyPostOrderHelper(this.root);
    }
    void applyInOrder()
    {
        applyInOrderHelper(this.root);
    }
}
