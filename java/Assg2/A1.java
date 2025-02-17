import NumOperation.*;

class A1
{
    public static void main(String args[])
    {
        PrimeNumber ob1=new PrimeNumber();
        PerfectNumber ob2=new PerfectNumber();
        ArmstrongNumber ob3=new ArmstrongNumber();

        
      System.out.println(ob1.isPrime(4));
        System.out.println(ob2.isPerfect(7));
        System.out.println(ob3.isArmstrong(15));
        
        
    }
}