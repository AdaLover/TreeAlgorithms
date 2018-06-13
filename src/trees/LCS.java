package trees;

public class LCS {
    Trees trees;
    Node lcs;
    public LCS(Trees trees) {
        this.trees = trees;
    }

    void findAncestor(int a,int b)
    {
        findAncestorHelper(trees.getRoot(),a,b);
        System.out.println(lcs.data);
    }

    private Boolean findAncestorHelper(Node root,int a,int b) {

        if(root==null)return false;
        if(root.data==a||root.data==b)
        {
            lcs = root;
            return true;
        }
        boolean left = findAncestorHelper(root.left,a,b);
        boolean right = findAncestorHelper(root.right,a,b);
        if(left&&right){lcs=root;}
        if(left||right)return true;

        return false;
    }

}
