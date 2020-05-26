/**
 * isIdentical //
 
 */

public class isIdentical {
class Node {
   int data;
   Node left;
   Node right;

   public Node(int k) {
       this.data = k;
       this.left = null;
       this.right = null;
   }
}
     
     static boolean checkIdentical(Node r1, Node r2) {
        if (r1 == null && r2 == null) {
            return true;
        }

        if (r1.data == r2.data && checkIdentical(r1.left, r2.left) && checkIdentical(r1.right, r2.right)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        isIdentical a = new isIdentical();

        Node root = a.new Node(5);
        root.left = a.new Node(10);
        root.right = a.new Node(20);
        root.left.right = a.new Node(50);

        Node root1 = a.new Node(5);
        root1.left = a.new Node(10);
        root1.right = a.new Node(10);
        root1.left.right = a.new Node(50);

        System.out.println(checkIdentical(root, root1));

    }
}