package Encapsulation;
import java.util.Scanner ;
public class encap  {
public static void main(String []args){

Scanner labib = new Scanner (System.in);

System.out.println("Enter name :");
String name = labib.nextLine();

System.out.println("Enter age : ");
int age = labib.nextInt();

Encapsulation e = new Encapsulation();
        e.setinfo(age,name);
        e.info();
    }   
}