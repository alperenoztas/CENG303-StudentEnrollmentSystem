package org.example;

import com.github.javafaker.Faker;

import java.util.*;

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
        Faker faker = new Faker();
        university.addCommonCourses(university.getDepartments());

        //Computer Engineering Courses Creation
        for (int i = 0; i < CourseGenerator.getCengCourses().size() ; i++) {
            String courseCode = "CENG" + String.format("%03d", i);
            int creditHours = rand.nextInt(3) + 3;
            String lecturerId = "CENG-Lecturer" + String.format("%03d", i);
            Lecturer lecturer = new Lecturer( InstructorGenerator.getRandomCengLecturer(),lecturerId);
            Course course = new Course(courseCode, computerEngineering, creditHours,(i%8)+1);
            course.setName(CourseGenerator.getCengCourses().get(i));
            course.setLecturer(lecturer);
            computerEngineering.addCourse(course);
        }

        //Electric and Electronical Engineering Courses Creation
        for (int i = 0; i < CourseGenerator.getEeeCourses().size(); i++) {
            String courseCode = "EEE" + String.format("%03d", i);
            int creditHours = rand.nextInt(3) + 3;
            String lecturerId = "EEE-Lecturer" + String.format("%03d", i);
            Lecturer lecturer = new Lecturer(InstructorGenerator.getRandomEeeLecturer(), lecturerId);
            Course course = new Course(courseCode, electronicEngineering, creditHours,(i%8)+1);
            course.setName(CourseGenerator.getEeeCourses().get(i));
            course.setLecturer(lecturer);
            electronicEngineering.addCourse(course);
        }

        //Industrial Engineering Courses Creation
        for (int i = 0; i < CourseGenerator.getIeCourses().size(); i++) {
            String courseCode = "IE" + String.format("%03d", i);
            int creditHours = rand.nextInt(3) + 3;
            String lecturerId = "IE-Lecturer" + String.format("%03d", i);
            Lecturer lecturer = new Lecturer(InstructorGenerator.getRandomIeLecturer(), lecturerId);
            Course course = new Course(courseCode, industrialEngineering, creditHours,(i%8)+1);
            course.setName(CourseGenerator.getIeCourses().get(i));
            course.setLecturer(lecturer);
            industrialEngineering.addCourse(course);
        }

        //Mechanical Engineering Courses Creation
        for (int i = 0; i < CourseGenerator.getMeCourses().size(); i++) {
            String courseCode = "ME" + String.format("%03d", i);
            int creditHours = rand.nextInt(3) + 3;
            String lecturerId = "ME-Lecturer" + String.format("%03d", i);
            Lecturer lecturer = new Lecturer(InstructorGenerator.getRandomMeLecturer(), lecturerId);
            Course course = new Course(courseCode, mechanicalEngineering, creditHours,(i%8)+1);
            course.setName(CourseGenerator.getMeCourses().get(i));
            course.setLecturer(lecturer);
            mechanicalEngineering.addCourse(course);
        }

        //Civil Engineering Courses Creation
        for (int i = 0; i < CourseGenerator.getCeCourses().size(); i++) {
            String courseCode = "CE" + String.format("%03d", i);
            int creditHours = rand.nextInt(3) + 3;
            String lecturerId = "CE-Lecturer" + String.format("%03d", i);
            Lecturer lecturer = new Lecturer(InstructorGenerator.getRandomCeLecturer(), lecturerId);
            Course course = new Course(courseCode, civilEngineering, creditHours,(i%8)+1);
            course.setName(CourseGenerator.getCeCourses().get(i));
            course.setLecturer(lecturer);
            civilEngineering.addCourse(course);
        }

        //Energy Systems Engineering Courses Creation
        for (int i = 0; i < CourseGenerator.getEseCourses().size(); i++) {
            String courseCode = "ESE" + String.format("%03d", i);
            int creditHours = rand.nextInt(3) + 3;
            String lecturerId = "ESE-Lecturer" + String.format("%03d", i);
            Lecturer lecturer = new Lecturer(InstructorGenerator.getRandomEseLecturer(), lecturerId);
            Course course = new Course(courseCode, energySystemsEngineering, creditHours,(i%8)+1);
            course.setName(CourseGenerator.getEseCourses().get(i));
            course.setLecturer(lecturer);
            energySystemsEngineering.addCourse(course);
        }

        //We create 200 students for CENG Department here
        for (int i = 1; i <= 200; i++) {
            String studentId = "CENG-Student" + String.format("%03d", i);
            Student student = new Student(faker.name().fullName(),studentId, computerEngineering,(i%4)+1);
            computerEngineering.addStudent(student);
        }
        //We create 200 students for EEE Department here
        for (int i = 1; i <= 200; i++) {
            String studentId = "EEE-Student" + String.format("%03d", i);
            Student student = new Student(faker.name().fullName(),studentId, electronicEngineering,(i%4)+1);
            electronicEngineering.addStudent(student);
        }
        //We create 200 students for IE Department here
        for (int i = 1; i <= 200; i++) {
            String studentId = "IE-Student" + String.format("%03d", i);
            Student student = new Student(faker.name().fullName(),studentId, industrialEngineering,(i%4)+1);
            industrialEngineering.addStudent(student);
        }
        //We create 200 students for ME Department here
        for (int i = 1; i <= 200; i++) {
            String studentId = "ME-Student" + String.format("%03d", i);
            Student student = new Student(faker.name().fullName(),studentId, mechanicalEngineering,(i%4)+1);
            mechanicalEngineering.addStudent(student);
        }
        //We create 200 students for CE Department here
        for (int i = 1; i <= 200; i++) {
            String studentId = "CE-Student" + String.format("%03d", i);
            Student student = new Student(faker.name().fullName(),studentId, civilEngineering,(i%4)+1);
            civilEngineering.addStudent(student);
        }
        //We create 200 students for ESE Department here
        for (int i = 1; i <= 200; i++) {
            String studentId = "ESE-Student" + String.format("%03d", i);
            Student student = new Student(faker.name().fullName(),studentId, energySystemsEngineering,(i%4)+1);
            energySystemsEngineering.addStudent(student);
        }

        /*
        List<Classroom> classrooms = new ArrayList<>();

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
            System.out.println("Code\t\tCourseName\t\t\t\t\tCredit\tSemester\tInstructor");
            for (Course course : department.getCourses()) {
                System.out.printf("%s\t\t%-30s\t%d\t\t%s\t\t%s\n",course.getCode(),course.getName(),course.getCreditHours(),course.getSemester(),course.getLecturer().getName());
            }
        }
        */
        for(Student student : computerEngineering.getStudents()){
            System.out.println(student.getName() + " " + student.getGrade());
        }
    }
}
