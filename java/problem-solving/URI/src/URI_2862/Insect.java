package URI_2862;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Insect {
   public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, test = Integer.parseInt(br.readLine());
        for(i=0; i<test; i++){
            if(Integer.parseInt(br.readLine())>8000){
                System.out.println("Mais de 8000!");
            }
            else{
                System.out.println("Inseto!");
            }
        }
   }     
}
