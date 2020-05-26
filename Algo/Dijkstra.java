/**
 * Dijkstra
 */
public class Dijkstra {

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(1, 2, 10);
        g.addEdge(2, 3, 20);
        g.addEdge(3, 1, 50);

        g.printG();
    }
}