import java.util.Arrays;

public class Kruskals {

    class Edge implements Comparable<Edge>{
        int src, dest, weight;

        public int compareTo(Edge compEdge){
            return this.weight - compEdge.weight;
        }
    }

    /**
     * subset
     */
    public class subset {
    
        int parent, rank;
    }

    int V, E;
    Edge edge[];


    Kruskals(int v, int e){
        V = v;
        E = e;
        edge = new Edge[E];

        for (int i = 0; i < e; i++) {
            edge[i] = new Edge();
        }        
        
    }

    int find(subset subsets[], int i){
        if(subsets[i].parent != i){
            subsets[i].parent = find(subsets, subsets[i].parent);
        }

        return subsets[i].parent;
    }

    void union(subset subsets[], int x, int y){
        int xroot = find(subsets, x);
        int yroot = find(subsets, y);

        if(subsets[xroot].rank<subsets[yroot].rank){
            subsets[xroot].parent = yroot;
        }

        else if(subsets[xroot].rank>subsets[yroot].rank){
            subsets[yroot].parent = xroot;
        }

        else{
            subsets[yroot].parent = xroot;
            subsets[xroot].rank++;      
        }
    }
    
    void kruskalMST(){
        Edge result[] = new Edge[V];

        for (int i = 0; i < V; i++) {
            result[i] = new Edge();
        }

        Arrays.sort(edge);


        subset subsets[] = new subset[V];
        for (int i = 0; i < V; i++) {
            subsets[i] = new subset();
        }

        

    }
}