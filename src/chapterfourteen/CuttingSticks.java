package chapterfourteen;

import java.util.*;

public class CuttingSticks {
    public static void main(String[] args) {
     List<Integer> arr = new ArrayList<>();
     arr.add(5);
     arr.add(4);
     arr.add(4);
     arr.add(2);
     arr.add(2);
     arr.add(5);
        System.out.println(cutTheSticks(arr));
    }

//    public static List <Integer> cutTheSticks(List<Integer> arr){
//        Collections.sort(arr);
//        Map <Integer, Integer> map = new LinkedHashMap<>();
//    }
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        Collections.sort(arr);

        int min = arr.get(0);
        result.add(arr.size());

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > min) {
                min = arr.get(i);
                result.add(arr.size()-i);
            }

        }
        return result;

    }


}
