package graph;

import java.util.*;

public class DFS {
    public static List<Integer> dfs(int[][] graph, int start) {
        System.out.println(Arrays.deepToString(graph));
        System.out.println("start node: " + start);

        boolean[] visited = new boolean[graph.length];

        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while (stack.size() > 0) {
            int node = stack.pop();
            visited[node] = true;
            for (int neighbor : graph[node]) {

            }
        }

        return new ArrayList<>();
    }

    public static List<Integer> dfs1(int[][] graph, int start) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited[node]) {
                visited[node] = true;
                result.add(node);

                for (int i = graph[node].length - 1; i >= 0; i--) {
                    int neighbor = graph[node][i];
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }

        return result;
    }
}