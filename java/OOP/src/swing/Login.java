package swing;
import java.awt.event.*;
import javax.swing.*;
public class Login implements ActionListener{
    JFrame jf = new JFrame("Log-In Pannel");
    JButton jb1 = new JButton("Log-in");
    JLabel jl1 = new JLabel("Password : ");
    JLabel jl2 = new JLabel("UserName : ");
    JLabel jl3 = new JLabel("-- No name loged-in --");
    JTextField jt1 = new JTextField();
    JPasswordField jp1 = new JPasswordField();
    Login(){
        jf.add(jb1);
        jf.add(jl1);
        jf.add(jl2);
        jf.add(jl3);
        jf.add(jt1);
        jf.add(jp1);
        jf.setSize(400,400);
        jl1.setBounds(40,20,90,30);
        jt1.setBounds(140,20,90,30);
        
        jl2.setBounds(40,60,90,30);
        jp1.setBounds(140,60,90,30);
        jb1.setBounds(90,100,90,30);
        jl3.setBounds(90,180,290,30);
        jb1.addActionListener(this);
        jf.setLayout(null);
        jf.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
            String name = jt1.getText();
            char[] pass = jp1.getPassword();
        if(e.getSource() == jb1)
            if(name.equals("_mir.labib_") && String.valueOf(pass).equals("123"))
                jl3.setText("Welcome Mir Labib Hossain");
            else
                jl3.setText("Username or Password entered Wrong !");
           
    };
    public static void main(String[] args) {
            new Login();
    }
    
}
