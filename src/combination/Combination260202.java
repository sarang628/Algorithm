package combination;

import java.util.Arrays;

public class Combination260202 {
    public static void main(String args[]){
        System.out.println("Combination260202 practice");

        Combination260202 combination260202 = new Combination260202();
        combination260202.combination(new int[]{1,2,3,4,5}, new boolean[5], 0, 2);
    }
    public void combination(int[] array, boolean[] visited, int cursor, int count){
        if(count == 0){
            System.out.println(
                    Arrays.toString(visited)
            );
            return;
        }
        if(visited[cursor]){
            return;
        }

        for (int i = cursor; i < array.length; i++) {
            visited[i] = true;
            combination(array, visited, i + 1, count - 1);
            visited[i] = false;
        }
    }

    public void combination(int[] array){
        System.out.println(
                String.format("베열 %s 중 %s 개 조합.", Arrays.toString(array), 2)
        );

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                System.out.println(
                        String.format("%s, %s", array[i], array[j])
                );
            }
        }
    }
}
