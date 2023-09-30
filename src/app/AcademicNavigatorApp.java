package app;

import list.NestedList;
import ui.MenuInterface;
import utilities.UserInput;

public class AcademicNavigatorApp {
    public static void main(String[] args) {
        AcademicNavigatorApp program = new AcademicNavigatorApp();
        program.run();
    }

    public void run() {
        UserInput input = new UserInput();
        MenuInterface UI = new MenuInterface();
        NestedList execute = new NestedList();
        execute.initializeMenuList();

        int selection = 0;
        int subSelection = 0;
        while (selection != 4) {
            UI.mainMenu();
            selection = Integer.parseInt(input.read(">>> Enter among the choices above: "));
            switch (selection) {
                case 1 -> {
                    while (subSelection != 5) {
                        UI.curriculumChecklistMenu();
                        subSelection = Integer.parseInt(input.read(">>> Enter among the choices above: "));
                        execute.firstMenu(subSelection);
                    }
                }
                case 2 -> {
                    while (subSelection != 7) {
                        UI.gradeTrackerMenu();
                        subSelection = Integer.parseInt(input.read(">>> Enter among the choices above: "));
                        execute.secondMenu(subSelection);
                    }
                }
                case 3 -> {
                    while (subSelection != 6) {
                        UI.gradeTrackerMenu();
                        subSelection = Integer.parseInt(input.read(">>> Enter among the choices above: "));
                        execute.thirdMenu(subSelection);
                    }
                }
            }
        }
    } // end of run method
} // end of AcademicNavigatorApp class
