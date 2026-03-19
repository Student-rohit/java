package basic;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int temp = n;  
        int sum = 0;

        while (n != 0) {
            int a = n % 10;
            sum += a * a * a;
            n /= 10;
        }

        System.out.println(temp == sum ? "Armstrong" : "Not Armstrong");
    }
}


