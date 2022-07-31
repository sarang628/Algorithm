package practice;

public class DFS {
    public static void main(String args[]) {
        System.out.println("");
        int b[] = {0, 1, 2};

        dfs(b, 0, 0);
    }

    private static void dfs(int b[], int depth, int sum) {
        if (b.length > depth) {
            System.out.println(String.format("%s + %s = %s", sum, b[depth], (sum + b[depth])));
            dfs(b, depth + 1, sum + b[depth]);
            System.out.println(String.format("%s - %s = %s", sum, b[depth], (sum - b[depth])));
            dfs(b, depth + 1, sum - b[depth]);
        }
    }
}
