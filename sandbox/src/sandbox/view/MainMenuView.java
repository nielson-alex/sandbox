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
public class MainMenuView extends View {

    public MainMenuView() {
        super("\nThis is where I get to show off a few of the things I've\n"
                + "been learning in Java. It's not much but I hope you like it!\n\n"
                + "C - Currency Conversion\n"
                + "Z - Chinese Greeting\n"
                + "A - Create Array\n"
                + "O - Other\n"
                + "Q - Quit");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();

        switch (value) {
            case "C":
                this.displayCurrencyConversion();
                break;
            case "Z":
                this.displayZhongwenGreeting();
                break;
            case "A":
                this.displayCreateArray();
                break;
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
        currencyConversionView.display();
    }
    
    // case "Z"
    private void displayZhongwenGreeting() {
        ZhongwenGreetingView zhongwenGreetingView = new ZhongwenGreetingView();
        zhongwenGreetingView.display();
    }
    
    // case "A"
    private void displayCreateArray() {
        CreateArrayView createArrayView = new CreateArrayView();
        createArrayView.displayCreateArrayView();
    }
    
    // case "O"
    private void displayOtherView() {
        System.out.println("\n***displayOtherView() function called***");
    }
    
    private void quitGame() {
        return;
    }

}
