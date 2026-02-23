package combination;

import java.util.Arrays;

public class Combination260213 {
    public static void main(String[] args){
        System.out.println("Combination260213 practice");

        Combination260213 combination260213 = new Combination260213();

        combination260213.combination(new int[]{1,2,3,4,5}, 0);
    }

    // duplication x, order x
    // selection from set
    // denoted C(n,k) n : elements, k : k-combination

    // [1, 2, 3, 4, 5]
    //  v  v
    //  v     v
    //  v        v
    //  v           v

    //     v  v
    //     v     v
    //     v        v

    //        v  v
    //        v    v

    //           v v


    // [1, 2, 3, 4, 5]

    public void combination(int[] array, int cursor){
        if(cursor > array.length-1) return;
        //System.out.println(Arrays.toString(array));
        System.out.println("  ".repeat(cursor) + array[cursor]);
        for(int i=cursor; i<array.length; i++) {
            combination(array, cursor + 1);
        }
    }
}
