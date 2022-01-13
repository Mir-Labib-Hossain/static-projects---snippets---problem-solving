package cycle_cylinder;


import cycle_cylinder.Circle;


public class Cylinder extends Circle {
    double height ;
    Cylinder()
    {
        height = 1;
    }
    Cylinder(double radius)
    {
        super(radius);
        height = 1;
    }
    Cylinder(double radius, double height)
    {
        super(radius);
        this.height = height;
    }
    double getHeight()
    {
        System.out.print("Height is : ");
        return height;
    }
    double getVolume()
    {
        System.out.print("Volume of sylinder : ");
        return Math.PI*radius*radius*height;
    }
}
