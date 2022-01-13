package method_overloading;
public class Sum extends Base
{
    void su(int a, float b)
    {
        System.out.println("INT x Float = "+(a*b));
    }
    void su (int a, int b)
    {
        System.out.println("INT x INT = "+(a*b));
    }
    void su(int a, double b)
    {
        System.out.println("Float x Float = "+(a*b));
    }
    void su(Double a, Double b)
    {
        System.out.println("Double x Double = "+(a*b));
    }
}