package org.example;

import java.util.*;

public class Scheduler {
    private List<Classroom> classrooms;
    private University university;
    private Random rand = new Random();

    public Scheduler(List<Classroom> classrooms, University university) {
        this.classrooms = classrooms;
        this.university = university;
    }

    public void createSchedule() {
        Map<Classroom, Map<String, List<Course>>> schedule = new HashMap<>();

        for (Classroom classroom : classrooms) {
            schedule.put(classroom, new HashMap<>());
        }

        for (Department department : university.getDepartments()) {
            List<Course> courses = department.getCourses();
            Collections.sort(courses, new Comparator<Course>() {
                @Override
                public int compare(Course c1, Course c2) {
                    return Integer.compare(c1.getCreditHours(), c2.getCreditHours());
                }
            });
            for (Course course : courses) {
                Classroom classroom = classrooms.get(rand.nextInt(classrooms.size()));
                Map<String, List<Course>> classroomSchedule = schedule.get(classroom);
                boolean assigned = false;
                for (int i = 0; i < 7; i++) {
                    for (int j = 8; j <= 17; j++) {
                        String time = i + "-" + j;
                        if (!classroomSchedule.containsKey(time)) {
                            classroomSchedule.put(time, new ArrayList<Course>());
                        }
                        if (classroomSchedule.get(time).size() + course.getCreditHours() <= classroom.getCapacity()) {
                            classroomSchedule.get(time).add(course);
                            assigned = true;
                            break;
                        }
                    }
                    if (assigned) {
                        break;
                    }
                }
                if (!assigned) {
                    Classroom newClassroom = new Classroom(classrooms.size()+1, 50);
                    classrooms.add(newClassroom);
                    schedule.put(newClassroom, new HashMap<>());
                }
            }
        }
        for (Map.Entry<Classroom, Map<String, List<Course>>> entry : schedule.entrySet()) {
            Classroom classroom = entry.getKey();
            Map<String, List<Course>> classroomSchedule = entry.getValue();
            classroom.setSchedule(classroomSchedule);
        }
    }
}


