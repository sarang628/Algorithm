package practice;

/**
 * 소수
 * https://namu.wiki/w/%EC%86%8C%EC%88%98(%EC%88%98%EB%A1%A0)
 *
 * 1, -1과 자기 자신, 자기 자신의 반수[1]로밖에 나누어떨어지지 않는 1 이외의 정수로, 즉 양의 약수가 단 두 개뿐인 수를 의미한다.
 * 소수의 정의는 '1과 자기 자신으로밖에 나누어 떨어지지 않고 자기 자신의 곱셈의 역수가 없는 수'이다.[2]
 */
public class Prime {
    public static void main(String args[]) {
        System.out.println(Prime.class.getSimpleName());
        int primeNumbers[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67};

        for (int i = 0; i < primeNumbers.length; i++) {
            if (!isPrime(primeNumbers[i])) {
                System.out.println("실패!");
                break;
            }
        }
        System.out.println("성공!");
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
