package swing;
import java.awt.event.*;
import javax.swing.*;
public class Calculator implements ActionListener{
    JFrame jf;
    JLabel jl;
    JButton equal,plus, minus, divide, mul, one, two, three, four, five, six, seven, eight, nine, zero;
    JTextField jt1, jt2, jt3;
    Calculator(){
        jl = new JLabel("=");
        jf = new JFrame("Calculator");
       jt1 = new JTextField();
       jt2 = new JTextField();
       jt3 = new JTextField();
     equal = new JButton("=");
      plus = new JButton("+");
     minus = new JButton("-");
    divide = new JButton("/");
       mul = new JButton("x");
       one = new JButton("1");
       two = new JButton("2");
     three = new JButton("3");
      four = new JButton("4");
      five = new JButton("5");
       six = new JButton("6");
     seven = new JButton("7");
     eight = new JButton("8");
      nine = new JButton("9");
      zero = new JButton("0");
        
        jf.add(equal);
        jf.add(plus);
        jf.add(minus);
        jf.add(divide);
        jf.add(mul);
        jf.add(one);
        jf.add(two);
        jf.add(three);
        jf.add(four);
        jf.add(five);
        jf.add(six);
        jf.add(seven);
        jf.add(eight);
        jf.add(nine);
        jf.add(zero);
        jf.add(jt1);
        jf.add(jt2);
        jf.add(jt3);
        jf.add(jl);
        
       jt3.setEditable(false);
       
        jf.setSize(500,500);
       jt1.setBounds(10, 40, 90,30);
       jt2.setBounds(110, 40,90,30);
       jt3.setBounds(210, 40,90,30);
      zero.setBounds(10, 80, 90, 70);
      plus.setBounds(10, 160,90, 70);
     minus.setBounds(10, 240,90, 70);
    divide.setBounds(10, 320,104,40);
       mul.setBounds(124,320,104,40);
     equal.setBounds(238,320,104,40);
       one.setBounds(110, 80, 70,70);
       two.setBounds(190, 80, 70,70);
     three.setBounds(270, 80, 70,70);
      four.setBounds(110,160, 70,70);
      five.setBounds(190,160, 70,70);
       six.setBounds(270,160, 70,70);
     seven.setBounds(110,240, 70,70);
     eight.setBounds(190,240, 70,70);
      nine.setBounds(270,240, 70,70);
        
      zero.addActionListener(this);
     equal.addActionListener(this);
      plus.addActionListener(this);
     minus.addActionListener(this);
    divide.addActionListener(this);
       mul.addActionListener(this);
       one.addActionListener(this);
       two.addActionListener(this);
     three.addActionListener(this);
      four.addActionListener(this);
      five.addActionListener(this);
       six.addActionListener(this);
     seven.addActionListener(this);
     eight.addActionListener(this);
      nine.addActionListener(this);

        jf.setLayout(null);
        jf.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String s1 = jt1.getText();
        String s2 = jt2.getText();
        
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c=0;
//        if(e.getSource()== zero)
//            jt3.setText("0");
//        if(e.getSource()== one)
//            jt3.setText("1");
//        if(e.getSource()== two)
//            jt3.setText("2");
//        if(e.getSource()== three)
//            jt3.setText("3");
//        if(e.getSource()== four)
//            jt3.setText("4");
//        if(e.getSource()== five)
//            jt1.setText("5");
//        if(e.getSource()== six)
//            jt1.setText("6");
//        if(e.getSource()== seven)
//            jt1.setText("7");
//        if(e.getSource()== eight)
//            jt1.setText("8");
//        if(e.getSource()== nine)
//            jt1.setText("9");
        if(e.getSource()== plus)
            jt3.setText(String.valueOf(a+b));
        else if(e.getSource()== minus)
            jt3.setText(String.valueOf(a-b));
        else if(e.getSource()== divide)
            jt3.setText(String.valueOf(a/b));
        else if(e.getSource()== mul)
            jt3.setText(String.valueOf(a*b));
        
    }
    public static void main(String[] args) {
        new Calculator();
    }
    
}
