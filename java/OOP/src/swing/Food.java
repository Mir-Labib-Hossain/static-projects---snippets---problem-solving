package swing;

import java.awt.event.*;
import javax.swing.*;
public class Food extends JFrame implements ActionListener{
    JFrame jf = new JFrame();
    JButton jb = new JButton("Place the Order");
    JCheckBox jc1 = new JCheckBox("Pizza     : 35$");
    JCheckBox jc2 = new JCheckBox("Burgur    : 22$");
    JCheckBox jc3 = new JCheckBox("Wages     : 5$");
    JCheckBox jc4 = new JCheckBox("HotDog    : 18$");
    JCheckBox jc5 = new JCheckBox("PEPSE 1/4 : .80$ ");
    JCheckBox jc6 = new JCheckBox("Coffee    : 10$");
    JCheckBox jc7 = new JCheckBox("Water     : .2$");
    JLabel jl1 = new JLabel();
    Food (){
        jf.add(jb);
        jf.add(jc1);
        jf.add(jc2);
        jf.add(jc3);
        jf.add(jc4);
        jf.add(jc5);
        jf.add(jc6);
        jf.add(jc7);
        jf.setSize(500,500);
        jc1.setBounds(40,40,200,30);
        jc2.setBounds(40,80,200,30);
        jc3.setBounds(40,120,200,30);
        jc4.setBounds(40,160,200,30);
        jc5.setBounds(40,200,200,30);
        jc6.setBounds(40,240,200,30);
        jc7.setBounds(40,280,200,30);
        jb.setBounds(40,320,200,30);
        jb.addActionListener(this);
        jf.setLayout(null);
        jf.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String item="";
        double ans =0;
        if(jc1.isSelected())
        {
            ans+=35;
            item  = "Pizza\n";
        }
        if(jc2.isSelected())
        {
            ans+=22;
            item=item + "Burger\n";
        }
        if(jc3.isSelected())
        {
            ans+=5;
            item =item + "Wages\n";
        }
        if(jc4.isSelected())
        {
            ans+=18;
            item =item + "HotDog\n";
        }
        if(jc5.isSelected())
        {
            ans+=.80;
            item =item +  "PEPSE\n";
        }
        if(jc6.isSelected())
        {
            ans+=10;
            item =item +  "Coffee\n";
        }
        if(jc7.isSelected())
        {
            ans+=.2;
            item =item +  "Water\n";
        }
        item+="------------------\n";
        JOptionPane.showMessageDialog(this,item+"Total "+ans);
    }
public static void main(String[] args) {
    new Food();
    }
    
}
