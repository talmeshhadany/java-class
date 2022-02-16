
package com.mthree.adder;
import java.util.*;

/**
 *
 * @author thamer AL-Meshhadany
 * email:talmeshhadany@hotmail.com
 */
public class Adder_ver2 {
    public static void main(String args[]){
        int sum=0;
        int operand1=3;
        int operand2=2;
        
        Scanner myScanner=new Scanner(System.in);
        
        String stringOperand1="";
        String stringOperand2="";

        System.out.println("Please enter the first number to be added:");
        stringOperand1=myScanner.nextLine();
        
        System.out.println("Please enter the second number to be added:");
        stringOperand2=myScanner.nextLine();
        
        operand1=Integer.parseInt(stringOperand1);
        operand2=Integer.parseInt(stringOperand2);
        
        sum = operand1 + operand2;
        System.out.println("Sum is: " + sum);
    }
}
