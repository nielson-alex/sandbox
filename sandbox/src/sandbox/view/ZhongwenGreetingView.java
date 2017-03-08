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
public class ZhongwenGreetingView extends View {

    public ZhongwenGreetingView() {
        super("\n你好！这儿有联系中文的机会。"
                + "（为了继续请打‘C’，为了取消请打‘Q’）");
    }

    @Override
    public boolean doAction(String value) {//prompt to greet user in Chinese and get their name
        value = value.toUpperCase();
        boolean done = false;

        while (!done) {
            System.out.println("\n" + value + "请告诉我你叫什么姓名?\n！");

            if (value.length() < 1) {
                System.out.println("\n*** Invalid: value cannot be blank ***");
            } else if ("Q".equals(value.toUpperCase())) {
                return true;
            }

            System.out.println("\n" + value + "你好！我很高兴认识你");

            return false;
        }
        return false;
    }

    public String getAge() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard 
        String value = ""; //value to be returned
        boolean valid = false; // initialize to not valid

        String askAge = "\n好的。那你多大？";

        while (!valid) {
            System.out.println(askAge);

            value = keyboard.nextLine();

            double askAgeD = Double.parseDouble(value);

            if (askAgeD < 1) {
                System.out.println("\nYour age cannnot be less than one character.");
                continue;
            }
            break;
        }
        return value;
    }

    public boolean displayAge(double askAgeD) {
        boolean done = false;

        System.out.println("\nso you are" + askAgeD + " years old?");

        return false;

    }
}
