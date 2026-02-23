package combination;

import java.util.Arrays;

public class Combination260220 {
    public static void main(String[] args){
        System.out.println("Combination260220 practice");

        Combination260220 combination260220 = new Combination260220();
        combination260220.invoke(new int[]{1,2,3,4,5}, new boolean[5],  2,0);
    }

    // [1, 2, 3, 4, 5]
    //  v  v
    //  v     v
    //  v        v
    //  v           v
    //
    //     v  v
    //     v     v
    //     v        v

    // v  v  v
    // v  v     v
    // v  v        v
    //
    //    v  v  v
    //    v  v     v
    //
    //       v  v  v
    private void invoke(int[] array, boolean[] visit, int pick, int cursor){
        if(cursor > array.length-1) return;
        if(pick < 0) return;
        if(pick == 0) {
            System.out.println(Arrays.toString(visit));
        }
        for(int i=0; i<visit.length; i++){
            visit[cursor] = true;
            invoke(array, visit, pick-1, cursor+1);
        }
    }
}
