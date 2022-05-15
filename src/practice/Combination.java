package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Combination {
    public static void main(String args[]) {
        System.out.println(Combination.class.getSimpleName());
        Integer[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(combination(arr, arr.length)));
    }

    private static Integer[] combination(Integer[] numbers, int digit) {
        //입력받는 배열 복사
        Integer[] cloneNumbers = numbers.clone();
        if (digit > 1) {
            ArrayList<Integer> array = new ArrayList<>();
            //배열 크기만큼 재귀함수 호출
            Integer[] result = combination(numbers, digit - 1);

            //입력받은 배열과 조합결과를 다시 조합
            for (int i = 0; i < cloneNumbers.length; i++) {
                for (int j = 0; j < result.length; j++) {
                    array.add(Integer.valueOf("" + cloneNumbers[i] + result[j]));
                }
            }
            cloneNumbers = new Integer[array.size()];
            Arrays.setAll(cloneNumbers, value -> array.get(value));
        }
        //조합한 배열 리턴
        return cloneNumbers;
    }
}
