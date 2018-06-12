package trees;

public class InorderSuccessor {
    Trees tree;
    InorderSuccessor(Trees t)
    {
        this.tree = t;
    }

    private Node getMin(Node n)
    {
        return n.left==null?n:getMin(n.left);
    }

    public void findSuccessor(int data)
    {

        System.out.println(findSuccessorHelper(tree.getRoot(),tree.search(data)).data);
    }

    private Node findSuccessorHelper(Node root, Node search) {
        if(search.right!=null)return getMin(search.right);

        Node curr = root;
        Node succ = null;
        while(curr!=null)
        {
            System.out.println(curr.data);
            if(curr.data==search.data)
            {
                break;
            }
            if(curr.data>search.data)
            {
                succ=curr;
                curr=curr.left;
            }
            else
                curr=curr.right;
        }
        return succ;
    }
}
