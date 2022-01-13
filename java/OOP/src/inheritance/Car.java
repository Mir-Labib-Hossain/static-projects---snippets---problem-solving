package inheritance;
public class Car extends Info{

 private String name ="Ford";
    private int year = 1999;
    
    public void setinfo(String name , int year)
    {
        this.name=name;
        this.year=year; 
    }
    public String getname()
    {
        return name;
    }
    public int getyear()
    {
        return year;
    }
    void info()
    {   
        System.out.println("Name ="+name);
        System.out.println("Year ="+year);
    }
}