
package mthree.com.Factorizer;

import java.util.Scanner;

/**
 *
 * @author ta
 */
public class Factorizer {
    private int numberOfFactors=1;
    private int number;
    private int sum=0;
    
    public Factorizer(int num){
        this.number=num;
    }
    
    public int getNumberIfFactor(){
        return numberOfFactors;
    }
    
    public int getSum(){
        return sum;
    }
      
    public void findFactors(int number){
    //    int numberOfFactors=1;
    //    int sum=0;
        for (int i = 1; i <= number/2; i++) {
            if(number%i==0){
                System.out.print(i+ " ");
                sum=sum+i;
                numberOfFactors++;
            }
        }
        System.out.println(number);
    }
}


