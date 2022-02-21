/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.shapesandperimeters;

/**
 *
 * @author ta
 */
public class Triangle extends Shape{
    private double lateral;

    public Triangle(double lateral) {
        this.lateral = lateral;
    }

    
    public void setLateral(double l){
         this.lateral=l;
    }
    public double getLateral(){
         return lateral;
    } 
    
    @Override
    double getArea() {
        
        return (Math.sqrt(3)/4)* lateral *lateral;
    }

    @Override
    double getPerimeter() {
        return lateral * 3;    
    }
}
