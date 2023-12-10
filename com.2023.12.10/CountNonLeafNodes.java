import java.util.LinkedList;
import java.util.Queue;

class Node
{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
public class CountNonLeafNodes {
    int countNonLeafNodes(Node root) {
        //code here
        Queue<Node> list = new LinkedList<>();
        list.add(root);
        int count = 0;
        while(!list.isEmpty()){
            Node current = list.remove();
            if(current.left != null || current.right != null){
                count++;
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
