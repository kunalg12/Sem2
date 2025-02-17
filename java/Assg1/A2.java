import java.io.*;
class MyNumber
{
    private int data;

    MyNumber()
    {
        this.data=0;
    }
    MyNumber(int data)
    {
        this.data=data;
    }
   boolean isNegative()
    {
        return data<0;
    }

    boolean isPositive()
    {
        return data>0;
    }
    boolean isZero()
    {
        return data==0;
    }
    boolean isOdd()
    {
        
        return data%2!=0;
        
    }
    boolean isEven()
    {
        if(data==0)
          return false;
        return data%2==0;
    }
}
class A2
{
    public static void main(String args[])
    {
       MyNumber ob=new MyNumber(Integer.parseInt(args[0]));
       
       System.out.println("Is data Negative: "+ob.isNegative());
       System.out.println("Is data positive: "+ob.isPositive());
       System.out.println("Is data Zero: "+ob.isZero());
       System.out.println("Is Even: "+ob.isEven());
          System.out.println("Is Odd: "+ob.isOdd());
    }
}