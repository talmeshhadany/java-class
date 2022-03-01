/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.studentquizgrades.ui;

import java.util.Scanner;

/**
 *
 * @author ta
 */
public class UserIOConsoleImpl implements UserIO{
   Scanner myScanner = new Scanner(System.in);
    
   public void print(String msg){
        System.out.println(msg);
    }
    @Override
    public String readString(String prompt){
        print(prompt);
        return myScanner.nextLine();
    }
    
    @Override
    public int readInt(String prompt){
        print(prompt);
        while(true){
            try {
                return Integer.parseInt(myScanner.nextLine());
            } catch (NumberFormatException e) {
                this.print("Try again, Please enter a number:");
            }
        }
    }
    
    @Override
    public int readInt(String prompt, int min, int max){
    //    print(prompt);
        int tmp;
        while(true){
           tmp =readInt(prompt);
           if (tmp>=min && tmp<=max) break;
           else
                System.out.println("Enter another number ? ");
        }
        return tmp;
    }
    
    @Override
    public double readDouble(String prompt){
        print(prompt);
        while(true){
            try {
                return Double.parseDouble(myScanner.nextLine());
            } catch (NumberFormatException e) {
                this.print("Try again, Please enter a number:");
            }
        }
    }
    
    @Override
    public double readDouble(String prompt, double min, double max){
    //    print(prompt);
        
        double tmp;
        while(true){
           tmp =readDouble(prompt);
           if (tmp>=min && tmp<=max) break;
           else
                System.out.println("Enter another number ? ");
        }
        return tmp;    
    }
    
    @Override
    public float readFloat(String prompt){
        print(prompt);
        while(true){
            try {
                return Float.parseFloat(myScanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Try again, Please enter a number:");
            }
        
        }
    }
    
    @Override
    public float readFloat(String prompt, float min, float max){
    //    print(prompt);
        float tmp;
        while(true){
           tmp =readFloat(prompt);
           if (tmp>=min && tmp<=max) break;
           else
                System.out.println("Enter another number ? ");
        }
        return tmp;    
    }
    
    @Override
    public long readLong(String prompt){
        print(prompt);
        while (true) {
            try {
                return Long.parseLong(myScanner.nextLine());            
            } catch (NumberFormatException e) {
                    System.out.println("Try again, Please enter a number:");    
            }
        }
    }
    
    @Override
    public long readLong(String prompt, long min, long max){
    //    print(prompt);
        long tmp;
        while(true){
           tmp =readLong(prompt);
           if (tmp>=min && tmp<=max) break;
           else
                System.out.println("Enter another number ? ");
        }
        return tmp;    
    } 
}
