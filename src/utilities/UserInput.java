package utilities;

import java.util.Scanner;

public class UserInput {
    public String read(String promptMessage) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print(promptMessage);
        return keyboard.nextLine();
    } // end of read method
} // end of UserInput class
