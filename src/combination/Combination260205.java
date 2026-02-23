package combination;

import java.util.Arrays;

public class Combination260205 {
    public static void main(String args[]){
        System.out.println("Combination260205 practice");

        Combination260205 combination260205 = new Combination260205();

        combination260205.combination(new int[]{1,2,3,4,5}, new boolean[5], 0, 2);
    }

    public void combination(int[] array, boolean[] visit, int cursor, int r){
        if(visit[cursor]){
            return;
        }

        for(int i=cursor; i<array.length; i++){
            visit[cursor] = true;
            System.out.println(
              String.format("start i = %s\nr = %s\nvisited : %s", i, r, Arrays.toString(visit))
            );
            combination(array, visit, i+1, r - 1);
            visit[cursor] = false;
            System.out.println(
                    String.format("end i = %s\nr = %s\nvisited : %s", i, r, Arrays.toString(visit))
            );
        }

    }
}
