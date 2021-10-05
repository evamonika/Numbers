class rotations
{
static int numberOfDigits(int n)
{
    int cnt = 0;
    while (n > 0)
    {
        cnt++;
        n /= 10;
    }
    return cnt;
}

static void cal(int num)
{
    int digits = numberOfDigits(num);
    int powTen = (int) Math.pow(10, digits - 1);
 
    for (int i = 0; i < digits - 1; i++)
    {
        int firstDigit = num / powTen;
 
        
        int left = ((num * 10) + firstDigit) -
                    (firstDigit * powTen * 10);
                 
        System.out.print(left + " ");
                 
        
        num = left;
    }
}
 
/
public static void main(String[] args)
{
    int num = 1445;
    cal(num);
}
}
 
