package Tree;

import java.util.Stack;

public class PreOrderTraversal {

    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data){
            this.data = data;
        }
    }


    TreeNode root = null;
    public void createTree(){
        TreeNode first = new TreeNode(5);
        TreeNode first1 = new TreeNode(2);
        TreeNode first2 = new TreeNode(4);
        TreeNode first3 = new TreeNode(7);
        TreeNode first4 = new TreeNode(45);

        root = first;
        first.left = first2;
        first.right = first3;
        first2.left = first1;
        first2.right = first4;

    }

    public void preOrder(){

        if(root == null)
            return;
            
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        TreeNode temp = root;
        while(!stack.isEmpty() || temp != null){
            if(temp != null){
                stack.push(temp);
                temp = temp.left;
            }

            else{
                temp = stack.pop();
                System.out.println(temp.data);
                temp = temp.right;
            }

        }
    }   

    public static void main(String[] args) {
        PreOrderTraversal p = new PreOrderTraversal();
        
        p.createTree();

        p.preOrder();
    }
}