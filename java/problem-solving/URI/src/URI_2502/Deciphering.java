package URI_2502;
import java.util.Scanner;
public class Deciphering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt())
        {
            int c = sc.nextInt();
            int t = sc.nextInt();
            sc.nextLine();
            String c1 = sc.nextLine();
            c1 = c1.toLowerCase();
            char c1arr[] = c1.toCharArray();
            String c2 = sc.nextLine();
            c2 = c2.toLowerCase();
            char c2arr[] = c2.toCharArray();
            for(int i=0; i<t; i++)
            {
                String in = sc.nextLine();
                String s = in.toLowerCase();
                char sarr[] = s.toCharArray();
                for(int j=0; j<s.length(); j++)
                {
                    for(int k=0; k<c; k++)
                    {
                        if(c1.charAt(k)==s.charAt(j))
                        {
                            sarr[j]=c2arr[k];
                        }
                        else if(c2.charAt(k)==s.charAt(j))
                        {
                            sarr[j]=c1arr[k];
                        }
                    }
                }
                for(int j=0; j<in.length(); j++)
                {
                    if( (in.charAt(j)>='A') &&  ('Z'>=in.charAt(j)) )
                    {
                        sarr[j]=(char)(sarr[j]-32);
                    }
                }
                s = String.valueOf(sarr);
                System.out.println(s);
            }
            System.out.println("");
        }
    }
}
