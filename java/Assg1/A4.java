import java.io.*;
import java.util.*;

class A4
{
    static int[][] matrix(int arr1[][],int arr2[][])
    {
        
        int rowA=arr1.length;
        int colA=arr1[0].length;
        int rowB=arr2.length;
        int colB=arr2[0].length;
        
        int c[][] = new int[rowA][colB];

        System.out.println("Matrix Multiplication of M1 & M2 is: ");

        for(int i=0;i<rowA;i++)
        {
            for(int j=0;j<colB;j++)
            {
                for(int k=0;k<colA;k++)
                {
                    c[i][j]+= arr1[i][k
                    ] * arr2[k][j];
                }
            }
        }

        return c;
    }
    public static void main(String args[])
    {
        
      Scanner sc =new Scanner(System.in);
      System.out.print("Enter matrix 1 rows:");
      int rowA=sc.nextInt();
      System.out.print("Enter matrix 1 col:");
      int colA=sc.nextInt();

      System.out.print("Enter matrix 2 rows:");
      int rowB=sc.nextInt();
      System.out.print("Enter matrix 2 col:");
      int colB=sc.nextInt();

      if(colA!=rowB)
        {
            System.out.println("We cannot do matrix multiplication!!");
            return;
        }  

    int a[][]=new int[rowA][colA];
    int b[][]=new int[rowB][colB];

     System.out.println("Enter elements for Matrix 1: ");

        for(int i=0;i<rowA;i++)
        {
            for(int j=0;j<colA;j++)
            {
                a[i][j]=sc.nextInt();

            }
            System.out.println();
        } 

    System.out.println("Enter elements for Matrix 2: ");

        for(int i=0;i<rowB;i++)
        {
            for(int j=0;j<colB;j++)
            {
                b[i][j]=sc.nextInt();

            }
             System.out.println();
        } 
       
    //    int a[][] = {{1,2,4},
    //                 {4,5,6}
    //               };

     
    //   int b[][] = {{5,6},
    //                {7,8},
    //                {9,1}};

        // int rowA=a.length;
        // int colA=a[0].length;
        // int rowB=b.length;
        // int colB=b[0].length;
        
    
      int c[][] = matrix(a,b);

      for(int i=0;i<c.length;i++)
      {
        for(int j=0;j<c[i].length;j++)
        {
            System.out.print(c[i][j]+" ");
        }
        System.out.println();
      }
      
    }
}