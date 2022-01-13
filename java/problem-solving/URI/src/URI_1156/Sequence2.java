package URI_1156;
public class Sequence2 {
    public static void main(String[] args) {
        double S = 1;
        double count =2;
        for(long i=3; i<=39; i+=2)
        {
            S+=i/count;
            count=count*2;
        }
        System.out.println(String.format("%.2f",S));
    } 
}
