import java.util.ArrayList;

/*class Node
{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/
public class PostOrderTraversal {
    ArrayList<Integer> postOrder(Node root)
    {
        // Your code goes here
        ArrayList<Integer> list = new ArrayList<>();
        if(root != null){
            list.addAll(postOrder(root.left));
            list.addAll(postOrder(root.right));
            list.add(root.data);
        }
        return list;
    }
}
