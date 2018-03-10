package trees;

import java.util.*;

public class BfsTraversal {
    private Trees tree;
    private Queue<Node> traversalQueue;
    class levelKeeper{
        Node parent;
        int level;

        levelKeeper(Node parent,int level)
        {
            this.parent = parent;
            this.level = level;
        }
    }
    BfsTraversal(Trees tree)
    {
        this.tree = tree;
        traversalQueue = new LinkedList<Node>();

    }
    void performBFS(){
        if(tree.getRoot()!=null){
        traversalQueue.add(tree.getRoot());
        performeBFSHelper();}
        else
            System.out.println("tree is empty");
    }
    private void performeBFSHelper()
    {
        Map<Integer,levelKeeper> levelMap  = new LinkedHashMap<>();
        levelMap.put(tree.getRoot().data,new levelKeeper(null,0));
        while(!traversalQueue.isEmpty())
        {
            Node curr = traversalQueue.poll();
            if(curr.left!=null)
            {
                traversalQueue.add(curr.left);
                levelMap.put(curr.left.data,new levelKeeper(curr,levelMap.get(curr.data).level+1));
            }
            if(curr.right!=null)
            {
                traversalQueue.add(curr.right);
                levelMap.put(curr.right.data,new levelKeeper(curr,levelMap.get(curr.data).level+1));
            }
            System.out.println();
        }
        for(Map.Entry<Integer,levelKeeper> e:levelMap.entrySet())
        {
            System.out.println(e.getKey()+" at level "+e.getValue().level);
        }
    }
}


