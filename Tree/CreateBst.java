package Tree;

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

class Bst {
    private Node addNode(int data) {

        Node node = new Node(data);
        return node;
    }

    public Node insertNode(Node node, int data) {
        if (node == null) {
            return addNode(data);
        }
        if (data < node.data) {
            node.left = insertNode(node.left, data);
        }
        if (data > node.data) {
            node.right = insertNode(node.right, data);
        }

        return node;
    }

    public Node delete(Node node, int data) {
        if (node == null) {
            return node;
        }

        if (data < node.data) {
            node.left = delete(node.left, data);
        }

        else if (data > node.data) {
            node.right = delete(node.right, data);
        }

        else {
            if (node.left == null || node.right == null) {
                Node temp = node.left != null ? node.left : node.right;

                if (temp == null) {
                    return null;
                } else
                    return temp;
            } else {
                Node successor = getSuccessor(node);
                node.data = successor.data;

                node.right = delete(node.right, successor.data);
                return node;
            }
        }
        return node;
    }

    public Node getSuccessor(Node node) {
        if (node == null)
            return null;

        Node temp = node.right;

        while (temp.left != null) {
            temp = temp.left;
        }

        return temp;
    }

    public void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public void preOrder(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");

        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(Node node) {
        if (node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);

        System.out.print(node.data + " ");

    }

    public Node getParentNode(Node node, int k){
        if(node == null)
            return null;

        Node parent = null;

        while(node != null){
            if(k<node.data){
                parent = node;
                node = node.left;
            }
            else if(k>node.data){
                parent = node;
                node = node.right;
            }
            else
                break; 
        }

        return parent;

    }

    public boolean isPresent(Node node, int data) {
        if (node == null) {
            return false;
        }
        boolean present = false;

        while (node != null) {
            if (data < node.data) {
                node = node.left;
            } else if (data > node.data)
                node = node.right;

            else {
                present = true;
                break;
            }
        }

        return present;
    }

    public Node getSibling(Node node, int data){
        Node parent = getParentNode(node, data);

        Node sibling = null;
        if(data == parent.left.data){
            sibling = parent.right;
        }

        else if(data == parent.right.data){
            sibling = parent.left;
        }

        return sibling;
    }

    public Node inOrderParent(Node node, int data){
        if(node == null){
            return null;
        }

        Node parent = null;
        while(node != null){
            if(data<node.data){
                parent = node;
                node = node.left;
            }

            else if(data>node.data){
                node = node.right;
            }

            else{
                break;
            }
        }

        return parent;
    }

}

public class CreateBst {
    public static void main(String[] args) {
        Node root = null;
        Bst a = new Bst();
        root = a.insertNode(root, 8);
        root = a.insertNode(root, 3);
        root = a.insertNode(root, 6);
        root = a.insertNode(root, 10);
        root = a.insertNode(root, 4);
        root = a.insertNode(root, 7);
        root = a.insertNode(root, 1);
        root = a.insertNode(root, 14);
        root = a.insertNode(root, 13);

        a.inOrder(root);
        root = a.delete(root, 3);

        System.out.println();
        a.inOrder(root);
        // System.out.println();
        // a.preOrder(root);
        // System.out.println();
        // a.postOrder(root);
        // System.out.println();

        // System.out.println( a.isPresent(root, 45));

        // System.out.println(a.getParentNode(root, 7).data);
        // System.out.println(a.getSibling(root, 7).data);
        // System.out.println(a.inOrderParent(root, 4).data);
    }
}