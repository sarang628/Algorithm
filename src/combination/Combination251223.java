package combination;

public class Combination251223 {
    public static void main(String args[]){
        System.out.println("test");
        combination(new int[]{1, 2, 3, 4}, 1);
    }

    private static void combination(int[] arr, int n){
        // 1
        // 2
        // 3
        // 4

        // 1 2
        // 1 3
        // 1 4
        // 2 3
        // 2 4
        // 3 4


        // 4C3
        // 1 2 3
        // 1 2 4
        // 1 3 4
        // 2 3 4

        // N개를 선택 시
        // 4개의 화살표를 다 붙여놓고 가장 끝에 것 부터 한칸씩 이동.
        // 마지막 화살표가 사라지면 그 이전 화살표가 한칸 앞으로 이동.
        // 이전 화살표가 이동하면 이동한 화살표 다음 화살표가 다시 생김.
        // 반복
    }
}
