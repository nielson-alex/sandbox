/*
/* Welcome screen:
/*The end user enters the command to start the program/game. The computer displays the
/*banner screen including the title of the game. The computer also requests for the user to input
/*their desired name. The user enters their name and the computer displays a welcome message,
/*along with a brief description of the game and the Main Menu. An error message is displayed if
/*the user enters an invalid name or command.
 */
package byui.cit260.potterheads.view;

import java.util.Scanner;

/**
 *
 * @author Alexandra
 */
public class StartProgramView {

    private String promptMessage;

    public StartProgramView() {
        this.promptMessage = "\nWelcome to my sandbox! What's your name?\n";
        // display the banner when view is created
        this.displayBanner();

    }

    private void displayBanner() {
        System.out.println(
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
                + "_______________________________________________________________________________________");

    }

    public void displayStartProgramView() {

        boolean done = false; // set flag to not done
        do {
            //prompt for and get guestsName
            String guestsName = this.getGuestsName();
            if (guestsName.toUpperCase().equals("Q")) // user wants to quit
            {
                return;
            }

            //do requested action and display next view
            done = this.doAction(guestsName);

            //while the view is not done
        } while (!done);
    }

    private String getGuestsName() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard 
        String value = ""; //value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }

            break; // end the loop
        }

        return value;
                 // return the value entered
    }

    private boolean doAction(String guestsName) {
        if (guestsName.length() < 2) {
            System.out.println("\nInvalid name: "
                    + "The name must be greater than one character in length.");
            return false;
        }

        // display next view
        this.displayMainMenu();
        return true;
    }

    private void displayMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }
}
