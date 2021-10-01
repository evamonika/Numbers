import java.util.*;
public class isprime
{
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number to check it is prime or not: ");
        int n = in.nextInt();
        boolean isprime = true;
        int count = 0;
        if(n==1)
        {
            System.out.println(n+" is neither prime nor a composite number.");
            return;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
            if(count>0)
            {
                isprime = false;
            }
        }
        if(isprime)
        {
            System.out.println(n+" is a Prime Number.");
        }
        else
        {
            System.out.println(n+" is not a Prime Number.");
        }
    }
}
        
