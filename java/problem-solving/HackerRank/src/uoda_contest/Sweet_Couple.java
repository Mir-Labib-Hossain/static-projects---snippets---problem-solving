package uoda_contest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sweet_Couple {
    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String ar[] = s.split(" ");
        int n = Integer.parseInt(ar[0]);
        
        
        s = br.readLine();
        String arr[] = s.split(" ");
        for(int i=0; i<n; i++)
        {
            if(arr[i].equals(ar[1]))
            {
                System.out.println(i+1);
                break;
            }
        }
    }
}