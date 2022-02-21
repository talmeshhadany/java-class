/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.simplecalculator;

import java.util.*;

/**
 *
 * @author ta
 */
public class App {
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);
        System.out.println("Choose the operation:(1)Add (2)Sub (3)Multiply (4) "
            + "Divide (5)Exit ");
        int choice = Integer.parseInt(myScanner.nextLine());
        while(choice !=5){
            SimpleCalculator simpleCalc= new SimpleCalculator();
            System.out.println("Enter the first operand: ");
            double num1=Integer.parseInt(myScanner.nextLine());
            System.out.println("Enter the second operand: ");
            double num2=Integer.parseInt(myScanner.nextLine());

            switch (choice) {
                case 1: System.out.println("Result: " + simpleCalc.add(num1, num2));
                break;
                case 2: System.out.println("Result: " + simpleCalc.sub(num1, num2));
                break;
                case 3: System.out.println("Result: " + simpleCalc.multiply(num1, num2));
                break;
                case 4:System.out.println("Result: " + simpleCalc.divide(num1, num2));
                break;
                default:
                    throw new AssertionError();
            }
            
            System.out.println("Choose the operation:(1)Add (2)Sub (3)Multiply (4) "
            + "Divide (5)Exit ");
            choice = Integer.parseInt(myScanner.nextLine());
            
        }
    }        
}
    
