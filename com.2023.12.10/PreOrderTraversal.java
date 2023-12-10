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
public class PreOrderTraversal {
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> list = new ArrayList<>();
        preOrder(root,list);
        return list;

    }

    static void preOrder(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.data);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }
}
