package URI_2949;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ring {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, test = Integer.parseInt(br.readLine());
        int hob = 0, hum = 0, elf = 0, ana = 0, mag = 0;
        for (i = 0; i < test; i++) {
            String s[] = br.readLine().split(" ");
            switch (s[1]) {
                case "X":
                    hob++;
                    break;
                case "H":
                    hum++;
                    break;
                case "E":
                    elf++;
                    break;
                case "A":
                    ana++;
                    break;
                case "M":
                    mag++;
                    break;
            }
        }
        System.out.println(hob + " Hobbit(s)");
        System.out.println(hum + " Humano(s)");
        System.out.println(elf + " Elfo(s)");
        System.out.println(ana + " Anao(s)");
        System.out.println(mag + " Mago(s)");
    }
}
