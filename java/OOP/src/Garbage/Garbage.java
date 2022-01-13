package Garbage;
import java.util.Scanner;
public class Garbage extends Object{
    void method(){
        System.out.println("METHOD");
    }
    protected void finalize(){
        System.out.println("OBJECT GARBAGED");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Garbage obj = new Garbage();
        obj.method();
        obj = new Garbage();
        obj.method();
        System.gc();
    }
    
}
