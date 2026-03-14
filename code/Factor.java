package basic;
import java.util.Scanner;


public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		int fact=5;
		
		for(int i=0;i<=a ; i++) {
			fact *=i;
			System.out.println("factorial number" + fact);
		}
		

	}

}
