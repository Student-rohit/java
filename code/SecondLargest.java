package array;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15 , -15};

        Arrays.sort(arr);

        System.out.println("Second Largest: " + arr[arr.length - 2]);
    }
}






//import java.util.*;
//
//public class SecondLargest {
//    public static void main(String[] args) {
//        Integer[] arr = {10, 5, 20, 8, 15};
//
//        List<Integer> list = Arrays.asList(arr);
//        Collections.sort(list);
//
//        System.out.println("Second Largest: " + list.get(list.size() - 2));
//    }
//}