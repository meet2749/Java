public class Prims {

    
    public static void addEdge(int arr[][],int u, int v, int w){
        arr[u][v] = w;
        arr[v][u] = w;
    }

    public static int findMinVertex(int weight[], boolean visited[], int n){
        int minVertex = -1;
        for (int i = 0; i < n; i++) {
            if(!visited[i] && (minVertex == -1 || weight[i] < weight[minVertex] )){
                minVertex = i;
            }
        }
        return minVertex;
    }

    public static void prims(int edges[][], int n){
        int parent[] = new int[n];
        int weight[] = new int[n];
        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            weight[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

        parent[0] = -1;
        weight[0] = 0;

        for (int i = 0; i < n; i++) {
            int minVertex = findMinVertex(weight, visited, n);
            visited[minVertex] = true;
            for (int j = 0; j < n; j++) {
                if(edges[minVertex][j] != 0 && !visited[j]){
                    if (edges[minVertex][j] < weight[j]){
                        weight[j] = edges[minVertex][j];
                        parent[j] = minVertex;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (parent[i] < i) {
                System.out.println(parent[i] + " " + i + " "+ weight[i]);
            }
            else{
                System.out.println(i+ " " + parent[i] + " "+ weight[i]);
            }
        }

    } 

    public static void main(String[] args) {
    
        int n = 5;
        int edges[][] = new int[n][n];
        
        addEdge(edges, 0,1,4);
        addEdge(edges, 0,2,8);
        addEdge(edges, 1,3,6);
        addEdge(edges, 1,2,2);
        addEdge(edges, 2,3,3);
        addEdge(edges, 2,4,9);
        addEdge(edges, 3,4,5);

        prims(edges, n);

    }
}