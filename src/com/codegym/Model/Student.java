package com.codegym.Model;

public class Student {
    private String id;
    private String name;
    private String email;
    private int point;

    public Student() {
    }

    public Student(String id, String name, String email, int point) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.point = point;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void display(){
        System.out.printf("%-30s%-30s%-50s%-5s\n",id,name,email,point);
    }
}
