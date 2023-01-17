package org.example;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<Department>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addCommonCourses(List<Department> departments) {
        List<Course> commonCourses = new ArrayList<Course>();
        commonCourses.add(new Course("MATH-01",5, 2));
        commonCourses.add(new Course("MATH-02", 4,1));
        for (Department department : departments) {
            for (int i = 0; i < 2; i++) {
                Lecturer lecturer = new Lecturer("Common Teacher", "20050151010");
                commonCourses.get(i).setLecturer(lecturer);
                department.addCourse(commonCourses.get(i));
            }
        }
    }
    public String getName() {
        return name;
    }

    public List<Department> getDepartments() {
        return departments;
    }
}

