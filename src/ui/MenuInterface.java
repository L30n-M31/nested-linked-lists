package ui;

public class MenuInterface {
    public void mainMenu() {
        System.out.println("\n===================================");
        System.out.println("|        Academic Navigator       |");
        System.out.println("|   ---------------------------   |");
        System.out.println("|     1. Curriculum Checklist     |");
        System.out.println("|     2. Grade Tracker            |");
        System.out.println("|     3. My Schedule              |");
        System.out.println("|     4. Exit Program             |");
        System.out.println("===================================");
    } // end of mainMenu method

    public void curriculumChecklistMenu() {
        System.out.println("\n---------< Curriculum Checklist >----------");
        System.out.println("   1. View My Current Courses              ");
        System.out.println("   2. Add a Course                         ");
        System.out.println("   3. Remove a Course                      ");
        System.out.println("   4. Clear Courses (for a new semester)   ");
        System.out.println("   5. Return to Main Menu                  ");
        System.out.println("-------------------------------------------");
    } // end of curriculumChecklistMenu method

    public void gradeTrackerMenu() {
        System.out.println("\n------------< Grade Tracker >-------------");
        System.out.println("   1. View My Grades                      ");
        System.out.println("   2. Add a Grade                         ");
        System.out.println("   3. Edit a Grade                        ");
        System.out.println("   4. Grade Statistics                    ");
        System.out.println("   5. Export Grades                       ");
        System.out.println("   6. Clear Grades (for a new semester)   ");
        System.out.println("   7. Return to Main Menu                 ");
        System.out.println("------------------------------------------");
    } // end of gradeTrackerMenu method

    public void myScheduleMenu() {
        System.out.println("\n--------------< My Schedule >---------------");
        System.out.println("   1. View My Schedule                      ");
        System.out.println("   2. Add a Course to Schedule              ");
        System.out.println("   3. Remove a Course from Schedule         ");
        System.out.println("   4. Export Schedule                       ");
        System.out.println("   5. Clear Schedule (for a new semester)   ");
        System.out.println("   6. Return to Main Menu                   ");
        System.out.println("--------------------------------------------");
    } // end of myScheduleMenu()
} // end of Menu class
