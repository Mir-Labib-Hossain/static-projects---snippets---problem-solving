package URI_3065;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Calculando {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        int i = 1,test;
        String s;
        while (true) {
            test = Integer.parseInt(br.readLine());
            if(test ==0)
                break;
            s = br.readLine();
            System.out.printf("Teste %d\n", i++);
            System.out.printf("%d\n\n", engine.eval(s));
        }
    }
}