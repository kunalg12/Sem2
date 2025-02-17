import java.util.*;

class Employee
{
   private int id;
   private String name;
   private String dept;
   private double sal;

   Employee()
   {
    id=0;
    name="";
    dept="";
    sal=0.0;
   }

   Employee(int id,String name,String dept,double sal)
   {
    this.id=id;
    this.name=name;
    this.dept=dept;
    this.sal=sal;
   }
   double getSalary()
   {
    return sal;
   }
   void display()
   {
     System.out.println("Id: "+id+" Name: "+name+" dept: "+dept+" Salary: "+sal);
   }


}

class Manager extends Employee{

    private double bonus;

    Manager(int id,String name,String dept,double sal,double bonus)
    {
        super(id,name,dept,sal);
        this.bonus=bonus;
    }

    double getTotalSalary()
    {
        return getSalary()+bonus;
    }
    void display()
    {
        super.display(); 
        System.out.println("Bonus:"+bonus);
        System.out.println("Total salary: "+getTotalSalary());
    }

}
class A1{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        Manager[] ob=new Manager[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter id: ");
            int id=sc.nextInt();
            System.out.print("Enter name: ");
            String name=sc.next();
            System.out.print("Enter department: ");
            String dept=sc.next();
            System.out.print("Enter salary: ");
            double sal=sc.nextDouble();
            System.out.print("Enter bonus:");
            double bonus=sc.nextDouble();

            ob[i]=new Manager(id,name,dept,sal,bonus);
        }

        Manager max=ob[0];
        for(int i=0;i<n;i++)
        {
            if(ob[i].getTotalSalary()>max.getTotalSalary())
             max=ob[i];
        }

        System.out.println("Manager with highest total salary: ");
        max.display();
    }
}