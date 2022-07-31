package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String args[]) {
        new Solution().solution();
    }

    static class Solution {
        public int solution() {
            int answer = 0;

            Map<Integer, Integer> clothes = new HashMap<Integer, Integer>();

            clothes.put(1, 1);
            clothes.put(3, 1);
            clothes.put(5, 1);
            clothes.put(7, 1);
            clothes.put(9, 1);
            clothes.put(10, 1);

            Set<Map.Entry<Integer, Integer>> clothesEntry = clothes.entrySet();

            Set<Integer> clothKeys = clothes.keySet();

            int[] keys = clothKeys.stream().mapToInt(i->i).toArray();

            for(int key : keys){
                System.out.println(key);
            }
            
            return answer;
        }
    }
}
