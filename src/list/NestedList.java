package list;

import mainmenu.CurriculumChecklist;

public class NestedList {
    private DoublyLinkedCircularList<DoublyLinkedCircularList<Object>> menu;
    CurriculumChecklist curriculumChecklist = new CurriculumChecklist();
    //GradeTracker gradeTracker = new GradeTracker();
    //MySchedule mySchedule = new MySchedule();

    public void initializeMenuList() {
        menu = new DoublyLinkedCircularList<>();

        DoublyLinkedCircularList<Object> curriculumChecklistNode = new DoublyLinkedCircularList<>();
        DoublyLinkedCircularList<Object> transcriptOfRecordsNode = new DoublyLinkedCircularList<>();

        menu.add(curriculumChecklistNode);
        menu.add(transcriptOfRecordsNode);
    } // end of initializeMenuList method

    public void firstMenu(int subMenuSelection) {
        switch (subMenuSelection) {
            case 1 -> curriculumChecklist.viewList(menu.get(0));
            case 2 -> curriculumChecklist.add(menu.get(0));
            case 3 -> curriculumChecklist.remove(menu.get(0));
            case 5 -> System.out.println("\nReturning to main menu...");
        }
    } // end of firstMenu method

    public void secondMenu(int subMenuSelection) {
        switch (subMenuSelection) {
            //case 1 -> gradeTracker.viewList(list.get(1));
            //case 2 -> gradeTracker.add(list.get(1));
            case 7 -> System.out.println("\nReturning to main menu...");
        }
    } // end of secondMenu method

    public void thirdMenu(int subMenuSelection) {
        switch (subMenuSelection) {
            case 6 -> System.out.println("\nReturning to main menu...");
        }
    }
} // end of Menu class
