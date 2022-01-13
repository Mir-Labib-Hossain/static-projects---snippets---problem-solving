package square.box;
public class SquareBox {
    public static void main(String[] args) {
        double size = 10;
        String str1 = "*";
        String str2 = "*";
        
        for(int i = 0; i < size; i++){
            str1+=" *";
            if(i == size - 1)
                str2 += " *";
            else
                str2 += "  ";
        }
        for(int i = 0; i < size; i++){
            if(i == 0 || i == size - 1)
                System.out.println(str1);
            else
                System.out.println(str2);
        }
    }
}
