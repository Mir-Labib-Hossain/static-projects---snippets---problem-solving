package math.methods;
public class MathMethods {
    public static void main(String[] args) {
        int a= 2;
        int b=4;
        double c=-9.9392837;
        System.out.println("Max number is = "+Math.max(a,b));
        System.out.println("Min number is = "+Math.min(a,b));
        System.out.println("Sqet of b = "+Math.sqrt(b));
        System.out.println("Logarithm of a = "+Math.log(a));
        System.out.println("Round fig of c is = "+Math.round(c));
        System.out.println(a+" is cube of = "+Math.cbrt(8));
        System.out.println("Next number from "+a+" to "+b+" = "+Math.nextAfter(a,b));
        System.out.println("Next number of "+a+" = "+Math.nextUp(a));
        System.out.println("Random number = "+Math.random());
    }
}
