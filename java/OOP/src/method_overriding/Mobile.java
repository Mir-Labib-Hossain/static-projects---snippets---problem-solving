package method_overriding;
public class Mobile extends Laptop {
    int FrontCamera;
    int BackCamera;
void ShowInfo()
{
    System.out.println("\nMobile info :");
    System.out.println("Name        : "+Name);
    System.out.println("Core        : "+Core);
    System.out.println("Ram         : "+Ram);
    System.out.println("Front Camera: "+FrontCamera);
    System.out.println("Back Camera : "+BackCamera);
}
}
