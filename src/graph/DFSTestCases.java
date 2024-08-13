package graph;

import java.util.Arrays;

import static graph.DFS.dfs;

public class DFSTestCases {
    public static void main(String[] args) {
        // Test Case 1
        int[][] graph1 = {
                {1, 2},
                {2},
                {0, 3},
                {}
        };
        int startNode1 = 2;
        int[] expectedOutput1 = {2, 0, 1, 3};
        System.out.println("Test Case 1: " + dfs(graph1, startNode1).equals(Arrays.asList(2, 0, 1, 3)));

        // Test Case 2
        int[][] graph2 = {
                {1, 2},
                {2, 3},
                {4, 5},
                {},
                {},
                {6},
                {}
        };
        int startNode2 = 0;
        int[] expectedOutput2 = {0, 1, 2, 4, 5, 6, 3};
        System.out.println("Test Case 2: " + dfs(graph2, startNode2).equals(Arrays.asList(0, 1, 2, 4, 5, 6, 3)));

        // Test Case 3
        int[][] graph3 = {
                {1},
                {2},
                {3},
                {4},
                {}
        };
        int startNode3 = 0;
        int[] expectedOutput3 = {0, 1, 2, 3, 4};
        System.out.println("Test Case 3: " + dfs(graph3, startNode3).equals(Arrays.asList(0, 1, 2, 3, 4)));

        // Test Case 4
        int[][] graph4 = {
                {1, 3},
                {2},
                {3},
                {}
        };
        int startNode4 = 0;
        int[] expectedOutput4 = {0, 1, 2, 3};
        System.out.println("Test Case 4: " + dfs(graph4, startNode4).equals(Arrays.asList(0, 1, 2, 3)));

        // Test Case 5
        int[][] graph5 = {
                {1, 2},
                {},
                {3, 4},
                {},
                {}
        };
        int startNode5 = 0;
        int[] expectedOutput5 = {0, 1, 2, 3, 4};
        System.out.println("Test Case 5: " + dfs(graph5, startNode5).equals(Arrays.asList(0, 1, 2, 3, 4)));

        // Test Case 6
        int[][] graph6 = {
                {1, 3},
                {2},
                {3, 4},
                {},
                {5},
                {}
        };
        int startNode6 = 0;
        int[] expectedOutput6 = {0, 1, 2, 3, 4, 5};
        System.out.println("Test Case 6: " + dfs(graph6, startNode6).equals(Arrays.asList(0, 1, 2, 3, 4, 5)));

        // Test Case 7
        int[][] graph7 = {
                {1},
                {2},
                {3},
                {4, 5},
                {},
                {6},
                {}
        };
        int startNode7 = 0;
        int[] expectedOutput7 = {0, 1, 2, 3, 4, 5, 6};
        System.out.println("Test Case 7: " + dfs(graph7, startNode7).equals(Arrays.asList(0, 1, 2, 3, 4, 5, 6)));

        // Test Case 8
        int[][] graph8 = {
                {1, 2, 3},
                {4},
                {4},
                {4},
                {}
        };
        int startNode8 = 0;
        int[] expectedOutput8 = {0, 1, 4, 2, 3};
        System.out.println("Test Case 8: " + dfs(graph8, startNode8).equals(Arrays.asList(0, 1, 4, 2, 3)));

        // Test Case 9
        int[][] graph9 = {
                {1},
                {2},
                {3},
                {0}
        };
        int startNode9 = 1;
        int[] expectedOutput9 = {1, 2, 3, 0};
        System.out.println("Test Case 9: " + dfs(graph9, startNode9).equals(Arrays.asList(1, 2, 3, 0)));

        // Test Case 10
        int[][] graph10 = {
                {1},
                {0}
        };
        int startNode10 = 0;
        int[] expectedOutput10 = {0, 1};
        System.out.println("Test Case 10: " + dfs(graph10, startNode10).equals(Arrays.asList(0, 1)));

        // 추가 테스트 케이스 (11-30) 생략
    }
}
