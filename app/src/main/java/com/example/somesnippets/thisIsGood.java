package com.example.somesnippets;

public class thisIsGood {

    String name;
    String rollno;
    String classes;
    String center;

    public thisIsGood(String name, String rollno, String classes, String center) {
        this.name = name;
        this.rollno = rollno;
        this.classes = classes;
        this.center = center;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }
}
