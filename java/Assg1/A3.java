import java.io.*;
import java.util.*;
class Student
{
    int rno;
    String name;
    double per;

    Student()
    {
      rno=0;
      name="";
      per=0.0;
    }
    Student(int rno,String name,double per)
    {
        this.rno=rno;
        this.name=name;
        this.per=per;
    }
  
  static void sortStudent(Student ob[])
  {
    for(int i=0;i<ob.length-1;i++)
    {
        for(int j=i+1;j<ob.length;j++)
        {
            if(ob[i].per>ob[j].per)
            {
               Student temp=ob[i];
                ob[i]=ob[j];
                ob[j]=temp;
            }
        }
    }
  }

  public String toString()
  {
     return ("Rno: "+rno+" Name: "+name+" per: "+per);
  }
    

}
class A3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("how many students: ");
       int n=sc.nextInt();

       Student ob[]=new Student[n];

       for(int i=0;i<n;i++)
       {
        System.out.println("Rno: ");
        int rno=sc.nextInt();
        System.out.println("Name: ");
        String name=sc.next();
        System.out.println("Per: ");
        double per=sc.nextDouble();
         ob[i]=new Student(rno,name,per);
       }
      Student.sortStudent(ob);
      for(int i=0;i<n;i++)
      {
        System.out.println(ob[i]);
      }
      

    }
}