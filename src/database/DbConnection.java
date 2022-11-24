package database;

import javax.swing.*;

import java.sql.*;

public class DbConnection {

    public Connection connection;

    public Statement statement;

    ResultSet resultSet;

    int value;

    public static Connection connectdb() {

        try {
             

            final String username = "root";

            final String password = "Kryss@57977";

            Class.forName("com.mysql.cj.jdbc.Driver");

           Connection connection = DriverManager.getConnection(

                    "jdbc:mysql://localhost:3306/scholarDB", username, password);
           

            if (connection != null) {
                

                System.out.println("Connected to database --> scholarDB");
                return connection;

            } else {

                System.out.println("Error connecting to database");

            }
            


        } catch (Exception e) {

            e.printStackTrace();

        }
        return null;
        

    }

    // Via the use of sql query

    // insert, update and delete

    public int manipulate(String query) {

        try {

            value = statement.executeUpdate(query);

            connection.close();

        } catch (SQLIntegrityConstraintViolationException ex) {

            JOptionPane.showMessageDialog(null, "These details already exist!");

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return value;

    }

    public ResultSet retrieve(String query) {

        try {

            resultSet = statement.executeQuery(query);

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return resultSet;

    }

    public static void main(String[] args) {

        new DbConnection().connectdb();

    }

   }

