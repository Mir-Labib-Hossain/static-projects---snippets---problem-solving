package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class Editor implements ActionListener {
      JMenuItem copy = new JMenuItem("Copy");
     JMenuItem paste = new JMenuItem("Paste");
       JMenuItem cut = new JMenuItem("Cut");
    JMenuItem select = new JMenuItem("Select all");
           JFrame jf = new JFrame("Editor");
        JMenuBar jmb = new JMenuBar();
          JMenu File = new JMenu("File");
          JMenu Edit = new JMenu("Edit");
        JMenu Option = new JMenu("Option");
       JTextArea jta = new JTextArea();
    Editor(){
    Edit.add(copy);
    Edit.addSeparator();
    Edit.add(paste);
    Edit.addSeparator();
    Edit.add(cut);
    Edit.addSeparator();
    Edit.add(select);
    jmb.add(Edit);
    jmb.add(Option);
    jmb.add(File);
    jf.add(jta);
    jf.setJMenuBar(jmb);
    copy.addActionListener(this);
    paste.addActionListener(this);
    select.addActionListener(this);
    cut.addActionListener(this);
    jta.setBounds(50,50,200,100);
    jf.setSize(500,500);
    jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    jf.setLayout(null);
    jf.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == copy)
            jta.copy();
        if(e.getSource() == paste)
            jta.paste();
        if(e.getSource() == cut)
            jta.cut();
        if(e.getSource() == select)
            jta.selectAll();
    }
    public static void main(String[] args) {
    new Editor();
    }
}