/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.InterestCalculator;

import java.util.Scanner;

/**
 *
 * @author ta
 */
public class App {
    public static void main(String[] args) {
        Scanner myScanner= new Scanner((System.in));
        System.out.println("How much do you want to invest?");
        float principle = myScanner.nextFloat();
        System.out.println("How many years are investing?");
        int years = myScanner.nextInt();
        System.out.println("What is the annual interest rate % growth?");
        float annualInterest = myScanner.nextFloat();
        
        System.out.println("What is the type of interest compound periods:(1) daily,"
                + " (2) monthly (3) quarterly (4) bi-annually or (5) annually?");
        int interestType = myScanner.nextInt();
        InterestCalculator InterestCalc = new InterestCalculator(principle, 
                years, annualInterest, interestType);
   
        for (int i = 1; i < years+1; i++) {
            InterestCalc.earnedPerYear(i);
        }
    }
    
}
