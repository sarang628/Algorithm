package combination;

import java.util.Arrays;

public class Combination260219 {
    public static void main(String[] args){
        System.out.println("Combination260219 practice");

        Combination260219 combination260219 = new Combination260219();

        combination260219.combination(new int[]{1,2,3,4,5}, 0, 0);
    }

    private void combination(int[] arrays, int cursor, int level){
        if(cursor > arrays.length-1) return;
        //System.out.println(Arrays.toString(arrays));
        if(level == 1){
            System.out.println("  ".repeat(cursor) + arrays[cursor]);
            return;
        }

        for(int i=0; i<arrays.length; i++){
            combination(arrays, i+1, level+1);
        }
    }
}
