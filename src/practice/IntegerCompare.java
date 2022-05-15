package practice;

public class IntegerCompare {
    public static void main(String args[]) {

        //모자란 자릿수에 앞자리만큼 빈공간을 채워줘야함
        //ex)98, 2676 -> 9899, 2676
        //ex)2111345, 3 -> 2111345, 3333333

        int o1 = 98;
        int o2 = 256;
        int o3 = 0;

        solution2();

        String a = "000";
        StringBuffer sb = new StringBuffer(a);

        System.out.println(sb.length() > 0);
        System.out.println(sb.charAt(0) == '0');
        while(sb.length() > 1 && sb.charAt(0) == '0'){
            System.out.println("in");
            sb.delete(0,1);
        }
        System.out.println(sb.toString());

    }

    private static void solution3(){
        int num = 98;
        int len = 4;
        int toBeFilled = (int) (num / Math.pow(10, len));

        System.out.println(toBeFilled);
        //10000000이 나옴
    }

    private static void solution2() {
        int o2 = 2568596;
        int 자릿수 = 1;

        while (o2 != 0) {
            o2 = o2 / 10;
            자릿수 *= 10;
        }

        System.out.println(자릿수);
    }


    private void solution1() {
        int o1 = 98;
        int o2 = 256;
        int o3 = 0;

        // 둘 중 큰수를 가져와 나중에 10으로 계속 나누는 용도
        int max = Integer.max(o1, o2);
        // 둘 중 작은수의 가장 첫째자리를 가져와 뒤에 붙이는 용도
        int appendNumber = Integer.valueOf("" + String.valueOf(Integer.min(o1, o2)).charAt(0));

        while (max != 0) {
            o3 = o3 * 10 + appendNumber; //뒤에 붙여줌
            max = max / 10; //큰수를 10으로 계속 나눠줌
        }

        o3 = 10 ^ 101;

        System.out.println(o3);
    }
}
