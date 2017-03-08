/*
/* Welcome screen:
/*The end user enters the command to start the program/game. The computer displays the
/*banner screen including the title of the game. The computer also requests for the user to input
/*their desired name. The user enters their name and the computer displays a welcome message,
/*along with a brief description of the game and the Main Menu. An error message is displayed if
/*the user enters an invalid name or command.
 */
package sandbox.view;

import java.util.Scanner;

/**
 *
 * @author Alexandra
 */
public class StartProgramView extends View {

    public StartProgramView() {
        super(
                  "\n_____________________________________________________________________________________\n"        
                + "                                                                                        \n"
                + "                                                                                      \n"
                + "                                                                                      \n"
                + "                                          ,---,  ,---,                                \n"
                + "                              ,---,     ,---.'|,---.'|      ,---.                     \n"
                + "  .--.--.                 ,-+-. /  |    |   | :|   | :     '   ,'\\ ,--,  ,--,         \n"
                + " /  /    '    ,--.--.    ,--.'|'   |    |   | |:   : :    /   /   ||'. \\/ .`|         \n"
                + "|  :  /`./   /       \\  |   |  ,\"' |  ,--.__| |:     |,-..   ; ,. :'  \\/  / ;         \n"
                + "|  :  ;_    .--.  .-. | |   | /  | | /   ,'   ||   : '  |'   | |: : \\  \\.' /          \n"
                + " \\  \\    `.  \\__\\/: . . |   | |  | |.   '  /  ||   |  / :'   | .; :  \\  ;  ;          \n"
                + "  `----.   \\ ,\" .--.; | |   | |  |/ '   ; |:  |'   : |: ||   :    | / \\  \\  \\         \n"
                + " /  /`--'  //  /  ,.  | |   | |--'  |   | '/  '|   | '/ : \\   \\  /./__;   ;  \\        \n"
                + "'--'.     /;  :   .'   \\|   |/      |   :    :||   :    |  `----' |   :/\\  \\ ;        \n"
                + "  `--'---' |  ,     .-./'---'        \\   \\  /  /    \\  /          `---'  `--`         \n"
                + "            `--`---'                  `----'   `-'----'                               \n"
                + "_______________________________________________________________________________________\n\n"
                + "Welcome to my sandbox! This is a simple Java program that showcases some of the Java concepts\n"
                + "and principles I've been learning. Press 'c' to continue.");

    }

    @Override
    public boolean doAction(String value) {
        boolean done = false;
        
        while (!done) {
            if ("C".equals(value.toUpperCase())) {
                this.displayMainMenu();
                break;
            } else if (value.length() < 1) {
                System.out.println("\n*** Invalid: value cannot be blank ***");
            } else if (!("C".equals(value.toUpperCase()))) {
                System.out.println("\n*** Invalid: please press 'C' to continue ***");

                return false;
            }
        }

        // display next view
        return true;
    }

    private void displayMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
}
