package com.codegym.StudentMaganament;

import com.codegym.Model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class DisplayStudent {
    public static void displayStudent(ArrayList<Student>list){
        String a = "CGMD001124";
        System.out.println("Hoc vien co id la : " + a);
        System.out.printf("%-30s%-30s%-50s%-5s\n", "Id", "Ho ten", "Email", "Point");
        for (Student student : list) {
            if (student.getId().equals(a)){
                student.display();
            }
        }
    }
}
