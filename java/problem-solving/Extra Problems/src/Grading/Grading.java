package Grading;
import java.util.Scanner;
public class Grading {
    static double cgpa(double a)
    {
        if(a>=80 && a<=100)
            return 4.00;
        else if(a>=70 && a<80)
            return 3.50;
        else if(a>=60 && a<70)
            return 3.00;
        else if(a>=50 && a<60)
            return 2.80;
        else if(a>=40 && a<50)
            return 2.50;
        else if(a>=30 && a<40)
            return 2.00;
        else 
            return 0.00;
    }
    public String grade(double a)
    {
        if(a>=80 && a<=100)
            return "A+";
        else if(a>=70 && a<80)
            return "A";
        else if(a>=60 && a<70)
            return "A-";
        else if(a>=50 && a<60)
            return "B";
        else if(a>=40 && a<50)
            return "C";
        else if(a>=30 && a<40)
            return "D";
        else 
            return "F";
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Grading gr = new Grading();
        System.out.println("Enter the marks of Subjects : ");
        System.out.print("Math : ");
        double m = obj.nextDouble();
        System.out.print("Physics : ");
        double p = obj.nextDouble();
        System.out.print("BBA : ");
        double b = obj.nextDouble();
        System.out.println("--------------------------------------------------------");
        System.out.println("Subject\t\tGrade\t\tGrade Point");
        System.out.println("Math   \t\t"+gr.grade(m)+"\t\t"+gr.cgpa(m));
        System.out.println("Physics\t\t"+gr.grade(p)+"\t\t"+gr.cgpa(p));
        System.out.println("BBA    \t\t"+gr.grade(b)+"\t\t"+gr.cgpa(b));
        System.out.println("--------------------------------------------------------");
    }
    
}
