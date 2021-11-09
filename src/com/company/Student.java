package com.company;

public class Student extends University {
    String name;
    Faculty faculty;


    public Student(String name, Faculty faculty) {
        this.name = name;
        this.faculty = faculty;
        System.out.println(faculty.getName());
    }
}
