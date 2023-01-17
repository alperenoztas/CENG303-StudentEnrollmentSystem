package org.example;

import java.util.*;

class Scheduler {
    private List<Classroom> classrooms;
    private University university;
    private Random rand = new Random();

    public Scheduler(List<Classroom> classrooms, University university) {
        this.classrooms = classrooms;
        this.university = university;
    }

    public void createSchedule() {

        //We created a map to store the schedule for the classroom
        Map<Classroom, Map<String, List<Course>>> schedule = new HashMap<>();

        //Initialized schedule for each classroom in the AYBU
        for (Classroom classroom : classrooms) {
            schedule.put(classroom, new HashMap<>());
        }

        // For each department (Computer,Electric,Mechanical,Industrial,Construction)
        for (Department department : university.getDepartments()) {
            // Get the courses given by the department in the AYBU
            List<Course> courses = department.getCourses();

            // We sorted the courses here by credit hours
            Collections.sort(courses, new Comparator<Course>() {
                @Override
                public int compare(Course c1, Course c2) {
                    return Integer.compare(c1.getCreditHours(), c2.getCreditHours());
                }
            });

            // We assigned the courses to the classrooms
            for (Course course : courses) {
                //For each course, a random classroom is chosen
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
                    // If there is no available time slot for the course,we increase the number of classrooms with 5 given in the assignment
                    Classroom newClassroom = new Classroom(classrooms.size()+5, 50);
                    classrooms.add(newClassroom);
                    schedule.put(newClassroom, new HashMap<>());
                }
            }
        }

        // We assigned the schedule to each classroom
        for (Map.Entry<Classroom, Map<String, List<Course>>> entry : schedule.entrySet()) {
            Classroom classroom = entry.getKey();
            Map<String, List<Course>> classroomSchedule = entry.getValue();
            classroom.setSchedule(classroomSchedule);
        }
    }
}


