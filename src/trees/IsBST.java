package trees;

public class IsBST {
    private Trees tree;
    int violate;
    IsBST(Trees g)
    {
        this.tree = g;
        violate=Integer.MIN_VALUE;
    }
    void checkisBST()
    {
        System.out.println(checkBSTHelper(tree.getRoot())?"yes it is a bst.":"no it is not bst. Rule violated at "+violate);
    }
    private boolean checkBSTHelper(Node root){
        if(root==null)return true;

        if(root.left!=null)
        if(root.left.data>root.data){violate = root.data;return false;}
        if(root.right!=null)
        if(root.right.data<root.data){violate = root.data;return false;}

        if(violate==Integer.MIN_VALUE)
        {
            if(root.left!=null)
            checkBSTHelper(root.left);
            if(root.right!=null)
            checkBSTHelper(root.right);
        }
        else
            return false;
        return true;
    }

}
