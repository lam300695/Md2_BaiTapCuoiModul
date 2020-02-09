package com.codegym.StudentMaganament;

import com.codegym.Model.Student;

import java.io.*;
import java.util.ArrayList;

public class ReadFile {
    public static void read(ArrayList<Student>list) {
        try {
            File f = new File("/home/lam/student.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String [] word = line.split(";");
                Student student = new Student(word[0],word[1],word[2],Integer.parseInt(word[3]));
                list.add(student);
//                System.out.println(line);
            }
            System.out.printf("%-30s%-30s%-50s%-5s\n", "Id", "Ho ten", "Email", "Point");
            for (Student student : list) {
                student.display();
            }
            fr.close();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Loi doc file: "+e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
