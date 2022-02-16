package com.mthree.windowmaster;
import java.util.*;

/**
 *
 * @author ta
 */
public class WindowMaster {
    public static void main(String args[]){
        // declare variables for height and width of  window
        float height = 0;
        float width=0;
        int numberOfWindow=0;
        float glassCostPerFoot=0;
        float trimCostPerFoot=0;
        float areaOfWindow=0;
                    
        //declare String variables to hold the user's height and width input
        
        String stringHeight = null;
        String stringWidth=null;
        String stringNumberOfWindow=null;
        String stringGlassCostPerFoot=null;
        String stringTrimCostPerFoot=null;
                            
        
        // declare other variables
        float totalCost, trimCost, windowCost ;
        float perimetreOfWindow;
        
        //declare and initialize the Scanner
        Scanner myScanner=new Scanner(System.in);
        
        //get input from the user
        try {
            System.out.println("Please enter window height:");
            stringHeight = myScanner.nextLine();
            height = Float.parseFloat(stringHeight);
            
        } catch(NumberFormatException ex){
             System.out.println("Input(height) could not be parsed into a Float");
        }
           
        try{
            
            System.out.println("Please enter window width:");
            stringWidth = myScanner.nextLine();
            width = Float.parseFloat(stringWidth);
            
        }catch(NumberFormatException ex){
            System.out.println("Input(width) could not be parsed into a Float");
            
        }
        
        try {
            System.out.println("Please enter the number of windows:");
            stringNumberOfWindow = myScanner.nextLine();
            numberOfWindow = Integer.parseInt(stringNumberOfWindow);
        
        }catch(NumberFormatException ex){
            System.out.println("Input(width) could not be parsed into a Float");
        }
        
        try{
            System.out.println("Please enter the glass cost per square foot:");
            stringGlassCostPerFoot = myScanner.nextLine();
            glassCostPerFoot = Float.parseFloat(stringGlassCostPerFoot);
        
        }catch(NumberFormatException ex){
            System.out.println("Input(glass Cost Per Foot) could not be parsed into a Float");
        }
        
        try{
            System.out.println("Please enter the trim cost for per foot:");
            stringTrimCostPerFoot = myScanner.nextLine();
            trimCostPerFoot = Float.parseFloat(stringTrimCostPerFoot);
        
        }catch(NumberFormatException ex){
            System.out.println("Input(trimCostPerFoot) could not be parsed into a Float");
        }
        
        // convert String values of height and width to float values
        
        //calculate the area of the window
        areaOfWindow = height * width;
        //calculate the oerimetre of window
        perimetreOfWindow = 2*(height + width);
        
        //calculate window cost, trim cost and the total cost
        windowCost = numberOfWindow * glassCostPerFoot * areaOfWindow; 
        trimCost = numberOfWindow * trimCostPerFoot * perimetreOfWindow;
        totalCost = windowCost + trimCost;
    
        //display the results to the user
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimetre = " + perimetreOfWindow);
        System.out.println("Trim cost = " + trimCost);
        System.out.println("Window cost = " + windowCost);
        System.out.println("Total cost = " + totalCost);
    }
    
}
