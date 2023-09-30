package academic;

public class Grade extends Course {
    private double prelimGrade;
    private double midtermGrade;
    private double tentativeFinalGrade;
    private double finalGrade;

    public Grade() {
        super();
        setPrelimGrade(0.0);
        setMidtermGrade(0.0);
        setTentativeFinalGrade(0.0);
        setFinalGrade(0.0);
    } // end of default constructor

    public Grade(Course course, double prelimGrade, double midtermGrade, double tentativeFinalGrade, double finalGrade) {
        super(course.getCourseName(), course.getCourseCode(), course.getClassCode(), course.getProfessor(), course.getUnits());
        setPrelimGrade(prelimGrade);
        setMidtermGrade(midtermGrade);
        setTentativeFinalGrade(tentativeFinalGrade);
        setFinalGrade(finalGrade);
    } // end of constructor

    public double getPrelimGrade() {
        return prelimGrade;
    }

    public double getMidtermGrade() {
        return midtermGrade;
    }

    public double getTentativeFinalGrade() {
        return tentativeFinalGrade;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setPrelimGrade(double prelimGrade) {
        this.prelimGrade = prelimGrade;
    }

    public void setMidtermGrade(double midtermGrade) {
        this.midtermGrade = midtermGrade;
    }

    public void setTentativeFinalGrade(double tentativeFinalGrade) {
        this.tentativeFinalGrade = tentativeFinalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    @Override
    public String toString() {
        return "Prelim Grade: " + prelimGrade + "\n" +
                "Midterm Grade: " + midtermGrade + "\n" +
                "Tentative Final Grade: " + tentativeFinalGrade + "\n" +
                "Final Grade: " + finalGrade + "\n";
    } // end of toString method
} // end of Grade class