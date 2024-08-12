package graph;

import practice.DFS;

import java.util.Iterator;
import java.util.Stack;

public class GraphTest {
    public static void main(String[] args) {
        //Graph g = null;
        edu.princeton.cs.algs4.Graph g = new edu.princeton.cs.algs4.Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
//        g.addEdge(1, 2);
//        g.addEdge(2, 0);
//        g.addEdge(2, 3);
//        g.addEdge(3, 3);

        System.out.println(g);
        DFS(g, 0);
    }

    private static void DFS(edu.princeton.cs.algs4.Graph g, int node) {
        boolean visited[] = new boolean[g.V()];
        DFSUtil(g, visited, node);
    }

    private static void DFSUtil(edu.princeton.cs.algs4.Graph g, boolean visited[], int node) {
        visited[node] = true;
        System.out.print(node);
        Iterator it = g.adj(node).iterator();
        while (it.hasNext()) {
            int v = (Integer) it.next();
            if (!visited[v]) {
                DFSUtil(g, visited, v);
            }
        }
    }
}
