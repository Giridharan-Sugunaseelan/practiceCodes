import java.util.LinkedList;
import java.util.Queue;

/*class Node
{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/
public class MinimumElementInBST {
    int minValue(Node node) {
        if(node == null){
            return -1;
        }
        Queue<Node> list = new LinkedList<>();
        list.add(node);
        Node current = null;
        while(!list.isEmpty()){
            current = list.remove();
            if(current.left != null){
                list.add(current.left);
            }
        }
        return current.data;
    }
}
