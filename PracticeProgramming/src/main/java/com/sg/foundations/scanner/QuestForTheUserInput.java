package com.sg.foundations.scanner;
import java.util.Scanner;

/**
 *
 * @author ta
 */
public class QuestForTheUserInput {
    public static void main(String args[]){
        Scanner inputReader = new Scanner(System.in);
        
        String yourName;
        String yourQuest;
        double velocityOfSwallow;
        
        // We can use the Scanner's readline to assign value to our string
        // because its return type is string
        System.out.println("What is your name??");
        yourName = inputReader.nextLine();
        
        System.out.println("What is your quest??");
        yourQuest = inputReader.nextLine();
        
        // When we get to our double data type, we can use Scanner's nextDouble
        // method or we can use the Double.parseDouble to convert the 
        // nextLine's String
        System.err.println("What is the airspeed velocity of an unladen swallow?!?!");
        velocityOfSwallow = Double.parseDouble(inputReader.nextLine());
        System.err.println();
        System.err.println("How do you know " + velocityOfSwallow + "is correct, " + yourName + "?");
        System.err.println("You didn't even know if the swallow was African or European!");
        System.err.println("Maybe skip answering things about birds and instead go " + yourQuest + ".");
        
    }
    
}
