package Day2;

import java.util.LinkedList;
import java.util.Queue;

class Node
{
    int data;
    Node left, right;
}
public class NumberOfLeafNodes {
    int countLeaves(Node node)
    {
        // Your code
        int count = 0;
        if(node == null){
            return count;
        }
        Queue<Node> list = new LinkedList<>();
        list.add(node);
        while(!list.isEmpty()){
            Node current = list.remove();
            if(current.left == null && current.right == null){
                count++;
                continue;
            }
            if(current.left != null){
                list.add(current.left);
            }
            if(current.right != null){
                list.add(current.right);
            }
        }
        return count;
    }
}
