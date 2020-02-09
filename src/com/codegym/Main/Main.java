package com.codegym.Main;

import com.codegym.Model.Student;
import com.codegym.StudentMaganament.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student>list = new ArrayList<>();
        ReadFile.read(list);
        System.out.println("------");
        DisplayStudent.displayStudent(list);
        System.out.println("------");
        FindByPoint.findByPoint(list);
        System.out.println("------");
        SortByPoint.sortByPoint(list);
        System.out.println("------");
        WriteFile.writeFile(list);
        System.out.println("------");
        SortByName.sortByName(list);
        System.out.println("------");
        DisplayByName.displayByName(list);
    }
}
