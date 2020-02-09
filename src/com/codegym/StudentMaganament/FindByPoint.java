package com.codegym.StudentMaganament;

import com.codegym.Model.Student;

import java.util.ArrayList;

public class FindByPoint {
    public static void findByPoint(ArrayList<Student>list){
        System.out.println("Danh sach cac hoc vien co diem lon hon 85 la : ");
        System.out.printf("%-30s%-30s%-50s%-5s\n", "Id", "Ho ten", "Email", "Point");
        for (Student student : list){
            if (student.getPoint()> 85){
                student.display();
            }
        }
    }
}
