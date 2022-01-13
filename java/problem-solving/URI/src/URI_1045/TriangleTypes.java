package URI_1045;
import java.util.Scanner;
public class TriangleTypes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        wap w = new wap();
        double A = s.nextDouble();
        double B = s.nextDouble();
        double C = s.nextDouble();
        if(A>0 && B>0 && C>0)
        {
        int f=0;
while(f==0)
{
        if(A<=B)
        {
        w.swap(A,B);
        A = w.x();
        B = w.y();
        }
        if(B<=C)
        {
        w.swap(B,C);
        B = w.x();
        C = w.y();    
        }
        if((A>=B && B>=C && A>=C))
        break;
    }
if(A>=(B+C))
{
    System.out.println("NAO FORMA TRIANGULO");
}
else
{
if(Math.pow(A, 2) == (Math.pow(B, 2) + Math.pow(C, 2)))
{
    System.out.println("TRIANGULO RETANGULO");
}
if(Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2))
{
    System.out.println("TRIANGULO OBTUSANGULO");
}
if(Math.pow(A, 2) < (Math.pow(B, 2) + Math.pow(C, 2)))
{
    System.out.println("TRIANGULO ACUTANGULO");
}
if(A==B && B==C)
{
    System.out.println("TRIANGULO EQUILATERO");
}
if((A==B && A!=C) || (A==C && C!=B) || (B==C && C!=A))
{
    System.out.println("TRIANGULO ISOSCELES");
}
}
    }   
    }
}
 class wap {
    double t=0;
    double A,B;
    void swap(double a, double b)
    {
        t=a;
        a=b;
        b=t;
        A=a;
        B=b;
    }
    double x()
    {
        return A;
    }
      double y()
    {
        return B;
    }
}
