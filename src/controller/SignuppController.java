package controller;

import database.DbConnection;
import models.User;


public class SignuppController {
    DbConnection dbConnection;
    

    public int insertuser(User user) {
        String uname = user.getuserUsername();
        String email = user.getuserEmail();
        String pass = user.getuserPass();
        String cpass = user.getuserCpass();
        String insertQuery ="insert into new_user(user_username,user_email,user_pass,user_cpass)"
                + "values('"+uname+"','"+email+"','"+pass+"','"+cpass+"')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }

//    public int insertStudent(Student student) {
//        int id = student.getStd_id();
//        String name = student.getStd_name();
//        String address = student.getStd_address();
//        int age = student.getStd_age();
//        int contact = student.getStd_contacr();
//        String insertQuery = String.format(
//                "insert into tbl_student(std_id,std_name,std_age,std_address,std_contacr) values(%d,'%s',%d,'%s',%d)",
//                id,
//                name, age, address, contact);
//        System.out.println(insertQuery);
//        dbConnection = new DbConnection();
//        int result = dbConnection.manipulate(insertQuery);
//        return result;
//    }
//
//    public int updateStudent(Student student) {
//        int id = student.getStd_id();
//        String name = student.getStd_name();
//        String updateQuery = String.format(
//                "update tbl_student set std_name='%s' where std_id = %d", name, id);
//        dbConnection = new DbConnection();
//        int result = dbConnection.manipulate(updateQuery);
//        return result;
//    }

}