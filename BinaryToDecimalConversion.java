import java.util.*;
public class BinaryToDecimalConversion{    
    public static int getDecimal(int binary){  
        int decimal = 0;  
        int n = 0;  
        while(true){  
          if(binary == 0){  
            break;  
          } else {  
              int temp = binary%10;  
              decimal += temp*Math.pow(2, n);  
              binary = binary/10;  
              n++;  
           }  
        }  
        return decimal;  
    }  
    public static void main(String args[]){    
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Binary number : ");
        int n = in.nextInt();
        System.out.println("Decimal of "+n+" is: "+getDecimal(n)); 
    }
} 