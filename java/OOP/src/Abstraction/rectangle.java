package Abstraction;


import Abstraction.Shape;

public class rectangle extends Shape{
rectangle(double a, double b)
{
    super(a,b);
}
void area(){
    System.out.println("Area of Rectangle "+a*b);
}
}