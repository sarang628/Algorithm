package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {
    public static void main(String args[]) {
        System.out.println(Permutation.class.getSimpleName());

        int array[] = {1, 2, 3};

        combimnation(array);
    }

    private static void combimnation(int array[]) {
        //1,1
        //1,2
        //1,3
        //2,1
        //2,2
        //2,3
        //3,1
        //3,2
        //3,3
        ArrayList<Integer> intArr = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            intArr.add(array[i]);
        }

        int arr[] = intArr.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(arr));
    }
}
