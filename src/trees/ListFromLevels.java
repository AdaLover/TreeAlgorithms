package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ListFromLevels {
    Trees tree;
    List<LinkedList<Node>> arrayOfList = new ArrayList<>();

    ListFromLevels(Trees t)
    {
        tree=t;
    }

    void generateList(){
        generateListHelper(inflateList());
    }

    private LinkedList inflateList() {
        LinkedList<Node> rootList = new LinkedList<Node>();
        rootList.add(tree.getRoot());
        return rootList;
    }

    private void generateListHelper(LinkedList<Node> currList)
    {
        if(currList.isEmpty())return;

        arrayOfList.add(currList);

        LinkedList<Node> newList = new LinkedList<>();
        for(Node t:currList)
        {
            if(t.left!=null)newList.add(t.left);
            if(t.right!=null)newList.add(t.right);
        }
        generateListHelper(newList);
    }
    void printList()
    {
        int lvl=0;
        for(LinkedList currList:arrayOfList)
        {
            System.out.println("level"+ ++lvl);
            for(Object ob:currList)
            {
                Node currNode = (Node)ob;
                System.out.print(currNode.data+" ");
            }
            System.out.println();
        }
    }
}
