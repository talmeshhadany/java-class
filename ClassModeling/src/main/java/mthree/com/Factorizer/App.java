/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.Factorizer;

import java.util.Scanner;

/**
 *
 * @author ta
 */
public class App {
    public static void main(String[] args) {
         Scanner myScanner= new Scanner(System.in);
        System.out.println("What number would you like to factor? ");
        int number= myScanner.nextInt();
        
        Factorizer factor = new Factorizer(number);
        factor.findFactors(number);
        
        int numberOfFactors=factor.getNumberIfFactor();
        int sum=factor.getSum();
        
    //    System.out.println();
        System.out.println("Number of factors: " + numberOfFactors); 
        if(sum==number)
            System.out.println(number+ " is a perfect number");
        else if (sum ==1)
            System.out.println(number+ " is a prime number");
        else
            System.out.println(number+ " is not a perfect number nor prime number");
    }
    
}
