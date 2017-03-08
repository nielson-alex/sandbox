/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox.control;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class CurrencyConversionControl {
    DecimalFormat df = new DecimalFormat("#.00");

    Scanner inFile;
    
    public double convertUsdToYuan(double usdD) {
        
        if (usdD < 0) {
            return -1;
        }
        
        if (usdD > 10000000) {
            return -2;
        }
        
        double yuan = usdD * 6.94d;
        
        System.out.println("\n" + df.format(usdD) + " U.S. dollars is " + df.format(yuan)
                + " yuan.");
        
        return yuan;
    }
    
}
