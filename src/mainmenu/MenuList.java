package mainmenu;

import ui.MenuInterface;

import java.util.LinkedList;

public class MenuList {
    LinkedList<LinkedList<Object>> list;

    CourseChecklist courseCheckList = new CourseChecklist();
    GradeTracker gradeTracker = new GradeTracker();
    MySchedule mySchedule = new MySchedule();

    public void initializeMenuList() {
        list = new LinkedList<>();

        LinkedList<Object> courseList = new LinkedList<>();
        LinkedList<Object> gradeList = new LinkedList<>();
        LinkedList<Object> schedule = new LinkedList<>();

        list.add(courseList);
        list.add(gradeList);
        list.add(schedule);
    } // end of initializeMenuList method

    public void firstMenu(int subMenuSelection) {
        switch (subMenuSelection) {
            case 1 -> courseCheckList.viewList(list.get(0));
            case 2 -> courseCheckList.add(list.get(0));
            case 5 -> System.out.println("Returning to main menu...");
        }
    } // end of firstMenu method

    public void secondMenu(int subMenuSelection) {
        switch (subMenuSelection) {
            case 1 -> gradeTracker.viewList(list.get(1));
            case 2 -> gradeTracker.add(list.get(1));
            case 7 -> System.out.println("Returning to main menu...");
        }
    } // end of secondMenu method
} // end of Menu class
