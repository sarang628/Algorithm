package combination;

public class Combination1 {
    public void Combination1() {
        System.out.println("Combination1");
    }

    // 백트래킹 사용
    // 사용 예시 : combination(arr, visited, 0, n, r)
    void backTracking(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            print(arr, visited, n);
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            backTracking(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    // 재귀 사용
    // 사용 예시 : comb(arr, visited, 0, n, r)
    void recursive(int[] arr, boolean[] visited, int depth, int n, int r) {
        if (r == 0) {
            print(arr, visited, n);
            return;
        }

        if (depth == n) {
            return;
        }

        visited[depth] = true;
        recursive(arr, visited, depth + 1, n, r - 1);

        visited[depth] = false;
        recursive(arr, visited, depth + 1, n, r);
    }

    // 배열 출력
    void print(int[] arr, boolean[] visited, int n) {
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
