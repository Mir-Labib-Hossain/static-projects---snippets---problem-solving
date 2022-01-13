package URI_1958;

import java.util.Scanner;

public class Scific {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        if((String.format("%1.4E",d)).indexOf("-")==0)
            System.out.println(String.format("%1.4E",d));
        else
            System.out.println(String.format("+%1.4E",d));
    }
}
//        int i;
//        boolean b = false;
//        String input = scanner.nextLine();
//        int l2 = input.length();
//        if (input.length() < 8) {
//            b = true;
//            for (i = input.length(); i < 8; i++) {
//                input += "0";
//            }
//        }
//        String arr[] = input.split("");
//        int len = arr.length;
//        String ans = "";
//        try {
//            if (arr[0].equals("0") && arr[1].equals(".") || arr[1].equals("0") && arr[2].equals(".")) {
//                int ol = 0;
//                for (i = 1; i < len; i++) {
//                    ol++;
//                    if (!arr[i].equals("0") && !arr[i].equals(".")) {
//                        break;
//                    }
//                }
//                int cl = 0;
//                if (arr[0].equals("-")) {
//                    ol -= 1;
//                    ans += "-";
//                    cl = 1;
//                } else {
//                    ans += "+";
//                }
//                cl = ol + cl;
//                switch (ol) {
//                    case 8:
//                    case 7:
//                        ans += "0.0000E+00";
//                        break;
//                    case 6:
//                        ans += arr[cl] + "." + arr[cl + 1] + "000E-05";
//                        break;
//                    case 5:
//                        ans += arr[cl] + "." + arr[cl + 1] + arr[cl + 2] + "00E-04";
//                        break;
//                    case 4:
//                        ans += arr[cl] + "." + arr[cl + 1] + arr[cl + 2] + arr[cl + 3] + "0E-03";
//                        break;
//                    case 3:
//                        ans += arr[cl] + "." + arr[cl + 1] + arr[cl + 2] + arr[cl + 3] + arr[cl + 4] + "E-02";
//                        break;
//                    case 2:
//                        ans += arr[cl] + "." + arr[cl + 1] + arr[cl + 2] + arr[cl + 3] + arr[cl + 4] + "E-01";
//                        break;
//                    default:
//                        break;
//                }
//            } else if (arr[1].equals(".") || arr[2].equals(".")) {
//                if (!arr[0].equals("0") || !arr[1].equals("0")) {
//                    if (arr[0].equals("-")) {
//                        if (Integer.parseInt(arr[7]) > 5) {
//                            arr[6] = Integer.toString(Integer.parseInt(arr[6]) + 1);
//                        }
//                        ans += "-" + arr[1] + "." + arr[3] + arr[4] + arr[5] + arr[6] + "E+00";
//                    } else {
//                        if (Integer.parseInt(arr[6]) > 5) {
//                            arr[5] = Integer.toString(Integer.parseInt(arr[5]) + 1);
//                        }
//                        ans += "+" + arr[0] + "." + arr[2] + arr[3] + arr[4] + arr[5] + "E+00";
//                    }
//                }
//            } else { //for non decimal numbers
//                if (b == true) {
//                    len = l2;
//                }
//                if (arr[0].equals("-")) {
//                    len -= 2;
//                    ans += "-" + arr[1] + "." + arr[2] + arr[3] + arr[4] + arr[5] + "E+";
//
//                } else {
//                    len -= 1;
//                    ans += "+" + arr[0] + "." + arr[1] + arr[2] + arr[3] + arr[4] + "E+";
//                }
//                if (len == 0) {
//                    ans += "00";
//                } else if (len < 10) {
//                    ans += "0" + len;
//                } else {
//                    ans += len;
//                }
//            }
//        } catch (Exception e) {
//            if (arr[0].equals("-")) {
//                ans = "-" + arr[0] + ".0000E+00";
//            } else {
//                if (!arr[0].equals("+")) {
//                    ans = "+" + arr[0] + ".0000E+00";
//                } else {
//                    ans = arr[0] + arr[1] + ".0000E+00";
//                }
//            }
//        }
//        System.out.println(ans);
//
//      
//    }
//}
