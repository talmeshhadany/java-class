/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author ta
 */
public class FruitsBasket {
    public static void main(String[] args) {
        String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
            "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
            "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
            "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
            "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
            "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
            "Dragonfruit", "Apple", "Orange", "Orange"};

        int numOranges = 0;
        int numApples = 0;
        int numOtherFruit = 0;

        int total=fruitBasket.length;
        for(int i=0;i<total;i++)
            switch(fruitBasket[i]){
                case "Apple":
                    numApples ++;
                    break;
                case "Orange":
                    numOranges ++;
                    break;
                default:
                    numOtherFruit ++;
            }
        System.out.println("Total# of Fruit in Basket: " + total);
        System.out.println("Number of Apples: " +numApples);
        System.out.println("Number of Oranges: " + numOranges);
        System.out.println("Number of Other Fruit: " +numOtherFruit);
        // Fruit counting code goes here!

        // Print The Results!

    }
    
}
