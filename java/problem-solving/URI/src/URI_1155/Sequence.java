package URI_1155;
public class Sequence {
    public static void main(String[] args) {
        double S = 1;
        for(double i=2; i<=100; i++)
        {
            S+=1/i;
        }
        System.out.println(String.format("%.2f",S));
    }
}
