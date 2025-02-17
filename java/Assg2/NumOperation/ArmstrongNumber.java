package NumOperation;

public class ArmstrongNumber
{
    public static boolean isArmstrong(int n)
    {
        int temp=n;
        int sum=0;

        while(n>0)
        {
            int digit=n%10;
            sum+=(digit*digit*digit);
            n/=10;
        }

        return temp==sum;
    }
}