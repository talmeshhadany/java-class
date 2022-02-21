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
public class MiniMadLibs {
    public static void main(String[] args) {
        String stringNoun1,stringNoun2,stringPluralNoun1, stringPluralNoun2;
        String stringPluralNoun3,stringVerbPresent, stringVerbPast;
        String stringNumber, stringAdjactive1, stringAdjactive2;
        int number;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Let's play MAD LIBS!");
        System.out.println("I need a noun:");
        stringNoun1 = inputReader.nextLine();
        
        System.out.println("Now an adjactive:");
        stringAdjactive1 = inputReader.nextLine();
        
        System.out.println("Another noun: ");
        stringNoun2 = inputReader.nextLine();
        
        System.out.println("And a number: ");
        stringNumber = inputReader.nextLine();
        number =Integer.parseInt(stringNumber);
        
        System.out.println("Another Adjactive: ");
        stringAdjactive2 = inputReader.nextLine();
        
        System.out.println("A plural noun: ");
        stringPluralNoun1 = inputReader.nextLine();
        
        System.out.println("Another one: ");
        stringPluralNoun2 = inputReader.nextLine();
        
        System.out.println("one more: ");
        stringPluralNoun3 = inputReader.nextLine();
        
        System.out.println("A verb (Infinitive form): ");
        stringVerbPresent = inputReader.nextLine();
        
        System.out.println("Same verb (past participle): ");
        stringVerbPast = inputReader.nextLine();
        
        System.out.println("*** NOW LETS GET MAD (libs) ***");
        System.out.println(stringNoun1 + " : " + "the " + stringAdjactive1 +
                " frontier. These are the " + "voyages of the starship " +
                stringNoun2 + ". Its " + stringNumber + "-year mission: to "
                + "explore strange " + stringAdjactive2 + " " + stringPluralNoun1 
                + ", to seek out " + stringAdjactive2 + " " + stringPluralNoun2 
                + " and " + stringAdjactive2 + " " +stringPluralNoun3 + 
                ", to boldly " + stringVerbPresent + " where no one has " + 
                stringVerbPast + " before.");
        
        
    }
}
