package controller;

import database.DbConnection;
import models.User;

public class UserController {
    DbConnection dbConnection;

    public int insertStudent(User student) {
        int id = student.getStd_id();
        String name = student.getStd_name();
        String address = student.getStd_address();
        int age = student.getStd_age();
        int contact = student.getStd_contacr();
        String insertQuery = String.format(
                "insert into tbl_student(std_id,std_name,std_age,std_address,std_contacr) values(%d,'%s',%d,'%s',%d)",
                id,
                name, age, address, contact);
        System.out.println(insertQuery);
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }

    public int updateStudent(User student) {
        int id = student.getStd_id();
        String name = student.getStd_name();
        String updateQuery = String.format(
                "update tbl_student set std_name='%s' where std_id = %d", name, id);
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }

}