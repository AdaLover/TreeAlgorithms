package trees;

public class IsBST {
    private Trees tree;

    IsBST(Trees g)
    {
        this.tree = g;

    }
    void checkisBST()
    {
        System.out.println(checkBSTHelper(tree.getRoot(),Integer.MIN_VALUE,Integer.MAX_VALUE)?"yes it is a bst.":"no it is not bst.");
    }
    private boolean checkBSTHelper(Node root,int min,int max){
        if(root==null)return true;

        if (root.data >max||root.data<min)return false;

        return checkBSTHelper(root.left,min,root.data)
            && checkBSTHelper(root.right,root.data,Integer.MAX_VALUE);
    }

}
