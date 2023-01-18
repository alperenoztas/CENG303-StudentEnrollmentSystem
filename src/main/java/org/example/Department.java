package org.example;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private String code;
    private List<Course> courses;

    private List<String> lecturers;
    private List<Student> students;



    public Department(String name, String code) {
        this.name = name;
        this.code = code;
        this.courses = new ArrayList<Course>();
        this.students = new ArrayList<Student>();
    }


    public void addCourse(Course course) {
        courses.add(course);
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<String> getLecturers() {
        return lecturers;
    }

    public void setLecturers(List<String> lecturers) {
        this.lecturers = lecturers;
    }
    public void addStudent(Student student) {
        students.add(student);
    }

}

