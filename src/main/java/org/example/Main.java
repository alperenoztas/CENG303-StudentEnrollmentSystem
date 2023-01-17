package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        University university = new University("Ankara Yildirim Beyazit University");
        Department computerEngineering = new Department("Computer Engineering", "CENG");
        Department electronicEngineering = new Department("Electronic Engineering", "EEE");
        Department industrialEngineering = new Department("Industrial Engineering", "IE");
        Department mechanicalEngineering = new Department("Mechanical Engineering", "ME");
        Department civilEngineering = new Department("Civil Engineering", "CE");
        Department energySystemsEngineering = new Department("Energy Systems Engineering", "CE");

        university.addDepartment(computerEngineering);
        university.addDepartment(electronicEngineering);
        university.addDepartment(industrialEngineering);
        university.addDepartment(mechanicalEngineering);
        university.addDepartment(civilEngineering);
        university.addDepartment(energySystemsEngineering);

        Random rand = new Random();

        //Computer Engineering Courses Creation
        for (int i = 1; i <= 30; i++) {
            String courseCode = "CENG" + String.format("%03d", i);
            int creditHours = rand.nextInt(3) + 3;
            String lecturerId = "CENG-Lecturer" + String.format("%03d", i);
            Lecturer lecturer = new Lecturer("Fadi Yilmaz", lecturerId);
            Course course = new Course(courseCode, "Computer Engineering", creditHours,(i%8)+1);
            course.setLecturer(lecturer);
            computerEngineering.addCourse(course);
        }

        //Electric and Electronical Engineering Courses Creation
        for (int i = 1; i <= 30; i++) {
            String courseCode = "EEE" + String.format("%03d", i);
            int creditHours = rand.nextInt(3) + 3;
            String lecturerId = "EEE-Lecturer" + String.format("%03d", i);
            Lecturer lecturer = new Lecturer("Ahmet Karaaslan", lecturerId);
            Course course = new Course(courseCode, "Electronic Engineering", creditHours,(i%8)+1);
            course.setLecturer(lecturer);
            electronicEngineering.addCourse(course);
        }

        //Industrial Engineering Courses Creation
        for (int i = 1; i <= 30; i++) {
            String courseCode = "IE" + String.format("%03d", i);
            int creditHours = rand.nextInt(3) + 3;
            String lecturerId = "IE-Lecturer" + String.format("%03d", i);
            Lecturer lecturer = new Lecturer("Alperen Oztas", lecturerId);
            Course course = new Course(courseCode, "Industrial Engineering", creditHours,(i%8)+1);
            course.setLecturer(lecturer);
            industrialEngineering.addCourse(course);
        }

        //Mechanical Engineering Courses Creation
        for (int i = 1; i <= 30; i++) {
            String courseCode = "ME" + String.format("%03d", i);
            int creditHours = rand.nextInt(3) + 3;
            String lecturerId = "ME-Lecturer" + String.format("%03d", i);
            Lecturer lecturer = new Lecturer("Mert Kanak", lecturerId);
            Course course = new Course(courseCode, "Mechanical Engineering", creditHours,(i%8)+1);
            course.setLecturer(lecturer);
            mechanicalEngineering.addCourse(course);
        }

        //Civil Engineering Courses Creation
        for (int i = 1; i <= 30; i++) {
            String courseCode = "CE" + String.format("%03d", i);
            int creditHours = rand.nextInt(3) + 3;
            String lecturerId = "CE-Lecturer" + String.format("%03d", i);
            Lecturer lecturer = new Lecturer("Duygu Baday", lecturerId);
            Course course = new Course(courseCode, "Civil Engineering", creditHours,(i%8)+1);
            course.setLecturer(lecturer);
            civilEngineering.addCourse(course);
        }

        //Energy Systems Engineering Courses Creation
        for (int i = 1; i <= 30; i++) {
            String courseCode = "ESE" + String.format("%03d", i);
            int creditHours = rand.nextInt(3) + 3;
            String lecturerId = "ESE-Lecturer" + String.format("%03d", i);
            Lecturer lecturer = new Lecturer("Ilknur Yigit", lecturerId);
            Course course = new Course(courseCode, "Energy Systems Engineering", creditHours,(i%8)+1);
            course.setLecturer(lecturer);
            energySystemsEngineering.addCourse(course);
        }

        //We create 200 students for CENG Department here
        for (int i = 1; i <= 200; i++) {
            String studentId = "CENG-Student" + String.format("%03d", i);
            Student student = new Student(studentId, "Computer Engineering");
            computerEngineering.addStudent(student);
        }
        //We create 200 students for EEE Department here
        for (int i = 1; i <= 200; i++) {
            String studentId = "EEE-Student" + String.format("%03d", i);
            Student student = new Student(studentId, "Electric and Electronic Engineering");
            electronicEngineering.addStudent(student);
        }
        //We create 200 students for IE Department here
        for (int i = 1; i <= 200; i++) {
            String studentId = "IE-Student" + String.format("%03d", i);
            Student student = new Student(studentId, "Industrial Engineering");
            industrialEngineering.addStudent(student);
        }
        //We create 200 students for ME Department here
        for (int i = 1; i <= 200; i++) {
            String studentId = "ME-Student" + String.format("%03d", i);
            Student student = new Student(studentId, "Mechanical Engineering");
            mechanicalEngineering.addStudent(student);
        }
        //We create 200 students for CE Department here
        for (int i = 1; i <= 200; i++) {
            String studentId = "CE-Student" + String.format("%03d", i);
            Student student = new Student(studentId, "Civil Engineering");
            civilEngineering.addStudent(student);
        }
        //We create 200 students for ESE Department here
        for (int i = 1; i <= 200; i++) {
            String studentId = "ESE-Student" + String.format("%03d", i);
            Student student = new Student(studentId, "Energy Systems Engineering");
            energySystemsEngineering.addStudent(student);
        }

        List<Classroom> classrooms = new ArrayList<Classroom>();

        for (int i = 1; i <= 15; i++) {
            Classroom classroom = new Classroom(i, 50);
            classrooms.add(classroom);
        }

        // Create schedule
        Scheduler scheduler = new Scheduler(classrooms, university);
        scheduler.createSchedule();
        for (Classroom classroom : classrooms) {
            System.out.println("Classroom " + classroom.getNumber() + ":");
            for (Map.Entry<String, List<Course>> entry : classroom.getSchedule().entrySet()) {
                System.out.println("\t" + entry.getKey() + ":");
                for (Course course : entry.getValue()) {
                    System.out.println("\t\t" + course.getCode());
                }
            }
        }

        for (Department department : university.getDepartments()) {
            System.out.println("Department: " + department.getName());
            System.out.println("Courses:");
            for (Course course : department.getCourses()) {
                System.out.println("\t" + course.getCode() + "\t" + course.getCreditHours() +  "\t" + course.getSemester() + "\t" + course.getLecturer().getName());
            }
        }
        /*
        for (Student student : civilEngineering.getStudents()){
            System.out.println(student.getId());
        }
        */
    }
}
