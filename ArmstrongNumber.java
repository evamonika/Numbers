import java.util.Scanner;  
import java.lang.Math;

public class ArmstrongNumber {
	static boolean isArmstrong(int n) {

		int m=n;
		int sum=0;

		while(m>0){
			int x=m%10;
			sum+=Math.pow(x,3);
			m/=10;
		}
		return sum == n;
	}    
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter the limit: ");  
		int num=sc.nextInt();
		System.out.println("Armstrong Number up to "+ num + " are: ");

		for(int i=0; i<=num; i++)  
			if(isArmstrong(i))  
				System.out.print(i+ ", ");  
	}   
}  
