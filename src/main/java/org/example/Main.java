package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        University university = new University("Ankara Yildirim Beyazit University");
        Department computerEngineering = new Department("Computer Engineering", "CSE");
        Department electronicEngineering = new Department("Electronic Engineering", "EE");
        university.addDepartment(computerEngineering);
        university.addDepartment(electronicEngineering);

        Random rand = new Random();


        for (int i = 1; i <= 30; i++) {
            String courseCode = "CENG" + String.format("%03d", i);
            int creditHours = rand.nextInt(3) + 3;
            String lecturerId = "CENG-Lecturer" + String.format("%03d", i);
            Lecturer lecturer = new Lecturer("Fadi Yilmaz", lecturerId);
            Course course = new Course(courseCode, "Computer Engineering", creditHours,(i%8)+1);
            course.setLecturer(lecturer);
            computerEngineering.addCourse(course);
        }


        for (int i = 1; i <= 30; i++) {
            String courseCode = "EEE" + String.format("%03d", i);
            int creditHours = rand.nextInt(3) + 3;
            String lecturerId = "EEE-Lecturer" + String.format("%03d", i);
            Lecturer lecturer = new Lecturer("Ahmet Karaaslan", lecturerId);
            Course course = new Course(courseCode, "Electronic Engineering", creditHours,(i%8)+1);
            course.setLecturer(lecturer);
            electronicEngineering.addCourse(course);
        }

        for (int i = 1; i <= 200; i++) {
            String studentId = "CSE-" + String.format("%03d", i);
            Student student = new Student(studentId, "Computer Engineering");
            computerEngineering.addStudent(student);
        }

        for (int i = 1; i <= 200; i++) {
            String studentId = "EEE-" + String.format("%03d", i);
            Student student = new Student(studentId, "Electric and Electronic Engineering");
            electronicEngineering.addStudent(student);
        }

        List<Classroom> classrooms = new ArrayList<Classroom>();

        for (int i = 1; i <= 15; i++) {
            Classroom classroom = new Classroom(i, 50);
            classrooms.add(classroom);
        }


        for (Department department : university.getDepartments()) {
            System.out.println("Department: " + department.getName());
            System.out.println("Courses:");
            for (Course course : department.getCourses()) {
                System.out.println("\t" + course.getCode() + "\t" + course.getCreditHours() +  "\t" + course.getSemester() + "\t" + course.getLecturer().getName());
            }
        }
    }
}
