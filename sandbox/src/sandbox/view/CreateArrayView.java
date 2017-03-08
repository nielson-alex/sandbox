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
class CreateArrayView {
    
    public void displayCreateArrayView() {
        String [] chineseCities = {"Beijing", "Nanjing", "Yangshuo", "Shanghai"};
        
        System.out.println("\n" + chineseCities[1]);
        
//        this.printHell();
        this.addInventoryItems();
//    ArrayList<Item> items;
//    new ArrayList<Item>();
    }
    
//    public void printHell() {
//        System.out.println("\nWhat the hell?");
//    }    
        
    public ArrayList<Item> addInventoryItems( ) {
        ArrayList<Item> inventory = new ArrayList<>();
        
        inventory.add(new Item("potion", 0));
        
        Item potion = inventory.get(0);
        potion.setDescription("potion");
        
        System.out.println(potion.getDescription());
        
        
        return inventory;
    }   
}
