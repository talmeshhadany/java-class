/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.arrays;

import java.util.Random;

/**
 *
 * @author ta
 */
public class HiddenNuts {
    public static void main(String[] args) {

        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");
        int count=0;    
        while(count <hidingSpots.length){
            if(hidingSpots[count] =="Nut"){
                System.out.println("The Nut has been hidden ...");
                System.out.println("Found it! It's in spot# "+ count);
                break;
            }
            count++;
        }
    }
}
