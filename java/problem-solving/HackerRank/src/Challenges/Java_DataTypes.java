package Challenges;

import java.util.Scanner;

public class Java_DataTypes {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int f=0;

        for(int i=0; i<n; i++)
        {
            String s = sc.next();
            try{
                long l = Long.parseLong(s);
            }
            catch(Exception e)
            {
                System.out.println(s+" can't be fitted anywhere.");
                f=1;
            }
            if(f==0)
            {
                System.out.println(s+" can be fitted in:");
                try{
                    if(Byte.parseByte(s)>=Byte.MIN_VALUE && Byte.parseByte(s)<=Byte.MAX_VALUE)
                        System.out.println("* byte");
                }catch(Exception e){}

                try{
                    if(Short.parseShort(s)>=Short.MIN_VALUE && Short.parseShort(s)<=Short.MAX_VALUE)
                        System.out.println("* short");
                }catch(Exception e){}

                try{
                if(Integer.parseInt(s)>=Integer.MIN_VALUE && Integer.parseInt(s)<=Integer.MAX_VALUE)
                    System.out.println("* int");
                }catch(Exception e){}

                try{
                if(Long.parseLong(s)>=Long.MIN_VALUE && Long.parseLong(s)<=Long.MAX_VALUE)
                    System.out.println("* long");
                }catch(Exception e){}
            }
            f=0;
        }
    }
}
