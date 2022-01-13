package cricket;
import java.util.Scanner;
public abstract class Cricket {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter total Overs : ");
        int over = obj.nextInt();
        System.out.println("");
        obj.nextLine();
        int totalBall = 6*over;
        int run = 0;
        int six = 0;
        int four = 0;
        int free = 0;
        int wicket = 0;
        while(totalBall!=0)
        {
            System.out.print("Enter ball : ");
            String ball = obj.nextLine();
            if(ball.equals("0"))
            {   
                totalBall--;
            }
            else if(ball.equals("1"))
            {
                run++;
                totalBall--;
            }
            else if(ball.equals("2"))
            {
                totalBall--;
                run=run+2;
            }
            else if(ball.equals("4"))
            {
                System.out.println("Its a Four !");
                run=run+4;
                totalBall--;
            }
            else if(ball.equals("6"))
            {
                System.out.println("Its a SIX !");
                run=run+6;
                totalBall--;
            }
            else if(ball.equals("w"))
            {
                System.out.println("Wide Ball !");
                run++;
            }
            else if(ball.equals("o"))
            {
                System.out.println("OUT !!!");
                totalBall--;
                wicket++;
            }
            else if(ball.equals("n"))
            {
                System.out.println("No Ball !");
                run++;   
            }
            System.out.println("Ball : "+totalBall+"\nRun : "+run+"\nWicket : "+wicket);
            System.out.println("");
            System.out.println("-------------------------------------");
            System.out.println("");

        }
    }
}
