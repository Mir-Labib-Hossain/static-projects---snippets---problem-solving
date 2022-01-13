package URI_1049;
import java.util.Scanner;
public class Animal {
public static void main(String []args)
{
    Scanner obj = new Scanner(System.in);
    String a = obj.nextLine();
    String b = obj.nextLine();
    String c = obj.nextLine();
    String animal="l";
    if(a.equals("vertebrado"))
    {
        if(b.equals("ave"))
        {
           if(c.equals("carnivoro"))
           {
               animal ="aguia";
           }
           else if(c.equals("onivoro"))
           {
               animal="pomba";
           }
        }
        else if(b.equals("mamifero"))
        {
            if(c.equals("onivoro"))
           {
               animal ="homem";
           }
           else if(c.equals("herbivoro"))
           {
               animal="vaca";
           }
        }
    }
    else if(a.equals("invertebrado"))
    {
       if(b.equals("inseto"))
        {
           if(c.equals("hematofago"))
           {
               animal ="pulga";
           }
           else if(c.equals("herbivoro"))
           {
               animal="lagarta";
           }
        }
        else if(b.equals("anelideo"))
        {
            if(c.equals("hematofago"))
           {
               animal ="sanguessuga";
           }
           else if(c.equals("onivoro"))
           {
               animal="minhoca";
           }
        }
    }
    System.out.println(animal);
}
}
