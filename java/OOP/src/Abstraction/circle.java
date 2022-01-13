package Abstraction;


import Abstraction.Shape;

class circle extends Shape {
    circle(double a)
    {
        super(a,a);
    }
    void area(){
        System.out.println("Area of Circle "+Math.PI*a*a);
    }
}