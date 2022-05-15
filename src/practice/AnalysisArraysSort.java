package practice;

import java.util.Arrays;
import java.util.Comparator;

public class AnalysisArraysSort {
    public static void main(String args[]) {
        System.out.println("test");
        Integer[] numbers = {1, 6, 3, 9, 5};

        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer small, Integer large) {
                System.out.println("small:" + small + ",large:" + large);

                System.out.println("compare:" + Integer.compare(small, large));

                if (small > large) {
                    return 1;
                } else if (small < large) {
                    return -1;
                }
                return 0;
            }
        });

        System.out.println("result:" + Arrays.toString(numbers));
    }
}
