/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author ta
 */
public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        System.out.println("Wich times table shall I recite?");
        Scanner myScanner=new Scanner(System.in);
        int num =myScanner.nextInt();
        for(int i=1;i<num;i++)
            if(i%3==0) 
                System.out.println("fizz");
            else if(i%5==0)
                System.out.println("buzz");
            else if (i%15==0)
                System.out.println("fizz buzz");
            else
                System.out.println(i);
            
        System.out.println("TRADITION!!!!");
            
            
            
        
    }
}
