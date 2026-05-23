package Q5;

class Lecturer {

    private String lecturerName;
    private String courseTeaching;

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getCourseTeaching() {
        return courseTeaching;
    }

    public void setCourseTeaching(String courseTeaching) {
        this.courseTeaching = courseTeaching;
    }
}

class Course {

    private String courseName;
    private String courseCode;

    private Lecturer lecturer;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}

class Student {

    private String studentName;
    private String degreeName;
    private String courseFollowing;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getCourseFollowing() {
        return courseFollowing;
    }

    public void setCourseFollowing(String courseFollowing) {
        this.courseFollowing = courseFollowing;
    }
}

public class Q5 {
    public static void main(String[] args) {

        Lecturer lec = new Lecturer();
        lec.setLecturerName("Dr. Kesavan");
        lec.setCourseTeaching("OOP");

        Course c1 = new Course();
        c1.setCourseName("Object Oriented Programming");
        c1.setCourseCode("CTEC2201");
        c1.setLecturer(lec);

        Student s1 = new Student();
        s1.setStudentName("Lahiru");
        s1.setDegreeName("BICT");
        s1.setCourseFollowing("OOP");

        System.out.println("Course Name: "
                + c1.getCourseName());

        System.out.println("Course Code: "
                + c1.getCourseCode());

        System.out.println("Lecturer: "
                + c1.getLecturer().getLecturerName());

        System.out.println("Student Name: "
                + s1.getStudentName());

        System.out.println("Degree Name: "
                + s1.getDegreeName());

        System.out.println("Course Following: "
                + s1.getCourseFollowing());
    }
}