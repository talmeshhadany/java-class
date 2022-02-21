/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ta
 */
public class GuessMeMore {
    public static void main(String[] args) {
        Random rng=new Random();
        Scanner inputScanner= new Scanner(System.in);
        
        int number=rng.nextInt(200) + (-100);
        int yourChoce;
        System.out.print("I have chosen a number, ");
        System.out.println("can you quess it: ");
        for(int i=0;i<10;i++){
            yourChoce = inputScanner.nextInt();
            System.out.println("Your chois is " + yourChoce);
            if (yourChoce == number){
                System.out.println("Wow, nice quest! that was it!");
                break;
            }
            else if (yourChoce < number)
                System.out.println(yourChoce + "? Ha, nice try - too low! Try again");
            else
                System.out.println(yourChoce + "? Too bad, way too high, Tray again");
        }
        
        
    }
    
}
