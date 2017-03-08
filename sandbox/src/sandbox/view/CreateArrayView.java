/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox.view;

import java.util.ArrayList;
import java.util.Scanner;
import sandbox.model.Item;

/**
 *
 * @author Alex
 */
public class CreateArrayView extends View {

    String[] chineseCities = {"北京 (Beijing)", "南京 (Nanjing)", "阳朔 (Yangshuo)", "上海 (Shanghai)"};

    public CreateArrayView() {
        super("\nHere are a few things I've been learning with Arrays, ArrayLists, and\n"
                + "enums. Choose one of the options to see how it works:\n\n"
                + "A: Create new Array\n"
                + "L: Create new ArrayList\n"
                + "E: Create new Enum\n"
                + "Q: Quit");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        boolean done = false;

//            System.out.println("\n\"A: Create new Array\\n\"\n"
//            + "L: Create new ArrayList\n"
//            + "E: Creae new Enum\n"
//            + "Q: Quit");
        switch (value) {
            case "A":
                this.createArray();
                break;

            case "L":
                this.addInventoryItems();
                break;

            default:
                System.out.println("\n*** Invalid: please choose an item from the list ***");
                break;
        }

        return false;
    }

    public boolean createArray() {
        boolean done = false;

        while (!done) {
//        System.out.println("\nThe array contains a list of Chinese cities. Which\n"
//                + "number in the list would you like to see?\n\n"
//                + "1 - First\n"
//                + "2 - Second\n"
//                + "3 - Third\n"
//                + "4 - Fourth\n"
//                + "5 - All List Items"
//                + "Q - Quit");

            System.out.println("\nEnter number of the list item you want to see disaplayed\n"
                    + "or enter 'A' to see all of them displayed.\n");

            Scanner keyboard = new Scanner(System.in);
            String value = keyboard.nextLine();
            value = value.toUpperCase();
            value = value.trim();

            if (value.length() < 0) {
                System.out.println("\n*** Invalid: value cannot be blank ***");
            } else if ("A".equals(value.toUpperCase())) {
                int i;

                for (i = 0; i < chineseCities.length; i++) {
                    System.out.println(chineseCities[i]);
                }
            } else if ("Q".equals(value.toUpperCase())) {
                return true;
            } else if (Integer.parseInt(value) >= 4) {
                System.out.println("\n*** Invalid: the array only has 4 items ***");
            } else {
                System.out.println("\nItem number " + value + " in the list is "
                        + chineseCities[Integer.parseInt(value)]);
            }
//            switch (value) {
//                case "1":
//                    this.displayFirstItem();
//                    break;
//
//                case "2":
//                    this.displaySecondItem();
//                    break;
//
//                case "3":
//                    this.displayThirdItem();
//                    break;
//
//                case "4":
//                    this.displayFourthItem();
//                    break;
//                    
//                case "5" : 
//                    this.displayAllCities();
//                    break;
//                    
//                case "Q":
//                    return true;
//
//                default:
//                    System.out.println("\n*** Invalid: please enter a valid value ***");
//                    break;
//            }
        }
        return false;
    }

    public void displayFirstItem() {
        System.out.println("\n" + chineseCities[0]);
    }

    public void displaySecondItem() {
        System.out.println("\n" + chineseCities[1]);
    }

    public void displayThirdItem() {
        System.out.println("\n" + chineseCities[2]);
    }

    public void displayFourthItem() {
        System.out.println("\n" + chineseCities[3]);
    }

    public void displayAllCities() {
        int i;

        for (i = 0; i < chineseCities.length; i++) {
            System.out.println(chineseCities[i]);
        }
    }

//    public void printHell() {
//        System.out.println("\nWhat the hell?");
//    }    
    public ArrayList<Item> addInventoryItems() {
        ArrayList<Item> inventory = new ArrayList<>();

        inventory.add(new Item("potion", "tool", 0));
        inventory.add(new Item("Wingardium Leviosa", "Spell", 2));
        inventory.add(new Item("Expelliarmus", "Spell", 5));
        inventory.add(new Item("Dungeon Key", "Key", 1));

        String potionDescription = inventory.get(0).getDescription();

        System.out.println(inventory.get(0).getDescription() + "\n"
                + inventory.get(1).getDescription() + "\n"
                + inventory.get(2).getDescription() + "\n"
                + inventory.get(3).getDescription());

        return inventory;
    }
}
