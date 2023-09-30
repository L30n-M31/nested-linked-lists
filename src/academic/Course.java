package academic;

public class Course {
    private String courseName;
    private String courseCode;
    private String classCode;
    private String professor;
    private double units;

    public Course() {
        setCourseName(null);
        setCourseCode(null);
        setClassCode(null);
        setProfessor(null);
        setUnits(0.0);
    } // end of default constructor

    public Course(String courseName, String courseCode, String classCode, String professor, double units) {
        setCourseName(courseName);
        setCourseCode(courseCode);
        setClassCode(classCode);
        setProfessor(professor);
        setUnits(units);
    } // end of constructor

    public Course(String courseCode, String classCode) {
        setCourseCode(courseCode);
        setClassCode(classCode);
    } // end of constructor

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getClassCode() {
        return classCode;
    }

    public String getProfessor() {
        return professor;
    }

    public double getUnits() {
        return units;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public void setUnits(double units) {
        this.units = units;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Course course)) return false;
        return (courseCode + "," + classCode).equalsIgnoreCase
                (course.getCourseCode() + "," + course.getClassCode());
    } // end of equals method

    @Override
    public String toString() {
        return "Course Name: " + courseName + "\n" +
                "Course Code: " + courseCode + "\n" +
                "Class Code: " + classCode + "\n" +
                "Professor: " + professor + "\n" +
                "Units: " + units + "\n";
    } // end of toString method
} // end of Course class
