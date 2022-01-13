package URI_2139;
import java.util.Scanner;
public class Cristmas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        int d;
        int days=0;
        while(sc.hasNextInt())
        {
            m = sc.nextInt();
            d = sc.nextInt();
            if(m==12 && d==25)
                System.out.println("E natal!");
            else if(m==12 && d==24)
                System.out.println("E vespera de natal!");
            else if(m==12 && d>25)
                System.out.println("Ja passou!");
            else 
            {
                for(int i=12; i>=m; i--)
                {
                    if(i==12)
                        days+=31;
                    else if(i==11)
                        days+=30;
                    else if(i==10)
                        days+=31;
                    else if(i==9)
                        days+=30;
                    else if(i==8)
                        days+=31;
                    else if(i==7)
                        days+=31;
                    else if(i==6)
                        days+=30;
                    else if(i==5)
                        days+=31;
                    else if(i==4)
                        days+=30;
                    else if(i==3)
                        days+=31;
                    else if(i==2)
                        days+=29;
                    else if(i==1)
                        days+=31;
                }
                days = days - d - 6;
                System.out.println("Faltam "+days+" dias para o natal!");
                days=0;
            }
        }    
    }   
}