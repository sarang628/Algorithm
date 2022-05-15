package practice;

import java.util.Arrays;
import java.util.stream.Stream;

public class IntToIntArray {
    public static void main(String args[]) {
        int number = 12345;
        int numbers[] = {1, 2, 3, 4, 5};

        System.out.println(Arrays.equals(numbers, intToIntArrays(number)));
    }

    private static int[] intToIntArrayWithStream(int number) {
        return Stream.of(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();
    }

    private static int[] intToIntArrays(int number) {
        String temp = String.valueOf(number);
        int[] array = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            array[i] = temp.charAt(i) - '0';
        }
        return array;
    }
}
