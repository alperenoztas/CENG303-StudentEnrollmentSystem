package org.example;

import java.util.ArrayList;
import java.util.List;

public class Course {


    private String name;
    private String code;
    private Department department;
    private int creditHours;

    private int semester;
    private Lecturer lecturer;
    private List<String> meetingTimes;

    private List<Student> students;





    public Course(String name, String code, Department department, int creditHours, Lecturer lecturer) {
        this.name = name;
        this.code = code;
        this.department = department;
        this.creditHours = creditHours;
        this.lecturer = lecturer;
        this.meetingTimes = new ArrayList<String>();
    }

    public Course(String name, String code, Department department, int creditHours,int semester, Lecturer lecturer) {
        this.name = name;
        this.code = code;
        this.department = department;
        this.creditHours = creditHours;
        this.semester = semester;
        this.lecturer = lecturer;
        this.meetingTimes = new ArrayList<String>();
    }

    public Course(String code, Department department, int creditHours,int semester) {
        this.code = code;
        this.department = department;
        this.creditHours = creditHours;
        this.semester = semester;
    }

    public Course(String code,int creditHours,int semester) {
        this.code = code;
        this.creditHours = creditHours;
        this.semester = semester;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    public void addMeetingTime(String time) {
        meetingTimes.add(time);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public Department getDepartment() {
        return department;
    }

    public int getCreditHours() {
        return creditHours;
    }


    public List<Student> getStudents() {
        return students;
    }

    public List<String> getMeetingTimes() {
        return meetingTimes;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

}

