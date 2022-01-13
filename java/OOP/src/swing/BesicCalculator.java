package swing;
import javax.swing.JOptionPane;
public class BesicCalculator {
    public static void main(String[] args) {
        String firstNumber = JOptionPane.showInputDialog("Enter first number :");
        String secondNumber = JOptionPane.showInputDialog("Enter second number :");
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        
        int sum = number1 + number2;
        int sub = number1 + number2;
        int mul = number1 * number2;
        float div = number1 / number2;
        int remainder = number1 % number2;
        
        JOptionPane.showMessageDialog(null,"The sum is +"+sum,"Sum of two numbers",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"The subtraction is "+sub,"Subtraction of two numbers",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"The Multiplication is "+mul,"Multiplication of two numbers",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"The Division is "+div,"Division of two numbers",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"The Rmainder is "+remainder,"Remainder of two numbers",JOptionPane.PLAIN_MESSAGE);        
    }
}
