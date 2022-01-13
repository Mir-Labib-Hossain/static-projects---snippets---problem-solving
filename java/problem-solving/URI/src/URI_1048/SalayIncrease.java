package URI_1048;
import java.util.Scanner;
public class SalayIncrease {
public static void main(String []args)
{
    Scanner obj = new Scanner (System.in);
    double salary = obj.nextDouble();
    double newSalary = 0;
    double increase = 0;
    int percentage = 0;
    if( 0 <= salary && salary <= 400 )
    {
        increase = salary*15/100;
        percentage = 15;
        newSalary = increase + salary;
    }
    else if( 400.01 <= salary && salary <= 800.00 )
    {
        increase = salary*12/100;
        percentage = 12;
        newSalary = increase + salary;
    }
     else  if( 800.01 <= salary && salary <= 1200.00 )
    {
        increase = salary*10/100;
        percentage = 10;
        newSalary = increase + salary;
    }
     else if( 1200.01 <= salary && salary <= 2000.00 )
    {
        increase = salary*7/100;
        percentage = 7;
        newSalary = increase + salary;
    }
      else if( 2000.01 <= salary )
    {
        increase = salary*4/100;
        percentage = 4;
        newSalary = increase + salary;
    }
    System.out.println("Novo salario: "+(String.format("%.2f", newSalary)));
    System.out.println("Reajuste ganho: "+(String.format("%.2f", increase)));
    System.out.println("Em percentual: "+percentage+" %");
}
}
