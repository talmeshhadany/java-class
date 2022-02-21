/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.shapesandperimeters;

/**
 *
 * @author ta
 */
public abstract class Shape {
    String color;

    public Shape() {}
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String c){
        this.color=c;
    }
    
    abstract double getArea();
    abstract double getPerimeter();
}


