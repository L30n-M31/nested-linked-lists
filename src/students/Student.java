package students;

public class Student {
    private String firstName;
    private String lastName;
    private String IDNumber;
    private String program;
    private int year;

    public Student() {
        setFirstName(null);
        setLastName(null);
        setIDNumber(null);
        setProgram(null);
        setYear(0);
    } // end of default constructor

    public Student(String firstName, String lastName, String IDNumber, String program, int year) {
        setFirstName(firstName);
        setLastName(lastName);
        setIDNumber(IDNumber);
        setProgram(program);
        setYear(year);
    } // end of constructor

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student student)) return false;
        return (firstName + "," + lastName).equalsIgnoreCase
                (student.getFirstName() + "," + student.getLastName());
    } // end of equals method

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n" +
                "ID Number: " + IDNumber + "\n" +
                "Program: " + program + "\n" +
                "Year: " + year + "\n";
    } // end of toString method
} // end of Student class
