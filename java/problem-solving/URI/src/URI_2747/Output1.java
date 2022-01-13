package URI_2747;

public class Output1 {
    public static void main(String[] args) {
        int i, j;
        for(i=0; i<7; i++)
        {
            for(j=0; j<39; j++)
            {
                 if(i==0 ||  i==6)
                    System.out.print("-");
                 else if(j==0 || j==38)
                    System.out.print("|");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
