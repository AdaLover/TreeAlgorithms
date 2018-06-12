package trees;

class Node {
 
    int data;
    Node left, right;
 
    public Node(int item) {
        data = item;
        left = right = null;
    }
}
class Trees
{
    private Node root;
        Trees(){
            root=null;
        }
        Trees(int input)
        {
            create(input);
        }
        public Node getRoot()
        {
            return root;
        }
        private void create(int input)
        {
            root=new Node(input);
            System.out.println("root node created");
        }
        private void insertion_in_a_Binary_Tree(int input)
        {
            Node temp=root;
            Node curr=root;
            while(temp!=null)
            {
                curr=temp;
                if(temp.data>input)
                {
                    temp=temp.left;
                }
                else
                {
                    temp=temp.right;
                }
            }
            Node justMade=new Node(input);
            if(curr.data<input)
            {

                curr.right=justMade;
            }
            else
             curr.left=justMade;
        }
        Node search(int data)
        {
            Node curr=getRoot();
            while(curr!=null)
            {
                if(curr.data==data)break;
                if(curr.data>data)
                    curr=curr.left;
                else
                    curr=curr.right;
            }

            return curr;
        }
        void insert(int input)
        {
            if(root==null)
            {
                create(input);
            }
            else
            {
                insertion_in_a_Binary_Tree(input);
            }
        }

}