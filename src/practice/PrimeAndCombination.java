package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeAndCombination {
    public static void main(String args[]) {
        System.out.println(PrimeAndCombination.class.getSimpleName());

        //모든 경우의 수에서 소수인 숫자만 찾아내기
        Integer[] numbers = {1, 2, 3, 4, 5, 6};

        Integer[] result = Combination.combination(numbers);

        long currentTime = System.currentTimeMillis();

        //System.out.println(Arrays.toString(result));

        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = 0; i < result.length; i++) {
            if (Prime.isPrime(result[i])) {
                primes.add(result[i]);
            }
        }
        //System.out.println(Arrays.toString(primes.stream().mapToInt(i -> i).toArray()));

        long diff = System.currentTimeMillis() - currentTime;
        System.out.println(diff + "밀리초");

    }
}
