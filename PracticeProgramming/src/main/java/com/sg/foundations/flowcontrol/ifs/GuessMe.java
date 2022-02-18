/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author ta
 */
public class GuessMe {
    public static void main(String[] args) {
        Scanner inputScanner= new Scanner(System.in);
        
        int number=10;
        int yourChoce;
        System.out.print("I have chosen a number, ");
        System.out.println("can you quess it: ");
        yourChoce = inputScanner.nextInt();
        System.out.println("Your chois is " + yourChoce);
        if (yourChoce == number)
            System.out.println("Wow, nice quest! that was it!");
        else if (yourChoce < number)
            System.out.println(yourChoce + "? Ha, nice try - too low! I chose #");
        else
            System.out.println(yourChoce + "? Too bad, way too high, I chose #");
        
        
    }
    
}
