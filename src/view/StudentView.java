
package view;

import controller.UserController;
import models.user;

public class StudentView {
    public static void main(String[] args) {
        user s1 = new user(2, "kryss", 20, "Chitwan", 364548);
        UserController sc = new UserController();
        int insertedStudent = sc.insertStudent(s1);

        if (insertedStudent > 0) {
            System.out.println("Student inserted");
        } else {
            System.out.println("Failed to insert student");
        }
    }
}
