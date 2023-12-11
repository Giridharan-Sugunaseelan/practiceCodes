package Day2;

public class BalancedTree {
    boolean isBalanced(Node root)
    {
        // Your code here
        if(root == null){
            return true;
        }
        int left = height(root.left);
        int right = height(root.right);
        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(left - right) <= 1;
    }

    int height(Node root){
        if(root == null){
            return 0;
        }
        int left = height (root.left); //0
        int right = height (root.right);//0
        return Math.max(left,right) + 1;
    }
}
