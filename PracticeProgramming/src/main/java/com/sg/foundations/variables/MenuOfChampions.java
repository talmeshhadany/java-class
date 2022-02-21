/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.variables;

/**
 *
 * @author ta
 */
public class MenuOfChampions {
    public static void main(String args[]){
    String food1, food2, food3;
    double food1Price, food2Price, food3Price;
    food1="PIZZA SLIDERS";//12.99  
    food1Price = 12.99;
    food2="POKE SHRIMP";  //14.49
    food2Price =14.49;
    food3="NIJI"; // 7.99
    food3Price= 7.99;
        
    System.out.println("#####################################################");
    System.out.println("##                                                 ##");
    System.out.println("##      Welcome to resturant Suhi 1000 nights      ##");
    System.out.println("##                  Today's Menu                   ##");
    System.out.println("##                                                 ##");
    System.out.println("#####################################################");
    System.out.println();
    System.out.println(String.format("%1$-8s %2$38.2f", food1, food1Price) + "$");    
    System.out.println(String.format("%1$-8s %2$40.2f", food2, food2Price) + "$");
    System.out.println(String.format("%1$-8s %2$43.2f", food3, food3Price) + "$");
    }
    
}
