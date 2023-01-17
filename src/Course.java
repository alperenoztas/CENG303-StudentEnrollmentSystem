import java.util.ArrayList;
import java.util.List;

class Course {
    private String name;
    private String code;
    private String department;
    private int creditHours;
    private Lecturer lecturer;
    private List<String> meetingTimes;

    private List<Student> students;





    public Course(String name, String code, String department, int creditHours, Lecturer lecturer) {
        this.name = name;
        this.code = code;
        this.department = department;
        this.creditHours = creditHours;
        this.lecturer = lecturer;
        this.meetingTimes = new ArrayList<String>();
    }

    public Course(String code, String department, int creditHours) {
        this.code = code;
        this.department = department;
        this.creditHours = creditHours;
    }


    public void addMeetingTime(String time) {
        meetingTimes.add(time);
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getDepartment() {
        return department;
    }

    public int getCreditHours() {
        return creditHours;
    }


    public List<Student> getStudents() {
        return students;
    }

    public List<String> getMeetingTimes() {
        return meetingTimes;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

}
