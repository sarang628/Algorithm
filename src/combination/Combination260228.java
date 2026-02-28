package combination;

import java.util.Arrays;

public class Combination260228 {

    public static void main(String[] args){
        System.out.println("Combination260228 Practice");

        Combination260228 combination = new Combination260228();
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        combination.invoke(array, new boolean[array.length], 2, 0);
    }

    /**
     * number of cases
     * expression : nCr
     * no duplication
     *
     * [1, 2, 3, 4, 5]
     *  v  v  v
     *  v  v     v
     *  v  v        v
     */
    private void invoke(int[] array, boolean[] mark, int r, int cursor){
        if(cursor == 0)
            System.out.println("combination: " + Arrays.toString(array) + " pick: " + r);

        if(r == 0){
            System.out.println(Arrays.toString(mark).replace("true", "v").replace("false", " "));
            return;
        }

        for(int i=cursor; i<array.length; i++){
            mark[i] = true;
            if(i+1 <= array.length){
                invoke(array, mark, r-1, i+1);
            }
            mark[i] = false;
        }
    }

}
