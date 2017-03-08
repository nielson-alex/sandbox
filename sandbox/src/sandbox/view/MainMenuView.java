/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox.view;

import java.util.Scanner;
import sandbox.view.CurrencyConversionView;
import sandbox.view.ZhongwenGreetingView;

/**
 *
 * @author aleecrook
 */
public class MainMenuView {

    private String menu;

    //private String promptMessage;
    public MainMenuView() {
        this.menu = "\nThis is where I get to show off a few of the things I've\n"
                + "been learning in Java. It's not much but I hope you like it!\n\n"
                + "C - Currency Conversion\n"
                + "Z - Chinese Greeting\n"
                + "A - Create Array\n"
                + "O - Other\n"
                + "Q - Quit";
    }

    public void displayMainMenuView() {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(menuOption);

        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard 
        String value = ""; //value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.menu);

            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }

            break; // end the loop
        }

        return value; // return the value entered
    }

    boolean doAction(String choice) {
        choice = choice.toUpperCase();

        switch (choice) {
            case "C":
                this.displayCurrencyConversion();
                break;
            case "Z":
                this.displayZhongwenGreeting();
            case "A":
                this.displayCreateArray();
            case "O":
                this.displayOtherView();
                break;
            case "Q":
                this.quitGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;

    }

    // case "C"
    private void displayCurrencyConversion() {
        CurrencyConversionView currencyConversionView = new CurrencyConversionView();
        currencyConversionView.displayCurrencyConversionView();
    }
    
    // case "Z"
    private void displayZhongwenGreeting() {
        ZhongwenGreetingView zhongwenGreetingView = new ZhongwenGreetingView();
        zhongwenGreetingView.displayZhongwenGreetingView();
    }
    
    // case "A"
    private void displayCreateArray() {
        CreateArrayView createArrayView = new CreateArrayView();
        createArrayView.displayCreateArrayView();
    }
    
    private void displayOtherView() {
        System.out.println("\n***displayOtherView() function called***");
    }
    
    private void quitGame() {
        return;
    }

}
