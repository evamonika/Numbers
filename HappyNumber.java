import java.util.*;
public class HappyNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number");
		int x=sc.nextInt();
		
		int y=x;
		while(true)
		{
			if(y<10 && y==1)
			{
				System.out.println("The Number "+x+" is a Happy Number");
				break;
			}
			else if(y<10 && y!=1)
			{
				System.out.println("The Number "+x+" is a Not Happy Number");
				break;
			}
			else
			{
				int s=0;
				while(y>0)
				{
					s=s+(y%10);
					y=y/10;
				}
				y=s;
			}
		}
	}
}