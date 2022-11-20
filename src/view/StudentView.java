package view;

import controller.UserController;
import models.Student;

public class StudentView {
    public static void main(String[] args) {
        Student s1 = new Student(2, "kryss", 20, "Chitwan", 364548);
        UserController sc = new UserController();
        int insertedStudent = sc.insertStudent(s1);

        if (insertedStudent > 0) {
            System.out.println("Student inserted");
        } else {
            System.out.println("Failed to insert student");
        }
    }
}