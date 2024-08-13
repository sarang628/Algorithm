package graph;

import java.util.Arrays;

public class GraphImpl implements IGraph {

    int[] vertex;
    int[][] edges;

    GraphImpl(int vertices) {
        vertex = new int[vertices];
        edges = new int[vertices][vertices];
    }

    @Override
    public void addEdge(int v, int w) {
        edges[v][w] = 1;
        edges[w][v] = 1;
    }

    @Override
    public int vertexCount() {
        return vertex.length;
    }

    @Override
    public int edgeCount() {
        int count = 0;
        for (int v = 0; v < vertex.length; v++) {
            for (int w = v; w < vertex.length; w++) {
                if (edges[v][w] == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(edges);
    }

    public static void main(String[] args) {
        GraphImpl graph = new GraphImpl(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);

        System.out.println(graph);
    }
}
