/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 *
 * @author ta
 */
public class ALittleChaos {
    public static void main(String[] args) {

        Random randomizer = new Random();

        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());

        int num = randomizer.nextInt(100);

        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");

        System.out.print(randomizer.nextInt(101) + ", ");  
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101));
        
        // if we use randomizer.Next(51) + 50, the results will be between 50
        // and 100 
        System.out.println();
        System.out.print(randomizer.nextInt(51)+ 50 + ", ");
        System.out.print(randomizer.nextInt(51)+ 50 + ", ");
        System.out.print(randomizer.nextInt(51)+ 50 + ", ");
        System.out.print(randomizer.nextInt(51)+ 50 + ", ");
        System.out.print(randomizer.nextInt(51)+ 50 + ", ");
        System.out.print(randomizer.nextInt(51)+ 50);
        // Yes we can use random in math, it still a number
        System.out.println();
        System.out.print((randomizer.nextInt(51)+ 50) + (randomizer.nextInt(51)
                + 50) + ", ");
        // for Double number, it looks like 82.95284684673427, 50.44935004800746,
        // 62.30678487241831, 72.7923666842514, 79.56207824437018, 
        // 97.94883136071886
        
        System.out.println();
        System.out.print(randomizer.nextDouble(51)+ 50 + ", ");
        System.out.print(randomizer.nextDouble(51)+ 50 + ", ");
        System.out.print(randomizer.nextDouble(51)+ 50 + ", ");
        System.out.print(randomizer.nextDouble(51)+ 50 + ", ");
        System.out.print(randomizer.nextDouble(51)+ 50 + ", ");
        System.out.print(randomizer.nextDouble(51)+ 50);
        
        // for Boolean : false, false, true, true, false
        System.out.println();
        System.out.print(randomizer.nextBoolean() + ", ");
        System.out.print(randomizer.nextBoolean() + ", ");
        System.out.print(randomizer.nextBoolean() + ", ");
        System.out.print(randomizer.nextBoolean() + ", ");
        System.out.print(randomizer.nextBoolean());
        
        
    }
}
