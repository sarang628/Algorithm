package array;

import java.util.Arrays;

public class OneDimensionArray {
    public static void main(String[] args) {

        Integer[] arr = {1, 3, 5, 4, 2};

        //퀵소트
        Arrays.sort(arr, (a, b) -> {
            return a-b; // a-b 이면  오름차순, b-a 이면 내림차순
        });

        System.out.println(Arrays.toString(arr));
    }
}
