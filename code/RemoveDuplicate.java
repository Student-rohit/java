package array;

import java.util.LinkedHashSet;
import java.util.Arrays;

public class RemoveDuplicate {
	public static void main (String[] args) {
		Integer[] arr= {12,43,56,83,83,12};
		LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
		
		Integer[] res=set.toArray(new Integer[0]);
		
		System.out.println("array duplicate");
		
		for(int n:res) {
			System.out.println(" number" +n);
		}
	}

}
