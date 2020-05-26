public class BstFromPre {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    
    public static TreeNode addNode(int data, TreeNode root){
        if(root==null){
            TreeNode temp = new TreeNode(data);
            return temp;
        }
        if(data<root.val){
            root.left = addNode(data, root.left);
        }
        if(data>root.val){
            root.right = addNode(data, root.right);
        }
        return root;
    }



//    public TreeNode addNode(int data, TreeNode root){
       
//     }
 
    public void bfs(TreeNode root){
        if(root == null){
            return;
        }

    }

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode( preorder[0]);
        for (int i = 1; i < preorder.length; i++) {
        root = addNode(preorder[i], root);   
        }
        return root;
    }

    public static void main(String[] args) {
        int arr[] = {8,5,1,7,10,12};

        BstFromPre b = new BstFromPre();

        TreeNode root = b.bstFromPreorder(arr);
    }
}