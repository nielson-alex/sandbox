/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox.model;
import java.util.Scanner;
/**
 *
 * @author alex
 */
public class conversion {
	private final static double EUROS = 0.94;
	private final static double CANADIAN_DOLLARS = 1.32;
	private final static double YUAN = 6.93;
	private final static double PESOS = 21.39;
	private final static double YEN = 115.63;
	
	public static void main(String[] args) {
	
		// print out the welcome message
		System.out.println();
		System.out.println("This program converts U.S. dollars to the currencies of "
						   + "America's top 5 trade partners. Specifically, it will " 
						   + "convert USD to the following currencies: "
						   + "\n"
						   + "\n" + "\t" + "Euros" 
						   + "\n" + "\t" + "Canadian dollars"
						   + "\n" + "\t" + "Chinese yuan" 
						   + "\n" + "\t" + "Mexican pesos"
						   + "\n" + "\t" + "Japanese yen");
		
		//prompt to enter amount of USD to convert to Euros
		System.out.println("\nPlease enter the amount of USD to convert to Euros: ");
		
		// create an input file for the console
		Scanner inFile;
		inFile = new Scanner(System.in);
		
		// read the value of the next double typed into the console
		double euros = inFile.nextDouble();
		
		// prompt to enter amount of USD to convert to Canadian dollars
		System.out.println("\nPlease enter the amount of USD to convert to Canadian Dollars: ");
		
		// read the value of the next double typed into the console
		double canadianDollars = inFile.nextDouble();
		
		// prompt to enter amount of USD to convert to Chinese yuan
		System.out.println("\nPlease enter the amount of USD to convert to Chinese yuan: ");
		
		// read the value of the next double typed into the console
		double yuan = inFile.nextDouble();
		
		// prompt to enter amount of USD to convert to Mexican pesos
		System.out.println("\nPlease enter the amount of USD to convert to Mexican pesos: ");
		
		// read the value of the next double typed into the console
		double pesos = inFile.nextDouble();
		
		// prompt to enter amount of USD to convert to Japanese yen
		System.out.println("\nPlease enter the amount of USD to convert to Japanese yen: ");
		
		// read the value of the next double typed into the console
		double yen = inFile.nextDouble();
		
		
		
		// convert the amounts to their respective foreign currencies
		double dollarsToEuros = euros * EUROS;
		double dollarsToCanadianDollars = canadianDollars * CANADIAN_DOLLARS;
		double dollarsToYuan = yuan * YUAN;
		double dollarsToPesos = pesos * PESOS;
		double dollarsToYen = yen * YEN;
		
		
		// display the conversion results on the screen
		System.out.println("\n***********************************"
						+ "***************************************");
		System.out.println("\tCONVERSION RESULTS"
						+ "\n" + "\t" + euros + " USD is " + dollarsToEuros + " Euros"
						+ "\n" + "\t" + canadianDollars + " USD is " + dollarsToCanadianDollars + " Canadian dollars."
						+ "\n" + "\t" + yuan + " USD is " + dollarsToYuan + " Chinese yuan"
						+ "\n" + "\t" + pesos + " USD is " + dollarsToPesos + " Mexican pesos" 
						+ "\n" + "\t" + yen + " USD is " + dollarsToYen + " Japanese yen");
		System.out.println("\n***********************************"
						+"***************************************");
	}
}
