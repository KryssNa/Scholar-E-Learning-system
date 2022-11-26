package controller;

import database.DbConnection;
import models.User;
import java.sql.*;
import javax.swing.JOptionPane;
import view.virtualclass2;


public class UserController {
    DbConnection db=new DbConnection();
    
    Connection conn = db.getconnection();
    ResultSet rs;

    public int testUser(User newuser) {
              
        String username =newuser.getUsername();
        String password = newuser.getPassword();
        User lv=new User(username,password);
        try {
                
                Connection conn=db.getconnection();
                String query = "Select * from new_user where user_username='"+username+"' and user_pass='"+password+"' ";
                
                Statement smt = conn.createStatement();
                rs = smt.executeQuery(query);
                
            if(rs.next()){

                JOptionPane.showMessageDialog(null, "Meeting joined successfully","Success",
                            JOptionPane.INFORMATION_MESSAGE);
                new virtualclass2().setVisible(true);
                
            }else{
                JOptionPane.showMessageDialog(null, "Incorrecct Username or password. Try again","Failed!!",
                            JOptionPane.ERROR_MESSAGE);
                
            }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
                System.out.println(e);
                
                
            }
        return 0;
        
        
        
    }
}