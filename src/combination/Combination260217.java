package combination;

import java.util.Arrays;

public class Combination260217 {
    public static void main(String[] args){
        System.out.println("Combination260217 practice");

        Combination260217 combination260217 = new Combination260217();

        combination260217.combination(new int[]{1,2,3,4,5}, 2, 0, 0);

    }

    // 1, 2, 3, 4, 5
    // v  v
    // v     v
    // v        v
    // v           v

    //    v  v
    //    v     v
    //    v        v

    //       v  v
    //       v     v

    //          v  v

    private void combination(int[] array, int r, int cursor, int level){
        //System.out.println(Arrays.toString(array));
        if(cursor > array.length-1) return;

        if(level > r) return;
        if(level == r)
            System.out.println(cursor + "," + "  ".repeat(cursor)+array[cursor]);

        for(int i=0; i<5; i++){
            combination(array, r, cursor+i, level+1);
        }
    }
}
