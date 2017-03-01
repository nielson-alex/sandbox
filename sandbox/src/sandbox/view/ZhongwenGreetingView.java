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
public class ZhongwenGreetingView {
    
    public void displayZhongwenGreetingView() {
    //prompt to enter amount of USD to convert to Euros
        System.out.println("\n你好！你叫什么名字？ ");

        // create an input file for the console
        Scanner inFile;
        inFile = new Scanner(System.in);

        // read the value of the next double typed into the console
        String name = inFile.nextLine();
        
        System.out.println("\n" + name + "我很高兴认识你！");
    }
}
