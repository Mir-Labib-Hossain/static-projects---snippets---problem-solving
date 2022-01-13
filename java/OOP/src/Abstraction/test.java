package Abstraction;

import Abstraction.rectangle;
import Abstraction.circle;
import Abstraction.Shape;
import java.util.Scanner;
public class test{
    public static void main(String[] args) {
        Scanner labib = new Scanner (System.in);
        System.out.println("Enter 1st Element :");
        double a = labib.nextDouble();
        System.out.println("Enter 2nd Element :");
        double b = labib.nextDouble();
        Shape[] s = new Shape[3];
        s[1] = new circle(a);
        s[2] = new rectangle(a,b);
        for(int i = 1; i<3; i++)
        {
            s[i].area();
        }
        
    }
}