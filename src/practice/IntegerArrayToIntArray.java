package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class IntegerArrayToIntArray {
    public static void main(String args[]){
        System.out.println("test");

        ArrayList<Integer> test = new ArrayList<>();

        test.add(1);
        test.add(2);
        test.add(3);

        int[] array = test.stream().mapToInt(i -> i).toArray();

        System.out.println(Arrays.toString(array));
    }
}
