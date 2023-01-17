package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Classroom {
    private int number;
    private int capacity;
    private Map<String, List<Course>> schedule;

    public Classroom(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
        this.schedule = new HashMap<>();
    }

    public boolean isAvailable(Course course) {
        for (String meetingTime : course.getMeetingTimes()) {
            if (!schedule.containsKey(meetingTime)) {
                return true;
            } else if (schedule.get(meetingTime).size() < capacity) {
                return true;
            }
        }
        return false;
    }

    public void assignCourse(Course course) {
        for (String meetingTime : course.getMeetingTimes()) {
            if (!schedule.containsKey(meetingTime)) {
                schedule.put(meetingTime, new ArrayList<Course>());
            }
            schedule.get(meetingTime).add(course);
        }
    }

    public int getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public Map<String, List<Course>> getSchedule() {
        return schedule;
    }



    public void setSchedule(Map<String, List<Course>> schedule) {
        this.schedule = schedule;
    }

}
