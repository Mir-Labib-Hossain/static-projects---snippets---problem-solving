package Constructor;
public class Constructors {
String name;
int age;
char grade;
Constructors(String name, int age, char grade)
{
    this.name=name;
    this.age=age; 
    this.grade=grade;
}
void info()
{
    System.out.println("Students name is        "+name);
    System.out.println("Students age is         "+age);
    System.out.println("Students obtained Grade "+grade);
}
}