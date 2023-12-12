package Day3;

import java.util.LinkedList;
import java.util.Queue;

class SymmetricTree
{
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
        // add your code here;
        if(root == null){
            return true;
        }
        Queue<Node> list = new LinkedList<>();
        list.add(root.left);
        list.add(root.right);
        while(!list.isEmpty()){
            Node current1 = list.remove();
            Node current2 = list.remove();
            if(current1 == null && current2 == null){
                continue;
            }
            else if(current1 == null || current2 == null || current1.data != current2.data){
                return false;
            }
            list.add(current1.left);
            list.add(current2.right);
            list.add(current1.right);
            list.add(current2.left);
        }
        return true;
    }
}