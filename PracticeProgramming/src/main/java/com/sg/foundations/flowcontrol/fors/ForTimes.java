
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author ta
 */
public class ForTimes {
    public static void main(String[] args) {
        System.out.println("Wich times table shall I recite?");
        Scanner myScanner=new Scanner(System.in);
        int num =myScanner.nextInt();
        for(int i=1;i<16;i++)
            System.out.println(i + " * " + num + " is: " + i * num );
        
    }
}
