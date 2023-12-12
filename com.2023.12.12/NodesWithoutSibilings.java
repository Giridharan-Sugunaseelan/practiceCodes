package Day3;

import java.util.ArrayList;
import java.util.Collections;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class NodesWithoutSibilings
{
    ArrayList<Integer> noSibling(Node node)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        nosib(node, list);
        if(list.size() == 0){
            list.add(-1);
            return list;
        }
        else{
            Collections.sort(list);
            return list;
        }
    }

    void nosib(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        nosib(root.left, list);

        if(root.left != null && root.right == null){
            if(!list.contains(root.left.data)){
                list.add(root.left.data);
            }
        }
        if(root.left == null && root.right != null){
            if(!list.contains(root.right.data)){
                list.add(root.right.data);
            }
        }
        nosib(root.right, list);
    }
}