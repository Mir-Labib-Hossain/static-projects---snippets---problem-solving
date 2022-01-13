package URI_2486;

import java.util.Scanner;

public class CMais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans=0;
        int am;
        while(true)
        {
            int t = sc.nextInt();
                    sc.nextLine();
            if(t==0)
                break;
            for(int i=0; i<t; i++)
            {
                String s = sc.nextLine();
                String arr[] = s.split(" ");
                am = Integer.parseInt(arr[0]);
                s=arr[1];
                if(s.equals("suco"))
                    ans+=120*am;
                else if(s.equals("morango"))
                    ans+=85*am;
                else if(s.equals("mamao"))
                    ans+=85*am;
                else if(s.equals("goiaba"))
                    ans+=70*am;
                else if(s.equals("manga"))
                    ans+=56*am;
                else if(s.equals("laranja"))
                    ans+=50*am;
                else if(s.equals("brocolis"))
                    ans+=34*am;
            }
            if(ans>=110 && ans<=130)
                System.out.println(ans+" mg");
            else if(ans<110)
                System.out.println("Mais "+(110-ans)+" mg");
            else if(ans>130)
                System.out.println("Menos "+(ans-130)+" mg");
            ans=0;
        }
    }
}
