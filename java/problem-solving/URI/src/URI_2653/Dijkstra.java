package URI_2653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Dijkstra {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n, i, c = 0;
        String temp;
        String s;
        ArrayList<String> list = new ArrayList<>();
        while (in.ready()) {
            s = in.readLine();
            list.add(s);
        }
        n = list.size();
        for (i = 0; i < n; i++) {
            temp = list.get(i);
            list.set(i, "");
            if (!list.contains(temp)) {
                c++;
            }
        }
        System.out.println(c);
    }
}
