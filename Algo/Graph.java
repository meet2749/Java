import java.util.ArrayList;

public class Graph {
    class Node{
        int distance;
        int v;
        int w;
        public Node(int v,int w,int d){
            this.v = v;
            this.w = w;
            distance = d;
        }
    }
    int V;
    ArrayList<ArrayList<Node>> adjList;

    public Graph(int v){
        V = v;
        adjList = new ArrayList<>(V);

        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v, int w){
        Node edge = new Node(u,v,w);
        adjList.get(u).add(edge);
        adjList.get(v).add(edge);
    }

    public void printG(){
        for (int i = 0; i < adjList.size(); i++) {
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.println(adjList.get(i).get());
            }
        }
    }
}