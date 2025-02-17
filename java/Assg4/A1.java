import java.io.*;
import java.util.*;
interface Java_Array
{
    public int []arrayReverse(int arr[]);
    public int []arrayCopy(int arr[]);
    public int arrayMax(int arr[]);
}
class MyArray implements Java_Array
{
  public int[] arrayReverse(int arr[])
  {
    int res[] = new int[arr.length];
    int j=arr.length-1;
    for(int i=0;i<arr.length;i++)
    {
      res[j--] = arr[i];

    }

    return res;
  }

  public int []arrayCopy(int arr[])
  {
    int arrCopy[]=new int[arr.length];
    for(int i=0;i<arr.length;i++)
    {
        arrCopy[i]=arr[i];
    }

    return arrCopy;
  }
  public int arrayMax(int arr[])
  {
    int max=arr[0];
    for(int i=1;i<arr.length;i++)
    {
        if(arr[i]>max)
          max=arr[i];
    }
   //System.out.println("Maximum in arr is : "+max);
    return max;
  }

  
}
public class A1 
{
    public static  void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        MyArray ob =new MyArray();

        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];


        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int arrReverse[]=ob.arrayReverse(arr);
        int arrCopy[]=ob.arrayCopy(arr);

       System.out.print("Reversed array: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arrReverse[i]+ " ");
        }
      System.out.print("Array Copy: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arrCopy[i]+ " ");
        }
        
       System.out.println("Maximum in arr is : "+ob.arrayMax(arr));
    }
}