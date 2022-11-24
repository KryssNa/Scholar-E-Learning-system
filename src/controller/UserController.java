package controller;

import java.sql.ResultSet;

import database.DbConnection;
import models.User;


public class UserController {
    DbConnection dbConnection;

    public ResultSet selectLogin(User user) {
        String email = user.getuserUsername();
        String pass = user.getuserPass();
        String selectQuery = "select * from new_user where user_email='" + email + "' and User_password ='" + pass + "'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }
    
    public int changestatus(User user){
        String email = user.getuserEmail();
        String updateQuery = "update new_user set user_status=true where email = '"+email+"'";
        dbConnection = new DbConnection();
        int result1 = dbConnection.manipulate(updateQuery);
        return result1 ;
    }
    
    public ResultSet selectUser(User user){
        String selectQuery = "select * from new_user where user_status=1";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }
}
