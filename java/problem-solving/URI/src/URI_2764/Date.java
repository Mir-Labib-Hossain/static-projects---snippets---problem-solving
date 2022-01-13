package URI_2764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String date[] = br.readLine().split("/");
        System.out.println(date[1]+"/"+date[0]+"/"+date[2]);
        System.out.println(date[2]+"/"+date[1]+"/"+date[0]);
        System.out.println(date[0]+"-"+date[1]+"-"+date[2]);
    }
}
