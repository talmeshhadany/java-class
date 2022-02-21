/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.shapesandperimeters;

/**
 *
 * @author ta
 */
public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
   
    public void setLength(double l){
         this.length=l;
    }
    public double getLength(){
         return length;
    } 
    public void setWidth(double w){
         this.width=w;
    }
    public double getWidth(){
         return width;
    }
    
    @Override
    double getArea() {
        
        return length * width;
    }

    @Override
    double getPerimeter() {
        return (length + width)*2;    
    }
}