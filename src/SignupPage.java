import java.awt.*;
import javax.swing.*;



public class SignupPage {
    JFrame f;
    JPanel p;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1;
    
    public SignupPage(){
        f = new JFrame("Sign Up");
        p = new JPanel();
        f.getContentPane().setLayout(null);
        f.getContentPane().setBackground(Color.GREEN);
       // p.setBounds(0, 0, 600, 400);
        //p.setBackground(Color.red);
        l1 = new JLabel("Email");
        l1.setFont(new java.awt.Font("Tahoma", 0, 25));
        l1.setBounds(0, 10, 100, 30);
        
        t1 = new JTextField();
        t1.setBounds(220, 10, 100, 30);
        
        l2 = new JLabel("Password");
        l2.setFont(new java.awt.Font("Tahoma", 0, 25));
        l2.setBounds(0, 50, 120, 30);
        
        t2 = new JTextField();
        t2.setBounds(220, 50, 100, 30);
        
        l3 = new JLabel("Re-type Password");
        l3.setFont(new java.awt.Font("Tahoma", 0, 25));
        l3.setBounds(0, 90, 200, 30);
        
        t3 = new JTextField();
        t3.setFont(new java.awt.Font("Tahoma", 0, 25));
        t3.setBounds(220, 90, 100, 30);
        
        b1 = new JButton("SignUp");
        b1.setBounds(100, 150, 100, 30);
        
        f.add(p);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(b1);
        
        f.setSize(400,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(2);
    }
    
    
    public static void main(String[]args){
        new SignupPage();
    }
}
