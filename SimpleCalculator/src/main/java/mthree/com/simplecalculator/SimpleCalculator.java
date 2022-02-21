/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.simplecalculator;

/**
 *
 * @author ta
 */
public class SimpleCalculator {
    public SimpleCalculator(){};
    
    public double add(double num1, double num2){
        return num1+num2;
    }
    public double sub(double num1, double num2){
        return num1-num2;
    }
    public double multiply(double num1, double num2){
        return num1*num2;
    }
    public double divide(double num1, double num2){
        double result=0;
        try {
                result= num1/num2;
        } catch (Exception e) {
            System.out.println("we can't divide by zero");
        }
        return result;
    }
}
