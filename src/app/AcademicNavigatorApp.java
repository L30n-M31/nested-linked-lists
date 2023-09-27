package app;

import mainmenu.MenuList;
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
        MenuList execute = new MenuList();
        execute.initializeMenuList();
        int index = 2;
        execute.firstMenu(index);
        execute.firstMenu(1);


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
            }
        }
    } // end of run method
} // end of AcademicNavigatorApp class
