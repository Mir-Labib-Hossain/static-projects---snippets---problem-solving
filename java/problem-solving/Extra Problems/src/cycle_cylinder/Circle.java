package cycle_cylinder;


public class Circle {
 double radius;
    Circle()
    {
       radius = 1;
    }
    Circle(Double radius)
    {
        this.radius = radius;
    }
    double getRadius()
    {
        System.out.print("Radius is : ");
        return radius;
    }
    double getArea()
    {
        System.out.print("Area of circle : ");
        return Math.PI*Math.pow(radius, 2);
    }
}
