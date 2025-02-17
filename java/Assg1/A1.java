import java.io.*;
import java.util.*;

class Employee
{
    String name;
    String position;
    double salary;
    static int cnt;

    Employee()
    {
       
    }
    Employee(String name,String position,double salary)
    {
        this.name=name;
        this.position=position;
        this.salary=salary;
        cnt+=1;
    }
    public String toString()
    {
       return ("Name: "+name+" Position: "+position+" Salary: "+salary);
    }
    static void display()
    {
       System.out.println(cnt);
    }

}
class A1{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many employee: ");
        int n=sc.nextInt();

      Employee ob[]=new Employee[n];

      for(int i=0;i<n;i++)
      {
        System.out.println("Enter name: ");
        String name=sc.next();

        System.out.println("Enter position: ");
        String position=sc.next();

        System.out.println("Enter salary: ");
        double salary=sc.nextDouble();

        ob[i]=new Employee(name,position,salary);
      }
     
     for(int i=0;i<n;i++)
     {
         System.out.println("ob Count: "+(i+1));
        System.out.println(ob[i]);

     }
    //  System.out.println("Count: "+n);
     
    }
    
}