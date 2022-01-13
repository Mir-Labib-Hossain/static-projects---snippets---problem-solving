import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        double x =  1.6601;
        System.out.println("f(x)\t"+(double)(2*Math.pow(x,3)-2.5*x-5));
        System.out.println("f,(x)\t"+(double)(6*Math.pow(x,2)-2.5));
        System.out.println("x\t"+(double)(x-((double)(2*Math.pow(x,3)-2.5*x-5)/(double)(6*Math.pow(x,2)-2.5))));
    }
}