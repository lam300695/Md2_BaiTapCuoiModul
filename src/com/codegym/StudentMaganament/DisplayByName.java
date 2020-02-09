package com.codegym.StudentMaganament;

import com.codegym.Model.Student;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DisplayByName {
    public static void displayByName(ArrayList<Student>list){
        System.out.println("Nhung nguoi co ho Nguyen la : ");
        String regex = ".*N.*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        for (Student student : list){
            matcher = pattern.matcher(student.getName());
            if (matcher.matches()){
                student.display();
            }
        }
    }
}
