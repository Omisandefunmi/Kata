package leetCodePractice;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] sample = {1, 0, 4, 9, 7, 5, 4, 3, 20, 11};
        int target = 20;
        int[] result = {0, 0};
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sample.length; i++) {
            int difference = target - sample[i];
            if(map.containsKey(difference)) {
                result[0] = map.get(difference);
                result[1] = i;
                break;
            }
            else{
                map.put(sample[i], i);
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
