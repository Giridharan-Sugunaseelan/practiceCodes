package Day2;

import java.util.LinkedList;
import java.util.Queue;

public class SizeOfBinaryTree {
    public static int getSize(Node root)
    {
//add Code here.
        Queue<Node> list = new LinkedList<>();
        list.add(root);
        int count = 1;
        while(!list.isEmpty()){
            Node current = list.remove();
            if(current.left != null){
                list.add(current.left);
                count++;
            }
            if(current.right != null){
                list.add(current.right);
                count++;
            }
        }
        return count;
    }
}
