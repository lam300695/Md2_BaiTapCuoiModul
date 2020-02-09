package com.codegym.StudentMaganament;

import com.codegym.Model.Student;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteFile {
    public static void writeFile(ArrayList<Student>list){
        try {
            File f = new File("/home/lam/sapxepdiem.txt");
            FileWriter fw = new FileWriter(f);
            fw.write(String.valueOf(list));
            fw.close();
        } catch (IOException e) {
            System.out.println("Loi ghi file: " + e);
        }
    }
}
