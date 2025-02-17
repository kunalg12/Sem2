import java.util.*;
abstract class Staff
{
     protected String name;
     protected  String address;

    Staff(String name,String address)
    {
        this.name=name;
        this.address=address;
    }

    abstract void display();
}

class FullTimeStaff extends Staff
{
    String dept;
    double sal;

    FullTimeStaff(String name,String address,String dept,double sal)
    {
        super(name,address);
        this.dept=dept;
        this.sal=sal;
    }

    void display()
    {
        System.out.println("Name : "+super.name+" Address: "+super.address+" Department: "+dept+" Salary: "+sal);
    }
}
class PartTimeStaff extends Staff
{
    double noOfHrs,ratePerHr;

    PartTimeStaff(String name,String address,double noOfHrs,double ratePerHr)
    {
        super(name,address);
        this.noOfHrs=noOfHrs;
        this.ratePerHr=ratePerHr;
    }

    double getTotalSal()
    {
        return noOfHrs*ratePerHr;
    }

    void display()
    {
        System.out.println("Name : "+super.name+" Address: "+super.address+" No of hours: "+noOfHrs+" Rate per hour: "+ratePerHr+" Total Salary : "+getTotalSal());
    }
}
class A3
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);

     while(true)
	{
        System.out.println("1.FullTimeStaff");
     System.out.println("2.PartTimeStaff");
     System.out.println("3.Exit");
      int choice=sc.nextInt();
     switch(choice)
     {
      
       case 1: System.out.print("How many FullTime employees: ");
               int n = sc.nextInt();
               FullTimeStaff ob[]=new FullTimeStaff[n];
               for(int i=0;i<n;i++)
               {
                System.out.println("Enter name: ");
                String name=sc.next();
                System.out.println("Enter address: ");
                String address=sc.next();
                System.out.println("Enter dept: ");
                String dept=sc.next();
                System.out.println("Enter salary: ");
                double sal=sc.nextDouble();

                ob[i]=new FullTimeStaff(name,address,dept,sal);
               }
               for(int i=0;i<n;i++)
               {
                ob[i].display();
               }
               break;

        case 2: System.out.print("How many PartTime employees: ");
               int n2 = sc.nextInt();
               PartTimeStaff ob1[]=new PartTimeStaff[n2];
               for(int i=0;i<n2;i++)
               {
                System.out.println("Enter name: ");
                String name=sc.next();
                System.out.println("Enter address: ");
                String address=sc.next();
                System.out.println("Enter No of hrs: ");
                double hrs=sc.nextDouble();
                System.out.println("Enter Rate per hr ");
                double rHr=sc.nextDouble();

                ob1[i]=new PartTimeStaff(name,address,hrs,rHr);
               }
               for(int i=0;i<n2;i++)
               {
                ob1[i].display();
               }
               break; 

        case 3: return;

        default : System.out.print("Select any above options");
                  break;             
     }
    }
    }
}