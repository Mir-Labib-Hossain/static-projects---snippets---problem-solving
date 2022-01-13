package swing;


import javax.swing.JFrame;
import javax.swing.JProgressBar;
public class Loading extends JFrame{
    JFrame jf = new JFrame();
    JProgressBar jp = new JProgressBar(0,100);
        
          
Loading(){
    add(jp);
    
    jp.setValue(0);
    setSize(300,150);
    jp.setBounds(40,40,200,30);
     jp.setStringPainted(true);
    setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    setLayout(null);
    setVisible(true);
}
public void lit(){
    int i=0;
    while(i<200000)
    {
        jp.setValue(i);
        i++;
        try{
            Thread.sleep(200);
        }
        catch(Exception e){System.out.println(e);}        
    }
}
public static void main(String[] args) {
    Loading l = new Loading();
    l.lit();
    }
}