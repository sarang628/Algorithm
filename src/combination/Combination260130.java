package combination;

import java.util.Arrays;

public class Combination260130 {
    public static void main(String args[]){
        System.out.println("Combination Practice");

        Combination260130 combination260130 = new Combination260130();

        combination260130.combination(new int[]{1,2,3,4,5}, new boolean[5], 0, 5, 2);
    }

    private void combination(int[] array, boolean[] visited, int start, int n, int r){

        if(r == 0){
            System.out.println(Arrays.toString(visited));
        }

        for(int i=start; i<n; i++){
            visited[i] = true;
            combination(array, visited, start + 1, n, r - 1);
            visited[i] = false;
        }
    }

    private void combination(int[] array, boolean[] checked, int cursor, int level) {
        if(checked[cursor]){
            return;
        }
        checked[cursor] = true;
        System.out.println(
                String.format("level:%s %s", level, array[cursor])
        );

        if(array.length > cursor+1)
            combination(array, new boolean[array.length], cursor+1, level);

        if(array.length > cursor+1)
            combination(array, checked, cursor+1, level+1);
    }
}
