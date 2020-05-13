import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;


/**
 * DFS_stack
 */
public class DFS_stack {

    private int V;

    LinkedList<Integer> adj[];
    
    DFS_stack(int v){
        V = v;
        adj = new LinkedList[V];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int u, int v){
        adj[u].add(v);
    }



    void DFS(int s){

        boolean visited[] = new boolean[V];

        Stack<Integer> stack = new Stack<>();

        stack.push(s);

        while(!stack.isEmpty()){

            s = stack.pop();

            if(!visited[s]){
                System.out.print(s+" ");
                visited[s] = true;
            }

            Iterator<Integer> i = adj[s].listIterator();

            while(i.hasNext()){
                int temp = i.next();

                if(!visited[temp]){
                    stack.push(temp);

                }
            }

        }

    }

    public static void main(String[] args) {
        
        DFS_stack g = new DFS_stack(4);
        g.addEdge(0, 1); 
		g.addEdge(0, 2); 
		g.addEdge(1, 2); 
		g.addEdge(2, 0); 
		g.addEdge(2, 3); 
        g.addEdge(3, 3); 
        
        g.DFS(2);

    }
}