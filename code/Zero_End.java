package basic;
import java.util.*;

public class Zero_End{
	public static void main(String[] args) {
		int arr[] = { 12,0,43,0,0,4,0,34,0};
		
		List<Integer> List = new ArrayList<>();
		int a=0;
		
		for(int num:arr) {
			if(num==0) {
				a++;
			}
			else {
				List.add(num);
			}
			
		}
		Collections.sort(List);
		for(int i=0;i<a;i++) {
			List.add(0);
		}
		System.out.println(List);
		
		
	}
}