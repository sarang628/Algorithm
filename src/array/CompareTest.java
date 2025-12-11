package array;

import java.util.Arrays;

public class CompareTest {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {7, 8}, {4, 5}, {0, 1}};

        Arrays.sort(array, (a, b) -> {
            System.out.println(
                    String.format("(b[0] :%s + b[1] : %s) - (a[0] : %s + a[1] : %s)", b[0], b[1], a[0], a[1])
            );
            return (b[0] + b[1]) - (a[0] + a[1]);
        });

        System.out.println(Arrays.deepToString(array));
    };
}
