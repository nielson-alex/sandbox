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
    private String menu;
    //private String promptMessage;

    public ZhongwenGreetingView() {
        this.menu = "\n你好！这儿有联系中文的机会。开始以前，请告诉我你叫什么姓名?\n\n"
                + "（为了取消，请打‘Q’）";
    }

    public void displayZhongwenGreetingView() {
        boolean done = false;

        do {
            String chineseName = this.getChineseName();
            if (chineseName.toUpperCase().equals("Q")) {
                return;
            }
            done = this.doAction(chineseName);
        } while (!done);
    }

    String getChineseName() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard 
        String value = ""; //value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) {
            System.out.println("\n" + this.menu);

            value = keyboard.nextLine();

            if (value.length() < 1) {
                System.out.println("\nTry again. Name cannot be"
                        + "\nless than one characer.");
                continue;
            }
            break;
        }

        return value;
    }

    boolean doAction(String chineseName) {//prompt to greet user in Chinese and get their name
        System.out.println("\n" + chineseName + "我很高兴认识你！");

        return false;
    }
}
