package programmers;

import java.util.Arrays;

public class SecretCode {
    public static void main(String args[]){
        System.out.println("SecretCode Practice");

        SecretCode secretCode = new SecretCode();

        secretCode.findCombination(new int[]{1,2,3,4,5}, 2);
    }

    private void findCombination(int[] input, int correct){
        System.out.println(Arrays.toString(input));
        combination(input, new boolean[input.length],0);
    }

    private void combination(int[] input, boolean[] visited, int cursor){
        if(visited[cursor])
            return;

        System.out.print(input[cursor]);

        visited[cursor] = true;


        for(int i=0; i<input.length; i++){
            if(input.length > cursor+1) {
                combination(input, new boolean[input.length], cursor + 1);
                System.out.println();
            }
        }

        if(input.length > cursor+1)
            combination(input, visited, cursor+1);

    }
}
