package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Besic {
    public static void main(String[] args) {
            
            JFrame frame = new JFrame("Name");
            
            JButton button = new JButton("Submit");
            button.setBounds(100,100,140,40);
            
            JLabel label = new JLabel();
            label.setText("Enter Name :");
            label.setBounds(10,10,100,100);
            
            JTextField textfield = new JTextField();
            textfield.setBounds(110,50,130,30);
            
            frame.add(textfield);
            frame.add(label);
            frame.add(button);
            frame.setSize(300,400);
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
