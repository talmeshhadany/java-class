/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CumulativeActivities;

import java.util.Scanner;

/**
 *
 * @author ta
 */
public class Factorizer {
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);
        System.out.println("What number would you like to factor? ");
        int sum=0;
        int numberOfFactors=1;
        int number= myScanner.nextInt();
        for (int i = 1; i <= number/2; i++) {
            if(number%i==0){
                System.out.print(i+ " ");
                sum=sum+i;
                numberOfFactors++;
            }          
        }
        System.out.println();
        System.out.println("Number of factors: " + numberOfFactors); 
        if(sum==number)
            System.out.println(number+ " is a perfect number");
        else if (sum ==1)
            System.out.println(number+ " is a prime number");
        else
            System.out.println(number+ " is not a perfect number nor prime number");
        
        
    }
}


