/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox.view;

import java.util.Scanner;
import sandbox.control.CurrencyConversionControl;

/**
 *
 * @author Alex
 */
public class CurrencyConversionView extends View {

    public CurrencyConversionView() {
        super("\nThis simple program will convert U.S. dollars to Chinese 人民币"
                + "\n(press 'c' to continue or 'q' to quit)");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        boolean done = false;
        double usdD = 0;

        while (!done) {
            String pressC = "\n*** Please press 'C' to continue or 'Q' to quit***";

            if ("C".equals(value.toUpperCase())) {
                this.convertUsdToYuan(usdD);
            } else if (!("C".equals(value.toUpperCase())) && !("Q".equals(value.toUpperCase()))) {
                System.out.println(pressC);
            } else if ("Q".equals(value.toUpperCase())) {
                return true;
            }
            break;
        }
        return false;
    }

    private boolean convertUsdToYuan(double usdD) {
        boolean done = false;
        Scanner keyboard = new Scanner(System.in);
        String usd = "";

        while (!done) {

            System.out.println("\nNext enter the amount of U.S. dollars you want to convert to yuan:\n");

            usd = keyboard.nextLine();

            if (usd.length() < 1) {
                System.out.println("\n*** Value cannot be blank ***");
                continue;
            } else if ("Q".equals(usd.toUpperCase())) {
                return true;
            }
            break;
        }

        usdD = Double.parseDouble(usd);
        double yuan = usdD * 6.94;

        CurrencyConversionControl currencyConversionControl = new CurrencyConversionControl();
        currencyConversionControl.convertUsdToYuan(usdD);

        // return to previous view;
        return true;
    }

}
