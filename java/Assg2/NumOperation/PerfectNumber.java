package NumOperation;

public class PerfectNumber
{
    public static boolean isPerfect(int n)
    {
        if(n<=0) 
          return false;
        
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
              sum+=i;
        }

        return sum==n;
    }
}