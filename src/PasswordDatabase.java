

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class PasswordDatabase {
    JFrame f;
    JPanel p1, p2;
    JMenu m1,m2;
    JMenuBar mb;
    JMenuItem mi;
    JLabel l1;
    JScrollPane sp;
    JTable jt;
    
    
    
    public PasswordDatabase(){
        f = new JFrame("Password Database");
        f.getContentPane().setLayout(null);
        f.getContentPane().setBackground(Color.magenta);
        
        sp = new JScrollPane();
        jt = new JTable();
        mb = new JMenuBar();
        m1 = new JMenu();
        m2 = new JMenu();

        
        
        m1.setText("File");
        mb.add(m1);

        m2.setText("Edit");
        mb.add(m2);
        
        p2 = new JPanel();
        p2.setBounds(30, 20, 270, 30);
        p2.setBackground(Color.PINK);
        
        l1 = new JLabel("Stored Passwords");
        l1.setFont(new java.awt.Font("Monotype Corsiva", 0, 40));
        l1.setBounds(30, 20, 270, 30);
        
        jt.setModel(new DefaultTableModel(
                new Object[][]{
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}                
                }, new String[]{"Username","Password","Website","URL"}
        ));
        
        sp.setViewportView(jt);
//        sp.setBounds(200, 700, 400, 300);
        jt.setBounds(200, 700, 400, 300);
        
        
        
        

        f.setVisible(true);
        f.setSize(800, 600);
        f.setJMenuBar(mb);
        f.setDefaultCloseOperation(2);
        f.add(l1);
        f.add(p2);
        f.add(jt);
        f.add(sp);
        
        
    }
    
    
    
    
    
    public static void main(String[]args){
        new PasswordDatabase();
    }
}

