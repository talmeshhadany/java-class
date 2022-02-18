/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

/**
 *
 * @author ta
 */
public class LazyTeenager {
    public static void main(String[] args) {
        Random rng=new Random();
        int chance=0;
        int times=1;
        do {            
            System.out.println("Clean your room!! (X" + times + ")" );
            if(times >6){
                System.out.println("That's IT, I'm doing it!!! YOU'RE GROUNDED "
                        + "AND I'M TAKING YOUR XBOX!");
                break;
            }
            else{
                
                chance +=rng.nextInt(times++ *10);
        //        System.out.println("chance= " + chance);
            }
        } while (chance <100);
    }
    
}
