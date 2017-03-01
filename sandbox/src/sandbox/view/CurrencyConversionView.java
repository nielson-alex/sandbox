/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox.view;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class CurrencyConversionView {
    
    public void displayCurrencyConversionView() {
    //prompt to enter amount of USD to convert to Euros
        System.out.println("\nPlease enter the amount of USD to convert to Yuan: ");

        // create an input file for the console
        Scanner inFile;
        inFile = new Scanner(System.in);

        // read the value of the next double typed into the console
        float usd = inFile.nextFloat();
        float yuan = usd * 6.94f;

        // prompt to enter amount of USD to convert to Canadian dollars
        String conversion = String.format("\n" + usd + "USD is: " + 
                "%.02f", yuan);
        System.out.println("\n" + conversion);
    }
}
