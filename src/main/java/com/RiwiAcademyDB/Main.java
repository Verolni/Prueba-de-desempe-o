package com.RiwiAcademyDB;

import com.RiwiAcademyDB.Crontrollers.CourseController;
import com.RiwiAcademyDB.Crontrollers.StudentController;
import com.RiwiAcademyDB.Crontrollers.inscriptionController;
import com.RiwiAcademyDB.Crontrollers.ratingController;
import com.RiwiAcademyDB.persistences.crud.Entities.studentsEntity;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
    System.out.println("What entity do you want to interact with? \n" +
            "1. Student\n" +
            "2. Course \n" +
            "3. Inscription \n" +
            "4. Ratings \n"
            );

    int switchInput = Integer.parseInt(JOptionPane.showInputDialog("Insert number: "));
    switch (switchInput)
    {
        case 1:


            System.out.println("What do you want to do? \n" +
                    "1. Create \n" +
                    "2. Edit \n" +
                    "3. Delete \n" +
                    "4. Search ");

            int switchInput2 = Integer.parseInt(JOptionPane.showInputDialog("Insert number: "));
            String id; String name; String email; String password;
            StudentController studentController = new StudentController();
            switch (switchInput2) {
}             case 1:
                    id = JOptionPane.showInputDialog("Insert ID: ");
                    name = JOptionPane.showInputDialog("Insert Name: ");
                    email = JOptionPane.showInputDialog("Insert Email: ");
                    password = JOptionPane.showInputDialog("Insert Password: ");
                    studentsEntity student = new studentsEntity(id, name, email, password);
                    StudentController.create(student);
                    break;
                    case 2:
                    System.out.println(" What do you want to edit? \n" +
                            "1. ID \n" +
                            "2. Name \n" +
                            "3. Email \n" +
                            "4. Password \n");
                    int switchInput6 = Integer.parseInt(JOptionPane.showInputDialog("Insert number: "));

                    switch (switchInput6) {
                        case 1:
                            id = JOptionPane.showInputDialog("Insert ID: ");
                            student = new studentsEntity();
                            student.setId(id);
                            StudentController.edit(student);
                            break;
                        case 2:
                            name = JOptionPane.showInputDialog("Insert Name: ");
                            student.setId(name);
                            StudentController.edit(student);
                            break;
                        case 3:
                            email = JOptionPane.showInputDialog("Insert Email: ");
                            student.setId(email);
                            StudentController.edit(student);
                            break;


//                        case 4:
//                            password = JOptionPane.showInputDialog("Insert Password: ");
//                            student.setId(password);
//                            StudentController.edit(student);
//                            break;
//
//                    }
//
//                    break;
//
//
//        case 2: System.out.println("What do you want to do? \n" +
//                "1. Create \n" +
//                "2. Edit \n" +
//                "3. Delete \n" +
//                "4. Search ");
//
//            int switchInput3 = Integer.parseInt(JOptionPane.showInputDialog("Insert number: "));
//            studentController = new StudentController();
//            switch (switchInput3) {
//            }             case 1: id = JOptionPane.showInputDialog("Insert ID: ");
//                    studentsEntity student = new studentsEntity();
//                    student.setId(id);
//                    StudentController.create(student);
//                    break;
//                        case 2:
//                         name = JOptionPane.showInputDialog("Insert Name: ");
//                         student.setId(name);
//                         StudentController.edit(student);
//                         break;
//                        case 3:
//                        email = JOptionPane.showInputDialog("Insert Email: ");
//                        student.setId(email);
//                        StudentController.delete(student);
//                        break;
//                        case 4:
//                        password = JOptionPane.showInputDialog("Insert Password: ");
//                        student.setId(password);
//                        StudentController.search(student);
//                        break;
//
//
//    }
//
//                case 3:
//
//
//                        email = JOptionPane.showInputDialog("Insert Email: ");
//                        student.setId(email);
//                        StudentController.delete(student);
//
//
//                    break;
//                case 4:
//                    if(StudentController.search(id) != null){
//                        System.out.println(StudentController.search(id));
//                    } else {
//                        System.out.println("the student does not exist");
//                    }
//                    StudentController.search(id);
//                    break;
//            }
//
//
//            case 2:
//
//                System.out.println("What do you want to do? \n " +
//                        "1. Create \n" +
//                        "2. Edit \n" +
//                        "3. Delete \n" +
//                        "4. Search ");
//
//                int switchInput7 = Integer.parseInt(JOptionPane.showInputDialog("Insert number: "));
//
//                CourseController courseController = new CourseController();
//                String title = JOptionPane.showInputDialog("Insert Title: ");
//                switch (switchInput7) {
//                    case 1:
//
//                        courseController.create(title);
//                        break;
//                    case 2:
//                       courseController.edit(title);
//                        break;
//                    case 3:
//                        courseController.delete(String.valueOf(title));
//                        break;
//                    case 4:
//                        courseController.search(String.valueOf(title));
//                        if(courseController.search(String.valueOf(title)) != null){
//                            System.out.println(courseController.search(String.valueOf(title)));
//                        } else {
//                            System.out.println("the course does not exist");
//                        }
//                        break;
//
//                }
//
//            case 3:
//
//                int ID = Integer.parseInt(JOptionPane.showInputDialog("Insert ID: "));
//                System.out.println("What do you want to do? \n " +
//                        "1. Create \n" +
//                        "2. Edit \n" +
//                        "3. Delete \n" +
//                        "4. Search ");
//
//                int switchInput4 = Integer.parseInt(JOptionPane.showInputDialog("Insert number: "));
//
//                inscriptionController inscriptionController = new inscriptionController();
//                switch (switchInput4) {
//                    case 1:
//
//                        inscriptionController.create(ID);
//                        break;
//                    case 2:
//                        inscriptionController.edit(ID);
//                        break;
//                    case 3:
//                        inscriptionController.delete(String.valueOf(ID));
//                        break;
//                    case 4:
//                        inscriptionController.search(String.valueOf(ID));
//
//                        if(inscriptionController.search(String.valueOf(ID)) != null){
//                            System.out.println(inscriptionController.search(String.valueOf(ID)));
//                        } else {
//                            System.out.println("the course does not exist");
//                        }
//                        break;
//
//                }
//
//
//
//            case 4:
//
//
//
//                int id = Integer.parseInt(JOptionPane.showInputDialog("Insert ID: "));
//                System.out.println("What do you want to do? \n " +
//                        "1. Create \n" +
//                        "2. Edit \n" +
//                        "3. Delete \n" +
//                        "4. Search ");
//
//                int switchInput5 = Integer.parseInt(JOptionPane.showInputDialog("Insert number: "));
//
//                ratingController ratingController = new ratingController();
//                switch (switchInput5) {
//                    case 1:
//
//                        ratingController.create(id);
//                        break;
//                    case 2:
//                        ratingController.edit(id);
//                        break;
//                    case 3:
//                        ratingController.delete(String.valueOf(id));
//                        break;
//                    case 4:
//                        ratingController.search(String.valueOf(id));
//
//                        if(ratingController.search(String.valueOf(id)) != null){
//                            System.out.println(ratingController.search(String.valueOf(id)));
//                        } else {
//                            System.out.println("the course does not exist");
//                        }
//                        break;
//
              }
        }




    }
    }