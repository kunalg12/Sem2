import java.util.*;

abstract class Shape
{
    abstract void calcArea();
    abstract void calcVolume();
   
   abstract void display();
}

class Sphere extends Shape
{
    double radius;
    double area,volume;

    Sphere(double radius)
    {
        this.radius=radius;
    }

    void calcArea()
    { 
       area=4*3.14*radius*radius;
    }
    void calcVolume()
    {
        volume=(4.0/3)*3.14*radius*radius*radius;
    }

    void display()
    {
        System.out.print("Sphere Area : "+area+ " Sphere Volume: "+volume);
    }
}
class Cone extends Shape
{
    double radius,height;
    double area,volume;

    Cone(double radius,double height)
    {
        this.radius=radius;
        this.height=height;
    }

    void calcArea()
    { 
        double slantHeight=Math.sqrt(radius*radius+height*height);
       area=3.14*radius*(radius+slantHeight);
    }
    void calcVolume()
    {
        volume=(1.0/3)*3.14*radius*radius*height;
    }

    void display()
    {
        System.out.print("Cone Area : "+area+ " Cone Volume: "+volume);
    }
}
class Cylinder extends Shape
{
    double radius,height;
    double area,volume;

    Cylinder(double radius,double height)
    {
        this.radius=radius;
        this.height=height;
    }

    void calcArea()
    { 
       area=2*3.14*radius*(radius+height);
    }
    void calcVolume()
    {
        volume=3.14*radius*radius*height;
    }

    void display()
    {
        System.out.print("Cylinder Area : "+area+ " Cylinder Volume: "+volume);
    }
}
class Box extends Shape
{
    double length,breadth,height;
    double area,volume;

    Box(double length,double breadth,double height)
    {
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }

    void calcArea()
    { 
       area=2*(length*breadth+breadth*height+height*length);
    }
    void calcVolume()
    {
        volume=length*breadth*height;
    }

    void display()
    {
        System.out.println("Box Area : "+area+ " Box Volume: "+volume);
    }
}

class A2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Sphere radius: ");
        double sRadius=sc.nextDouble();
        Sphere s=new Sphere(sRadius);
        s.calcArea();
        s.calcVolume();
        s.display();
        
        System.out.println();
        
        System.out.println("Enter Cone radius: ");
        double cRadius=sc.nextDouble();
        System.out.println("Enter Cone height: ");
        double cHeight=sc.nextDouble();
        Cone c = new Cone(cRadius,cHeight);
         c.calcArea();
        c.calcVolume();
        c.display();
  

        System.out.println();

        System.out.println("Enter Cylinder radius: ");
        double cyRadius=sc.nextDouble();
        System.out.println("Enter Cylinder height: ");
        double cyHeight=sc.nextDouble();
        Cylinder cy=new Cylinder(cyRadius,cyHeight);
         cy.calcArea();
        cy.calcVolume();
        cy.display();

        
        System.out.println();

        System.out.println("Enter Box lenght: ");
        double l=sc.nextDouble();
        System.out.println("Enter Box breadth: ");
        double b=sc.nextDouble();
        System.out.println("Enter Box height: ");
        double h=sc.nextDouble();
        Box bo=new Box(l,b,h);
         bo.calcArea();
        bo.calcVolume();
        bo.display();
    }
}

