/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import java.util.Scanner;

/**
 * The HelloWorldApp class implements an application that
 * simply prints "Hello World!" to standard output.
 */
public class Sandbox {

/**
 * @param args the command line arguments
 */
    public static void main(String[] args) {

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