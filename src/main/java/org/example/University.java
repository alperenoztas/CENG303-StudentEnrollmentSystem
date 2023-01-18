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

    //Add common course for each department so they can reach it and common
    public void addCommonCourses(List<Department> departments) {
        List<Course> commonCourses = new ArrayList<Course>();
        Lecturer lecturer = new Lecturer("Common Teacher", "20050151010");
        commonCourses.add(new Course("Calculus I","MATH101",null,5,1, lecturer));
        commonCourses.add(new Course("Calculus II","MATH102",null,5,1, lecturer));
        commonCourses.add(new Course("Linear Algebra","MATH103",null,5,2, lecturer));
        commonCourses.add(new Course("Differential Equations","MATH104",null,5,3, lecturer));
        commonCourses.add(new Course("Physics I","PHYS101",null,5,1, lecturer));
        commonCourses.add(new Course("Physics II","PHYS102",null,5,2, lecturer));
        for (Department department : departments) {
            for (int i = 0; i < 6; i++) {
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

