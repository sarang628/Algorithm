package combination;

import java.util.Arrays;

public class Combination260131 {
    public static void main(String args[]){
        System.out.println("Combination260131 practice");

        Combination260131 combination260131 = new Combination260131();

        combination260131.combination(new int[]{1,2,3,4,5}, new boolean[5], 0, 2);
    }

    private void combination(int[] array){
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                for (int k = j+1; k < array.length; k++) {
                    System.out.println(array[i] + "," + array[j] +"," + array[k]);
                }
            }
        }
    }

    private void combination(int[] array, boolean[] visited, int cursor, int n){
        if(n == 0){
            for(int i=0; i<visited.length; i++){
                if(visited[i])
                    System.out.print(array[i] + ", ");
            }
            System.out.println();
            return;
        }

        for(int i=cursor; i<array.length; i++){
            visited[cursor] = true;
            combination(array, visited, cursor+1, n - 1);
            visited[cursor] = false;
        }
    }
}
