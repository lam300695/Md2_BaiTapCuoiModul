package com.codegym.StudentMaganament;

import com.codegym.Model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortByPoint {
    public static void sortByPoint(ArrayList<Student>list){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                if (student1.getPoint() > student2.getPoint()){
                    return -1;
                }
                else if (student1.getPoint()< student2.getPoint()){
                    return 1;
                }
                else {
                    return 0;
                }
            }
        });
        System.out.println("Danh sach cac hoc vien sap xep theo diem thi giam dan la :  ");
        System.out.printf("%-30s%-30s%-50s%-5s\n", "Id", "Ho ten", "Email", "Point");
        for (Student student : list){
            student.display();
        }
    }
}
