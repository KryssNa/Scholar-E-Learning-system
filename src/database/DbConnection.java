package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//package student.information.system;

public class DbConnection{

// public Connection conn;
//static reference to itself
    private static DbConnection instance = new DbConnection();    
    public static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    public static final String USER = "root";
    public static final String PASSWORD = "Slesh@#";
    public static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver"; 
     
    //private constructor
    public DbConnection() {
        try {
            Class.forName(DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
     
    private Connection createConnection() {
        Connection connection = null;
        try {                  
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to Database.");
//            JOptionPane.showMessageDialog(null, "Connected to database");
        } catch (SQLException e) {
            System.out.println("ERROR: Unable to Connect to Database."+e);
        }
        return connection;
    }   
     
    public static Connection getConnection() {
        return instance.createConnection();
    }
    public static void main(String[] args) {
        new DbConnection().getConnection();
    }

    public int manipulate(String insertQuery) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}