package combination;

public class CombinationMain {
    public static void main(String args[]) {
        int n = 4;
        int[] arr = {1, 2, 3, 4};
        boolean[] visited = new boolean[n];
        Combination1 combination1 = new Combination1();

        for (int i = 1; i <= n; i++) {
            System.out.println("\n" + n + " 개 중에서 " + i + " 개 뽑기");
            combination1.backTracking(arr, visited, 0, n, i);
            //combination1.recursive(arr, visited, 0, n, i);
        }
    }
}
