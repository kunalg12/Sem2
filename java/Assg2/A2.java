import java.io.*;
import java.util.*;
import MScCA1.*;
import MScCA2.*;

class Student
{
    int rno;
    String name;
    MScCA1Marks fy;
    MScCA2Marks sy;
  
  Student(int rno,String name,MScCA1Marks fy,MScCA2Marks sy)
  {
    this.rno=rno;
    this.name=name;
    this.fy=fy;
    this.sy=sy;
  }

  public int getTotalMarks()
  {
    return fy.getTotalMarks()+sy.getTotalMarks();
  }

  String gradeCalculate()
  {
    int totalMarks=getTotalMarks();
    double per=(totalMarks/4.0);
    
    if(per>=70)
      return "A";
    else if(per>=60)
      return "B";
    else if(per>=50)
      return "C";
    else if(per>=40)
      return "Pass Class";
    else
       return "FAIL";

  }

  void displayResult()
  {
    System.out.println("Roll no : "+rno+" Name: "+name);
    System.out.println("Total Marks: "+getTotalMarks()+" Grade: "+gradeCalculate()); 
  }

}
class A2
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("How many Students: ");
       int n=sc.nextInt(); 
    
      Student ob[]=new Student[n];

      for(int i=0;i<n;i++)
      {
        System.out.println("Enter roll no : ");
        int rno=sc.nextInt();
        System.out.println("Enter name ");
        String name=sc.next();

        System.out.println("Enter MScCA1 sem 1 total marks: ");
        int mscCA1Sem1= sc.nextInt();
        System.out.println("Enter MScCA1 sem 2 total marks: ");
        int mscCA1Sem2= sc.nextInt();
        MScCA1Marks mscCA1=new MScCA1Marks(mscCA1Sem1,mscCA1Sem2);

        System.out.println("Enter MScCA2 sem 1 total marks: ");
        int mscCA2Sem1= sc.nextInt();
        System.out.println("Enter MScCA2 sem 2 total marks: ");
        int mscCA2Sem2= sc.nextInt();
        MScCA2Marks mscCA2=new MScCA2Marks(mscCA2Sem1,mscCA2Sem2);

        ob[i]=new Student(rno,name,mscCA1,mscCA2);
      }

    System.out.println("\nStudent Results: ");
      for(Student s:ob)
      {
        s.displayResult();
      }
    }
}