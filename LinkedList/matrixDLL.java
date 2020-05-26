/**
 * matrix
 */


public class matrixDLL { 
    /**
     * DDLNode
         */
    public class DDLNode{
        int data;
        DDLNode next;
        DDLNode prev;
        DDLNode up;
        DDLNode down;

        DDLNode(int data){
            this.data = data;
            next = null;
            prev = null;
            up = null;
            down = null;
        }
    }
    DDLNode createMatrix(int matrix[][], int i, int j, DDLNode current){
        
        if(i >= 3 || j >= 3)
            return null;

        DDLNode temp = new DDLNode(matrix[i][j]);

        temp.prev = current;
        temp.up = current;
        temp.next = createMatrix(matrix, i, j+1, temp);
        temp.down = createMatrix(matrix, i+1, j, temp);

        return temp;
    }

    void showMatrix(DDLNode root){
        DDLNode dtemp = root;
        
        while(dtemp!=null){
            DDLNode rtemp = dtemp;
            while (rtemp!=null) {
                System.out.print(rtemp.data);
                rtemp = rtemp.next;
            }
            System.out.println();
            dtemp = dtemp.down;
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        matrixDLL m = new matrixDLL();
        DDLNode root = m.createMatrix(matrix, 0, 0, null);

        m.showMatrix(root);
    }
}