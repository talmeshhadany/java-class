
package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author ta
 */
public class StayPositive {
    public static void main(String[] args) {
        int num=10;
        System.out.println("Counting down ...");
        while(num >0)
            System.out.println(num--);
    }
    
}
