package mainmenu;

import academic.Course;

import java.util.LinkedList;

public class CourseChecklist implements List{
    public void viewList(LinkedList<Object> list) {
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
    } // end of viewCheckList method

    public void add(LinkedList<Object> list) {
        Course course1 = new Course("Data Structures", "CS211", "9340", "Dalos Miguel", 3);
        Course course2 = new Course("Operating Systems", "CS212", "9341", "Ramel Caban", 3);
        Course course3 = new Course("Human Computer Interaction", "CS213", "9342", "Josephine Dela Cruz", 2.5);

        list.add(course1);
        list.add(course2);
        list.add(course3);
    } // end of addCourse method

    @Override
    public void remove(LinkedList<Object> list) {

    }

    @Override
    public void clear(LinkedList<Object> list) {

    }

    @Override
    public void export(LinkedList<Object> list) {

    }
} // end of CourseChecklist class
