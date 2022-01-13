package uoda_contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COVID19 {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s;
        s = br.readLine();
        int city = Integer.parseInt(s);
        int a, r, m, p;
        for(int i=0; i<city; i++)
        {
            int t1=0, t2=0, t3=0, t4=0, tp, td;
            s = br.readLine();
            String srr[] = s.split(" ");
            a = Integer.parseInt(srr[0]);
            r = Integer.parseInt(srr[1]);
            m = Integer.parseInt(srr[2]);
            p = Integer.parseInt(srr[3]);
            t1=a;
            t2=a*r;
            while(a<p)
            {
                t3=t1;
                t4=t2;
                t1=t1+t2;
                t2=t2*r;
                a=t1;
            }
            td=t3-m;
            tp=p-td;
            if(td<0)
                System.out.println((tp+td)+" 0");
            else
                System.out.println(tp+" "+td);
        }
    }
}
