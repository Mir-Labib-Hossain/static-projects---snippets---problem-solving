package URI_2748;
public class Output2 {
    public static void main(String[] args) {
        int i,j;
        for(i=0; i<7; i++)
        {
            for (j = 0; j < 39; j++) {
                if (i == 0 || i == 6) {
                    System.out.print("-");
                } else if (j == 0 || j == 38) {
                    System.out.print("|");
                } else if (i == 1) {
                    switch (j) {
                        case 9:
                            System.out.print("R");
                            break;
                        case 10:
                            System.out.print("o");
                            break;
                        case 11:
                            System.out.print("b");
                            break;
                        case 12:
                            System.out.print("e");
                            break;
                        case 13:
                            System.out.print("r");
                            break;
                        case 14:
                            System.out.print("t");
                            break;
                        case 15:
                            System.out.print("o");
                            break;
                        default:
                            System.out.print(" ");
                            break;
                    }
                } else if (i == 3) {
                    switch (j) {
                        case 9:
                            System.out.print("5");
                            break;
                        case 10:
                            System.out.print("7");
                            break;
                        case 11:
                            System.out.print("8");
                            break;
                        case 12:
                            System.out.print("6");
                            break;
                        default:
                            System.out.print(" ");
                            break;
                    }
                } else if (i == 5) {
                    switch (j) {
                        case 9:
                            System.out.print("U");
                            break;
                        case 10:
                            System.out.print("N");
                            break;
                        case 11:
                            System.out.print("I");
                            break;
                        case 12:
                            System.out.print("F");
                            break;
                        case 13:
                            System.out.print("E");
                            break;
                        case 14:
                            System.out.print("I");
                            break;
                        default:
                            System.out.print(" ");
                            break;
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
