package Encapsulation;
public class Encapsulation {
    private int age;
    private String name;
    
    public void setinfo(int age, String name)
    {
        this.age=age;
        this.name=name;
    }
    String getname()
    {
        return name;
    }
    int getage()
    {
        return age;
    }
    void info(){
        System.out.println("Name is "+name+"" );
        System.out.println("Age : "+age+"");
    }
}
