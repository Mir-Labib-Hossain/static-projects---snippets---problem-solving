package URI_2540;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Leaders {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=br.readLine()) != null)
        {
            int n = Integer.parseInt(s);
            s = br.readLine();
        
        int i,l=0;
        String arr[] = s.split(" ");
        
        for(i=0; i<n; i++)
        {
            if(arr[i].equals("1"))
                l++;
        }
        
        if( (((double)n/3) + (double)n/3) <= l)
            System.out.println("impeachment");
        else
            System.out.println("acusacao arquivada");
        l=0;
        }
    }
    
}
