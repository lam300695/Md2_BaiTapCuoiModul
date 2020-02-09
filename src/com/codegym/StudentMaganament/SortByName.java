package com.codegym.StudentMaganament;

import com.codegym.Model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortByName {
    public static void sortByName(ArrayList<Student>list){
        Collections.sort(list, new Comparator<Student>() {

            @Override
            public int compare(Student student1, Student student2) {
                String [] arr1 = student1.getName().split(" ");
                String [] arr2 = student2.getName().split(" ");
                if (arr1[arr1.length - 1].compareTo(arr2[arr2.length - 1]) == 0) {
                    return student1.getName().compareTo(student2.getName());
                }
                return arr1[arr1.length - 1].compareTo(arr2[arr2.length - 1]);
            }
        });
        System.out.println("Danh sach cac hoc vien sap xep theo ho ten la :  ");
        System.out.printf("%-30s%-30s%-50s%-5s\n", "Id", "Ho ten", "Email", "Point");
        for (Student student : list){
            student.display();
        }
    }
}
