package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String name;
    private String id;
    private Department department;
    private int grade;

    private List<Course> courses;
    private List<Course> courseChoices;

    public Student(String name, String id, Department department, int grade) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.grade = grade;
        this.courseChoices = new ArrayList<Course>();
    }



    public Student(String id, Department department) {
        this.id = id;
        this.department = department;
        this.courses = new ArrayList<Course>();
        this.courseChoices = new ArrayList<Course>();
    }



    public void selectCourses() {
        Scanner scanner = new Scanner(System.in);
        // get available courses from the student's department
        List<Course> availableCourses = this.department.getCourses();
        // ask the student to choose courses
        System.out.println("Please choose up to 6 courses from your department:");
        for (int i = 1; i <= 6; i++) {
            System.out.println("Enter course code " + i + " (Enter 'exit' to stop selecting courses):");
            String courseCode = scanner.nextLine();
            if(courseCode.equalsIgnoreCase("exit")){
                break;
            }
            Course selectedCourse = null;
            // check if the entered course code is valid
            for (Course course : availableCourses) {
                if (course.getCode().equals(courseCode)) {
                    selectedCourse = course;
                    break;
                }
            }
            if (selectedCourse == null) {
                System.out.println("Invalid course code, please enter a valid code.");
            } else {
                if (selectedCourse.getSemester() == this.grade + 2 || selectedCourse.getSemester() == this.grade - 2) {
                    addCourseChoice(selectedCourse);
                    System.out.println("Course added: " + selectedCourse.getName());
                } else {
                    System.out.println("This course is not within the grade level constraint.");
                }
            }
        }
    }

    public void addCourseChoice(Course course) {
        courseChoices.add(course);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }

    public Department getDepartment() {
        return department;
    }



    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public List<Course> getCourses() {
        return courses;
    }

    public List<Course> getCourseChoices() {
        return courseChoices;
    }
}

