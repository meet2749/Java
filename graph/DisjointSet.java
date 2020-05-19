import java.util.ArrayList;

public class DisjointSet {

    int V,E;
    Edge edge[];

    class Edge{
        int src, dest;
    }


    DisjointSet(int v, int e){
        V = v;
        E = e;
        
        edge =  new Edge[E];

        for (int i = 0; i < e;   i++) {
            edge[i] = new Edge(); 
        }
    }

    

    

}