package combination;

import java.util.Arrays;

public class Combination260211 {
    // combination cannot duplicate
    // [1, 2, 3]
    // [1, 2] [1, 3] [2, 3]
    // 3C2 -> total number + C + pick number
    // [1, 2, 3] , [1, 2, 4]...

    // [1, 2, 3, 4, 5]
    // v   v
    // v      v
    // v         v
    // v             v
    //
    //     v  v
    //     v      v
    //     v          v
    //
    //        v   v
    //        v       v
    //
    //            v   v

    // entry point
    public static void main(String args[]){
        System.out.println("Combination260211 practice");

        Combination260211 combination260211 = new Combination260211();
        int[] array = new int[]{1,2,3,4,5};
        combination260211.combination2(array, new boolean[array.length] , 0, 2);
    }

    // recursion
    public void combination2(int[] array, boolean[] visit, int start, int pick){
        if(pick == 0){
            System.out.println(Arrays.toString(visit).replace("true", "1").replace("false", "0"));
            return;
        }

/*        visit[0] = true; // pick = 1
        visit[1] = true; // pick = 2

        visit[1] = false; // pick = 1
        visit[2] = true; // pick = 2

        visit[2] = false; // pick = 1
        visit[3] = true; // pick = 2

        visit[3] = false; // pick = 1
        visit[4] = true; // pick = 2*/

        for(int i=start; i<array.length; i++){
            visit[i] = true; // pick = 1
            combination2(array, visit, i+1, pick-1);
            visit[i] = false; // pick = 0
        }

    }

    public void combination(int[] array, int pick){
        System.out.println(Arrays.toString(array));

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                for(int k=j+1; k<array.length; k++){

                    System.out.println(
                            String.format("[%s, %s, %s]", array[i], array[j], array[k])
                    );

                }
            }
        }

    }
}
