package URI_1050;
import java.util.Scanner;
public class DDD {
public static void main(String[] args)    
{
    Scanner obj = new Scanner (System.in);
    int a = obj.nextInt();
    String des;
    if(a==61)
    {
        des = "Brasilia";
    }
    else if(a==71)
    {
        des="Salvador";
    }
    else if(a==11)
    {
        des="Sao Paulo";
    }
    else if(a==21)
    {
        des="Rio de Janeiro";
    }
    else if(a==32)
    {
        des="Juiz de Fora";
    }
    else if(a==19)
    {
        des="Campinas";
    }
    else if(a==27)
    {
        des="Vitoria";
    }
    else if(a==31)
    {
        des="Belo Horizonte";
    }
    else
    {
        des ="DDD nao cadastrado";
    }
    System.out.println(des);
}
}
