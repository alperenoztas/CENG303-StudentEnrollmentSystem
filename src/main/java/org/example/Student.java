package org.example;

import java.util.List;
import java.util.ArrayList;

public class Student {
    private String name;
    private String id;
    private String department;
    private int semester;

    private List<Course> courses;
    private List<String> courseChoices;

    public Student(String name, String id, String department, int year) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.semester = semester;
        this.courseChoices = new ArrayList<String>();
    }

    public Student(String id, String department) {
        this.id = id;
        this.department = department;
        this.courses = new ArrayList<Course>();
    }





    public void addCourseChoice(String course) {
        courseChoices.add(course);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public int getSemester() {
        return semester;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<String> getCourseChoices() {
        return courseChoices;
    }
}

