package combination;

import java.util.Arrays;

public class Combination260228_1 {
    public static void main(String[] args){
        new Combination260228_1().invoke(new int[]{1,2,3,4,5,6,7}, new boolean[7], 0,4);
    }

    void invoke(int[] array, boolean[] mark, int cursor, int r){
        if(r == 0){
            System.out.println(Arrays.toString(mark).replace("true", "v").replace("false", " "));
        }

        for(int i=cursor; i<array.length; i++){
            mark[i] = true;
            invoke(array, mark, i+1, r-1);
            mark[i] = false;
        }
    }
}
