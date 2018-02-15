import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class PasswordManager implements ActionListener {
    
   JLabel l1,l2,l3,l4,l5,l6,l7, imgL1,imgL2;
   JButton b1,b2,b3;
   JTextField t1,t2,t3,t4,t5,t6;
   JFrame f;
   JPanel p1;
   ImageIcon img1,img2;
   
   public PasswordManager(){
       f = new JFrame("Password Manager");
       f.getContentPane().setLayout(null);
       f.getContentPane().setBackground(Color.cyan);
      
       p1 = new JPanel();
       p1.setBounds(0, 5, 400, 50);
       p1.setBackground(new java.awt.Color(255, 102, 102));
       l1= new JLabel("Generate Password");
       l1.setFont(new java.awt.Font("Tahoma", 0, 45));
       l1.setBounds(0, 5, 400, 50);
       l1.setForeground(Color.GREEN);
       
       l2= new JLabel("Firstname");
       l2.setFont(new java.awt.Font("Tahoma", 0, 25));
       l2.setBounds(0,70,150,30);
       t1= new JTextField();
       t1.setBounds(200, 70, 150, 30);
       
       l3 = new JLabel("Lastname");
       l3.setFont(new java.awt.Font("Tahoma", 0, 25));
       l3.setBounds(0, 130, 150, 30);
       t2= new JTextField();
       t2.setBounds(200, 130, 150, 30);
       
       l4 = new JLabel("Year of Birth");
       l4.setFont(new java.awt.Font("Tahoma", 0, 25));
       l4.setBounds(0, 190, 150, 30);
       t3= new JTextField();
       t3.setBounds(200, 190, 150, 30);
       
       l5 = new JLabel("Pet Name");
       l5.setFont(new Font("Tahoma", 0, 25));
       l5.setBounds(0, 250, 150, 30);
       t4 = new JTextField();
       t4.setBounds(200, 250, 150, 30);
       
       b1 = new JButton("Generate");
       b1.setFont(new Font("Tahoma", 0, 15));
       b1.setBackground(Color.yellow);
       b1.setForeground(Color.green);
       b1.setBounds(150, 310, 100, 50);
       b1.addActionListener(this);
       
       l6 = new JLabel("Username");
       l6.setBounds(500, 300, 150, 30);
       l6.setFont(new Font("Monotype Corsiva", 0, 25));
       l6.setForeground(Color.red);
       t5 = new JTextField();
       t5.setBounds(650, 300, 150, 30);
       
       l7 = new JLabel("Password");
       l7.setBounds(500, 350, 150, 30);
       l7.setFont(new Font("Monotype Corsiva", 0, 25));
       l7.setForeground(Color.red);
       t6 = new JTextField();
       t6.setBounds(650, 350, 150, 30);
       
       img1 = new ImageIcon("C:\\Users\\MCOPHEMMZ\\Desktop\\Pm2.png");
       imgL1 = new JLabel(img1);
       imgL1.setBounds(600, 0, 300, 250);
       
       img2 = new ImageIcon("C:\\Users\\MCOPHEMMZ\\Desktop\\Pm2.png");
       imgL2 = new JLabel(img2);
       imgL2.setBounds(0, 300, 300, 250);
       
       
       String ca = "<html>Create</br> Account</html>";
       b2 = new JButton(ca);
       b2.setBounds(500, 400, 100, 50);
       b2.addActionListener(this);
       
       b3 = new JButton("Login");
       b3.setBounds(650, 400, 100, 50);
       
       
       
       f.add(l1);    
       f.add(p1);  
       f.add(l2);
       f.add(t1);
       f.add(l3);
       f.add(t2);
       f.add(l4);
       f.add(t3);
       f.add(l5);
       f.add(t4);
       f.add(b1);
       f.add(l6);
       f.add(l7);
       f.add(t5);
       f.add(t6);
       f.add(imgL1);
       f.add(imgL2);
       f.add(b2);
       f.add(b3);

      //f.pack();
       f.setSize(1000,600);
       f.setVisible(true);
       f.setDefaultCloseOperation(2);
   }
   
   public void actionPerformed(ActionEvent e){
       try{
           if(e.getSource()==b1){
       
       
       if(t1.getText().length()!=0 && t2.getText().length()!=0 && t3.getText().length()!=0){
//           if(t1.getText().equals(""))
//             JOptionPane.showMessageDialog(null, "Invalid Name");
           if(t1.getText().length()<3)
                JOptionPane.showMessageDialog(null, "Firstname must be upto 3 characters");
           if(t2.getText().length()<6)
               JOptionPane.showMessageDialog(null, "Lastname must be upto 6 characters");
           if(t3.getText().length()<4)
               JOptionPane.showMessageDialog(null, "Year Format: YYYY");
           else {
           char p1 = t1.getText().toUpperCase().charAt(0);
           char p2 = t1.getText().charAt(1);
           char p3 = t1.getText().charAt(2);
           char p4 = t2.getText().toUpperCase().charAt(3);
           char p5 = t2.getText().charAt(4);
           char p6 = t2.getText().charAt(5);
           char p7 = t3.getText().charAt(0);
           char p8 = t3.getText().charAt(1);
           char p9 = t3.getText().charAt(2);
           char p0 = t3.getText().charAt(3);
           
           char[]pass = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p0};
           
           String password= new String(pass);
           Random m = new Random();
           char[]charps= {'!','@','#','$','%','^','&','*','(',')','-','_',':','{','.'};
           
           int fname = t1.getText().length();
           int lname = t2.getText().length();
           int yob = t3.getText().length();
           int petn = t4.getText().length();
           int charpsw = charps.length;
           
           int randFname = m.nextInt(fname);
           int randFname1 = m.nextInt(fname);
           int randFname2 = m.nextInt(fname);
           int randLname = m.nextInt(lname);
           int randLname1 = m.nextInt(lname);
           int randLname2 = m.nextInt(lname);
           int randYob = m.nextInt(yob);
           int randYob1 = m.nextInt(yob);
           int randYob2 = m.nextInt(yob);
           int randYob3 = m.nextInt(yob);
           int randPetn = m.nextInt(petn);
           int randPetn2 = m.nextInt(petn);
           int randCpsw = m.nextInt(charpsw);
           int randCpsw2 = m.nextInt(charpsw);
           
           
           
           
           
           
           
           JOptionPane.showMessageDialog(null, "<html>Suggested passwords are "+t1.getText().toUpperCase().charAt(randFname)+
                   ""+t1.getText().charAt(randFname1)+""+t2.getText().toUpperCase().charAt(randLname)+""+
                   t2.getText().charAt(randLname1)+""+t3.getText().charAt(randYob)+""+t3.getText().charAt(randYob1)+""+charps[randCpsw2]+""+
                   t3.getText().charAt(randYob2)+""+t3.getText().charAt(randYob3)+", "+password);
           
           }
       }
       
       
       else{
       JOptionPane.showMessageDialog(null, "Some fields are empty");
       }
       
       
       }
           if(e.getSource()==b2){
       SignupPage sp = new SignupPage();
       sp.f.setVisible(true);
       
       }
       
       
       }
       catch(Exception e1){
           JOptionPane.showMessageDialog(null, e);
       }
       
       
   }
    
   public static void main(String[]args){
    PasswordManager pm= new PasswordManager();
   }
    
    
}
