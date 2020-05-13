import java.util.Iterator;
import java.util.LinkedList;

/**
 * DFS
 */
public class DFS_graph {

    int  V;
    private  LinkedList<Integer> adj[];
    
    DFS_graph(int v){
        V = v;
        adj = new LinkedList[V];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }        
    }
    
    void addEdge(int u, int v){
        adj[u].add(v);
    }

    void dfs(int v){
        boolean visited[] = new boolean[V];

        DFSUtil(visited, v);
    }

    void DFSUtil(boolean visited[], int v){

        visited[v] = true;
        System.out.println(v + " ");

        Iterator<Integer> i = adj[v].listIterator();

        while(i.hasNext()){
            int n = i.next();

            if(!visited[n]){
                DFSUtil(visited, n);
            }
        }

    }

    public static void main(String[] args) {
        DFS_graph g = new DFS_graph(4);
        
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3);
        
        g.dfs(2);
    }



}