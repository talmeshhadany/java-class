/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.shapesandperimeters;

/**
 *
 * @author ta
 */
public class App {
    public static void main(String[] args) {
        Square sq=new Square(10);
        Rectangle rct= new Rectangle(10, 5);
        Circle cleCircle= new Circle(5);
        Triangle triangle= new Triangle(5);
                
        sq.color="Red";
        System.out.println("Area of square : " + sq.getArea());
        System.out.println("Perimetre of square : " + sq.getPerimeter());

        rct.color="Blue";
        System.out.println("Area of rectangle : " + rct.getArea());
        System.out.println("Perimetre of rectangle : " + rct.getPerimeter());
        
        cleCircle.color="Red";
        System.out.println("Area of Circle : " + cleCircle.getArea());
        System.out.println("Perimetre of circle : " + cleCircle.getPerimeter());
        
        triangle.color="Red";
        System.out.println("Area of triangle : " + triangle.getArea());
        System.out.println("Perimetre of triangle : " + triangle.getPerimeter());
    }
}
