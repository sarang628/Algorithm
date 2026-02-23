package combination;

import java.util.Arrays;

public class Combination260212 {

    // [1, 2, 3, 4, 5]
    //  v  v
    //  v     v
    //  v        v
    //  v           v
    //
    //     v  v
    //     v     v
    //     v        v
    //
    //        v  v
    //        v     v
    //
    //           v  v

    public static void main(String[] args){
        System.out.println("Combination260212 practice");

        Combination260212 combination260212 = new Combination260212();

        combination260212.combination(new int[]{1,2,3,4,5}, 0, 2);
    }

    public void combination(int[] array, int cursor, int selected){
        //System.out.println(Arrays.toString(array));;
        if(cursor+1 < array.length) {
            combination(array, cursor + 1, selected-1);
            if(selected > 0){
                combination(array, cursor + 1, selected);
            }
        }
    }
}
