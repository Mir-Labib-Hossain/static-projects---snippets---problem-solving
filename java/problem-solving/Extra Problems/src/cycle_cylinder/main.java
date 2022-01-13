package cycle_cylinder;

import cycle_cylinder.Cylinder;
import cycle_cylinder.Circle;
import java.util.Scanner;
public class main {
public static void main(String [] args){
    Circle c = new Circle(2.3);
            System.out.println("With Default Radius :-");
            System.out.println(c.getRadius());
            System.out.println(c.getArea());
    Scanner labib = new Scanner(System.in);
    System.out.println("\n-----------------------------------\n");
            System.out.print("Enter Radius :");
            Double a = labib.nextDouble();
            c = new Circle(a);
            System.out.println("With Inputed Radius :-");
            System.out.println(c.getRadius());
            System.out.println(c.getArea());
    System.out.println("\n-----------------------------------\n");
    Cylinder y = new Cylinder();
            System.out.println("With Default Height & Radius :-");
            System.out.println(y.getHeight());
            System.out.println(y.getVolume());
    System.out.println("\n-----------------------------------\n");
             y = new Cylinder(a);
             System.out.println("With Inputed Radius :-");
             System.out.println(y.getHeight());
             System.out.println(y.getVolume());
    System.out.println("\n-----------------------------------\n");
             System.out.print("Enter Height of Cylinder :");
             double b = labib.nextDouble();           
             y = new Cylinder(a,b);
             System.out.println("With Inputed Height & Radius :-");
             System.out.println(y.getHeight());
             System.out.println(y.getVolume());
}
}
