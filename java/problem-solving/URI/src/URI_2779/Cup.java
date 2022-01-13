package URI_2779;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cup {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, m, cupMissing, i, j;
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        int arr[] = new int[m];
        cupMissing = n;
        for(i=0; i<m; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
            for(j=0; j<i; j++){
                if(i!=j && arr[i]==arr[j])
                    arr[i]=0;
            }
            if(arr[i]!=0)
                cupMissing--;
        }
        System.out.println(cupMissing);
    }
}
