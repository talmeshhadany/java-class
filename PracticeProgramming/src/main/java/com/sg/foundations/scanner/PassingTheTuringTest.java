/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author ta
 */
public class PassingTheTuringTest {
    public static void main(String args[]){
        Scanner inputReader = new Scanner(System.in);
        
        String yourName, color, food;
        String myName="thamer", myColor= "Yellow";
        int coolNumber, mynumber=100;
    //    double velocityOfSwallow;
        
        // We can use the Scanner's readline to assign value to our string
        // because its return type is string
        System.out.println("Hello there!");
        System.out.println("What is your name?");
        yourName = inputReader.nextLine();
        System.out.println("Hi," + yourName + "! " + "I'm " + myName + ".");
        
        System.out.println("What is your favorite color?");
        color = inputReader.nextLine();
        System.out.println("Huh, " + color + "? Mine's is " + myColor + ".");
        
        System.out.println("What's your favorate fruit, " + yourName);
        food = inputReader.nextLine();
        System.out.println("Really? " + food + " ? " +"I like this fruit too.");
        
        System.out.println("What's your cool number?");
        coolNumber = Integer.parseInt(inputReader.nextLine());
        
        System.out.println(coolNumber + " is a cool number. Mine's " + mynumber + ".");
        System.out.println("Did you know " + coolNumber + "*" + mynumber + " is " + coolNumber * mynumber + ".");
        System.out.println("Well, thanks for talking to me, " + yourName + "!");
        
        
        // When we get to our double data type, we can use Scanner's nextDouble
        // method or we can use the Double.parseDouble to convert the 
        // nextLine's String
      //  System.err.println("What is the airspeed velocity of an unladen swallow?!?!");
     //   velocityOfSwallow = Double.parseDouble(inputReader.nextLine());
     //   System.err.println();
     //   System.err.println("How do you know " + velocityOfSwallow + "is correct, " + yourName + "?");
     //   System.err.println("You didn't even know if the swallow was African or European!");
     //   System.err.println("Maybe skip answering things about birds and instead go " + yourQuest + ".");
        
    }
}
