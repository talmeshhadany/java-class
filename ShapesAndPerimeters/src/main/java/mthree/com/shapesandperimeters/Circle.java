/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.shapesandperimeters;

/**
 *
 * @author ta
 */
public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public void setSide(double s){
         this.radius=s;
    }
    public double getSide(){
         return radius;
    } 
     
    @Override
    double getArea() {
        
        return radius * radius *Math.PI;
    }

    @Override
    double getPerimeter() {
        return 2 * radius * Math.PI;    
    }
}
