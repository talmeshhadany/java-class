/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.classmodeling;

/**
 *
 * @author ta
 */
public class House3DDesign {
   private double area;
   private String direction;
   private double height;
   private double length;
   private double width;
   private int numberOfFlours;
   private int numberOfBedroom;
   private int numberOfToilets;
   public House3DDesign(){}
   public double getArea(){
       return area;
   }
   public void getArea(double areaObject){
       this.area=areaObject;
   }
   public String getDirection(){
       return direction;
   }
   public void getDirection(String directionObject){
       this.direction=directionObject;
   }
   public double getHeight(){
       return height;
   }
   public void getDirection(double heightObject){
       this.height=heightObject;
   }
   public double getLength(){
       return length;
   }
   public void getLength(double lengthObject){
       this.length=lengthObject;
   }
   public double getWidth(){
       return width;
   }
   public void getWidth(double widthObject){
       this.width=widthObject;
   }
   public int getNumberOfFlours(){
       return numberOfFlours;
   }
   public void setNumberOfFlours(int numberOfFloursObj){
       this.numberOfFlours=numberOfFloursObj;
   }
   public int getNumberOfBedroom(){
       return numberOfBedroom;
   }
   public void setNumberOfBedroom(int numberOfBedroomObj){
       this.numberOfBedroom=numberOfBedroomObj;
   }
   public int getNumberOfToilets(){
       return numberOfToilets;
   }
   public void setNumberOfToilets(int numberOfToiletsObj){
       this.numberOfToilets=numberOfToiletsObj;
   }
   
}
