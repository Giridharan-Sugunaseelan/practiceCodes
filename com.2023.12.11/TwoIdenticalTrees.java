package Day2;

import java.util.LinkedList;
import java.util.Queue;

public class TwoIdenticalTrees {
    boolean isIdentical(Node root1, Node root2)
    {
        // Code Here
        Queue<Node> list = new LinkedList<>();
        list.add(root1);
        list.add(root2);
        while(!list.isEmpty()){
            Node current1 = list.remove();
            Node current2 = list.remove();
            if(current1 == null && current2 == null){
                continue;
            }
            if(current1 == null || current2 == null || current1.data != current2.data){
                return false;
            }
            list.add(current1.left);
            list.add(current2.left);
            list.add(current1.right);
            list.add(current2.right);
        }
        return true;
    }
}
