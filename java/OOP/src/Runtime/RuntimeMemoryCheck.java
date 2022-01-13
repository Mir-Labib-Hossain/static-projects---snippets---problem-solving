package Runtime;

public class RuntimeMemoryCheck {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println("Total Memory : "+r.totalMemory());
        System.out.println("Free Memory  : "+r.freeMemory());
        System.gc();
        int j=100;
        System.out.println("Free Memory  : "+r.freeMemory());
        

        System.gc();
        System.out.println("Free Memory  : "+r.freeMemory());
    }
    
}
