package mainmenu;

import academic.Course;
import list.DoublyLinkedCircularList;
import utilities.UserInput;

public class CurriculumChecklist {
    private String courseName;
    private String courseCode;
    private String classCode;
    private String professor;
    private double units;
    UserInput input = new UserInput();

    public void viewList(DoublyLinkedCircularList<Object> list) {
        System.out.println("------------------------------------------------------");
        System.out.println("                   Course Checklist                    ");
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-40s%-15s%-15s%-30s%-10s%n", "Course Name", "Course Code", "Class Code", "Professor",
                "Units");
        System.out.printf("%-40s%-15s%-15s%-30s%-10s%n", "=====================================", "============",
                "============", "===========================", "=======");
        for (int i = 0; i < list.size(); i++) {
            Course course = (Course) list.get(i);
            System.out.printf("%-40s%-15s%-15s%-30s%-10.1f%n", course.getCourseName(), course.getCourseCode(),
                    course.getClassCode(), course.getProfessor(), course.getUnits());
        }
        System.out.println("---------------------------------------------------------------------------------------");
    } // end of viewList method

    public void add(DoublyLinkedCircularList<Object> list) {
        System.out.println("\nAdd Course");
        System.out.println("=========================");
        courseName = input.read(">>> Course Name: ");
        courseCode = input.read(">>> Course Code: ");
        classCode = input.read(">>> Class Code: ");
        professor = input.read(">>> Professor: ");
        units = Double.parseDouble(input.read(">>> Units: "));

        list.add(new Course(courseName, courseCode, classCode, professor, units));
    } // end of add method

    public void remove(DoublyLinkedCircularList<Object> list) {
        System.out.println("\nRemove Course");
        System.out.println("=========================");
        courseCode = input.read(">>> Course Code: ");
        classCode = input.read(">>> Class Code: ");

        Course course = (Course) list.getData(new Course(courseCode, classCode));

        list.remove(course);
    } // end of remove method

    public void clear(DoublyLinkedCircularList<Object> list) {

    }

    public void export(DoublyLinkedCircularList<Object> list) {

    }

} // end of CurriculumChecklist class
