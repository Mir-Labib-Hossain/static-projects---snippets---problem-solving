package inheritance;
public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        Info i = new Info();
        Color o = new Color();
        System.out.println(o instanceof Car);
        c.info();
        System.out.println("");
        System.out.println("");
        i.info();
    }
    
}
