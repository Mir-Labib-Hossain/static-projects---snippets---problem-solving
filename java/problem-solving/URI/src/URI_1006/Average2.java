package URI_1006;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double a = Double.parseDouble(br.readLine());
        Double b = Double.parseDouble(br.readLine());
        Double c = Double.parseDouble(br.readLine());
        System.out.printf("MEDIA = %.1f\n", (((a * 2) + (b * 3) + (c * 5)) / 10));
    }
}
