/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CumulativeActivities;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ta
 */
public class LuckySevens {
    public static void main(String[] args) {
        System.out.println("How many dollars do you have?");
        Scanner myScanner= new Scanner(System.in);
        int bet=myScanner.nextInt();
        int maxBet=100;
        Random rng=new Random();
        int roll=0;
        int rollsMax=0;
        int dice1,dice2;
        while(bet>0){
            roll++;
            dice1= 1+rng.nextInt(6);
            dice2= 1+rng.nextInt(6);
    //        System.out.println("dice1: " + dice1);
    //        System.out.println("dice2: " + dice2);
            
            if((dice1 + dice2) == 7){
        //        System.out.println("dice1 + dice2 = " + (dice1 + dice2));
                bet +=4;
                if(bet>maxBet){
                    maxBet=bet;
                    rollsMax=roll;
                }    
            }else
                bet -=1;
        }
        System.out.println("You are broke after " + roll + " rolls.");
        System.out.println("You should have quit after " + rollsMax + " rolls "
                + "when you had $" + maxBet + ".");
    }
}
