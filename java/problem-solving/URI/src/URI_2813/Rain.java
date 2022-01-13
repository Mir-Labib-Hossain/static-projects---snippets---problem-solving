package URI_2813;
//8
//chuva sol
//sol sol
//sol chuva
//sol sol
//chuva sol
//sol sol
//sol chuva
//sol sol
//1 0 ;)
//12
//sol chuva
//sol chuva
//sol chuva
//chuva sol
//chuva sol
//chuva sol
//sol chuva
//sol chuva
//sol chuva
//chuva sol
//chuva sol
//chuva sol
//0 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rain {

    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, h = 0, o = 0, hg = 0, og = 0, test = Integer.parseInt(br.readLine().trim());
        boolean bh = false, bo = false;
        for (i = 0; i < test; i++) {
            String s[] = br.readLine().split(" ");
            if (s[0].equals("sol") && s[1].equals("chuva")) {
                    if (og == 0) {
                        o++;
                        hg++;
                    } else {
                        og--;
                        hg++;
                    }
                bh = false;
                bo = true;
            } else if (s[0].equals("chuva") && s[1].equals("sol")) {
                 if (bh == false && bo == true) {
                    if (hg != 0) {
                        hg--;
                        og++;
                    }
                }else {
                    if (hg == 0) {
                        h++;
                        og++;
                    } else {
                        hg--;
                        og++;
                    }
                } 
                bh = true;
                bo = false;
            }  else if (s[0].equals("chuva") && s[1].equals("chuva")) {
                if (bh == false && bo == false) {
                    if (hg == 0) {
                        h++;
                        hg++;
                    } else {
                        hg--;
                        og++;
                    }
                } else if (bh == true && bo == false) {
                    if (hg == 0) {
                        h++;
                        hg++;
                    }
                } 
                bh = true;
                bo = true;
            }
        }
        System.out.println(h + " " + o);
    }
}
