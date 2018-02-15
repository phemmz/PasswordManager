import java.sql.*;
import javax.swing.*;

public class sqlConnect {
    Connection conn=null;
    public static Connection ConnecrDb(){
    
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\MCOPHEMMZ\\Documents\\NetBeansProjects\\PasswordManager\\PasswordManager.sqlite");
//            JOptionPane.showMessageDialog(null, "Connection Established");
            return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        return null;
        }}
    
}
