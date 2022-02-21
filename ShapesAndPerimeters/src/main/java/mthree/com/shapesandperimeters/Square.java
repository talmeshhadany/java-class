/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.shapesandperimeters;

/**
 *
 * @author ta
 */
class Square extends Shape{

    private double side;

    public Square(double side) {
        this.side = side;
    }
    
    
    public void setSide(double s){
         this.side=s;
    }
    public double getSide(){
         return side;
    } 
     
    @Override
    double getArea() {
        
        return side * side;
    }

    @Override
    double getPerimeter() {
        return side *4;    
    }
}
