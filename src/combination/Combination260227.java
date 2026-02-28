package combination;

import java.util.Arrays;

public class Combination260227 {
    public static void main(String[] args){
        System.out.println("Combination260227 Practice");

        Combination260227 combination = new Combination260227();
        int[] array = new int[]{1,2,3,4,5};
        System.out.println("combination ");
        System.out.println(Arrays.toString(array));

        combination.invoke(array, new boolean[array.length],0, 0);
    }

    /**
     * [1, 2, 3, 4, 5]
     *  v  v
     *  v     v
     *  v        v
     *  v           v
     *
     * Use recursion
     *
     * termination condition
     */
    public void invoke(int[] array, boolean[] mark,  int cursor, int level){
        System.out.println("   ".repeat(cursor) + array[cursor] + "," + level);
        System.out.println(Arrays.toString(mark).replace("false", "").replace("true", "v"));
        for(int i=cursor; i<array.length; i++){
            mark[i] = true;
            if(i+1 < array.length)
                invoke(array, mark, i + 1, level+1);
            mark[i] = false;
        }

    }
}
