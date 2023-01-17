package org.example;

import java.util.ArrayList;
import java.util.List;


public class Lecturer {
    private String name;
    private String id;
    private List<String> availability;
    private List<String> teachingCourses;

    public Lecturer(String name, String id) {
        this.name = name;
        this.id = id;
        this.availability = new ArrayList<String>();
        this.teachingCourses = new ArrayList<String>();
    }

    public void addAvailability(String time) {
        availability.add(time);
    }

    public void addTeachingCourse(String courseCode) {
        teachingCourses.add(courseCode);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<String> getAvailability() {
        return availability;
    }

    public List<String> getTeachingCourses() {
        return teachingCourses;
    }
}

