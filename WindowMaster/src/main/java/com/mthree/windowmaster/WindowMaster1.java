package com.mthree.windowmaster;
import java.util.*;

/**
 *
 * @author ta
 */
public class WindowMaster1 {
    public static void main(String args[]){
        // declare variables for height and width of  window
        float height;
        float width;
        int numberOfWindow;
        float glassCostPerFoot;
        float trimCostPerFoot;
        float areaOfWindow;
                    
        //declare String variables to hold the user's height and width input
        
        String stringHeight;
        String stringWidth;
        String stringNumberOfWindow;
        String stringGlassCostPerFoot;
        String stringTrimCostPerFoot;
                            
        
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
            
       
            
            System.out.println("Please enter window width:");
            stringWidth = myScanner.nextLine();
            width = Float.parseFloat(stringWidth);
        
       
            System.out.println("Please enter the number of windows:");
            stringNumberOfWindow = myScanner.nextLine();
            numberOfWindow = Integer.parseInt(stringNumberOfWindow);
        
            System.out.println("Please enter the glass cost per square foot:");
            stringGlassCostPerFoot = myScanner.nextLine();
            glassCostPerFoot = Float.parseFloat(stringGlassCostPerFoot);
        
            System.out.println("Please enter the trim cost for per foot:");
            stringTrimCostPerFoot = myScanner.nextLine();
            trimCostPerFoot = Float.parseFloat(stringTrimCostPerFoot);
                
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
        }catch(NumberFormatException ex){
            System.out.println("Input could not be parsed into a Float");
        }
    }
    
}
