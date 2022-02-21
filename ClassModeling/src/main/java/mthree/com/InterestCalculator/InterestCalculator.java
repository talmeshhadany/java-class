/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.InterestCalculator;

import java.util.Scanner;

/**
 *
 * @author ta
 */
public class InterestCalculator {
    private float principle;
    private int years;
    private float annualInterest;
    private int inyerestType;
    private float earned=0;
    
    public InterestCalculator(){}
    public InterestCalculator(float princip, int y, float interest, int interestType){
        this.principle=princip;
        this.years=y;
        this.annualInterest=interest;
        this.inyerestType=interestType;
    }
    
    public float getPrinciple(){
        return principle;
    }
    public void setPrinciple(float principe){
        this.principle=principe;
    }
    
    public int getYears(){
        return years;
    }
    public void setYears(int y){
        this.years=y;
    }
    public float getAnnualInterest(){
        return annualInterest;
    }
    public void setAnnualInterest(float interest){
        this.annualInterest=interest;
    }
    public int getInterestType(){
        return inyerestType;
    }
    public void setInterestType(int type){
        this.inyerestType=type;
    }
    public float getEarned(){
        return earned;
    }
    public void setEarned(float earned){
        this.earned=earned;
    }
    
    public void earnInterestPerPeriod(int period){
        
        for (int j = 0; j < period; j++) {
            float earned=0;
            earned += principle *(annualInterest/(period*100));
            principle +=earned;
        }
    }
 
    public void earnedPerType(int interestType){
        switch(interestType){
                case 1:
                    this.earnInterestPerPeriod(365);
                    break;
                case 2:
                    this.earnInterestPerPeriod(12);
                    break;
                case 3:
                    this.earnInterestPerPeriod(4);
                    break;
                case 4:
                    this.earnInterestPerPeriod(2);
                    break;
                case 5:
                    this.earnInterestPerPeriod(1);
                    break;
                
            }
    }

    public void earnedPerYear(int year){
        System.out.println("Year " + year + ":");
        System.out.println("Begin with $" + principle);
        earnedPerType(inyerestType);
        System.out.println("Earned: " + earned);
        System.out.println("Ended with: " + principle);
    }    
}
