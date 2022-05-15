package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntArrayToIntegerArray {
    public static void main(String args[]) {
        int[] intArray = {1, 2, 3, 4, 5};
        Integer[] integerArray = {1, 2, 3, 4, 5};


        //convert ArrayList<Integer> -> int[]
        List<Integer> list = Arrays.stream(intArray).boxed().collect(Collectors.toList());
        int[] intArray1 = list.stream().mapToInt(i -> i).toArray();

        System.out.println(Arrays.equals(integerArray, intArrayToIntegerArray(intArray)));

        System.out.println(Arrays.equals(intArray, integerArrayTointArray(integerArray)));
    }

    private static Integer[] intArrayToIntegerArray(int number[]) {
        Integer[] numbers1 = new Integer[number.length];
        Arrays.setAll(numbers1, i -> number[i]);
        return numbers1;
    }

    private static int[] integerArrayTointArray(Integer numbers[]) {
        return Arrays.stream(numbers).mapToInt(value -> numbers[value - 1]).toArray();
    }
}
