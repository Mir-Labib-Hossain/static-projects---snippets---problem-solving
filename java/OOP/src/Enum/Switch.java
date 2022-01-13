package Enum;

public class Switch {
 enum num{ one(1), two(2), three(3),four(4),five(5),six(6),seven(7),eight(8),nine(9);
    int a;
    num(int b)
    {
        a=b;
    }
}
    public static void main(String[] args) {
        
    for(num n : num.values())
    {
        int y = n.ordinal();
            switch(y)
            {
                case 0:
                    System.out.println("zerooo");
                case 1:
                    System.out.println(n);
                    break;
                    case 2:
                    System.out.println(n);
                    break;
                    case 3:
                    System.out.println(n);
                    break;
                    case 4:
                    System.out.println(n);
                    break;
                    default:
                        System.out.println("sorry");
                        break;
            }
        }
    }    
}
