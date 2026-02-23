package combination;

import java.util.Arrays;

public class Combination260201 {
    public static void main(String[] args){
        System.out.println("Combination260201 practice");

        Combination260201 combination260201 = new Combination260201();

        int[] array = new int[]{1,2,3,4,5};

        combination260201.combination(array, new boolean[array.length], 0,2);
    }

    void combination(int[] array, boolean[] visited, int cursor, int count){
        if(count == 0){
            System.out.println(cursor);
            /*System.out.println(
                    String.format("배열 %s 중 %s개 조합 만들기", Arrays.toString(array), count)
            );*/
            System.out.println(Arrays.toString(visited));
            return;
        }
        if(visited[cursor]){
            return;
        }

        for(int i=cursor; i<array.length; i++){
            visited[cursor] = true;
            combination(array, visited, i, count-1);
            visited[cursor] = false;
        }
    }

    void combination(int[] array){
        System.out.println(
                String.format("배열 %s 중 %s개 조합 만들기", Arrays.toString(array), 3)
        );

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                for(int k=j+1; k<array.length; k++ ){
                    System.out.println(
                            String.format("[%s, %s, %s]", array[i], array[j], array[k])
                    );
                }
            }
        }
    }
}
