/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

/**
 *
 * @author ta
 */
public class BarelyControlledChaos {
    public static void main(String[] args) {

        String color = choseColor(); // call color method here
        String animal = choseAnimal(); // call animal method again here
        String colorAgain = choseColor(); // call color method again here
        int weight = choseNumber(5,200); // call number method,
            // with a range between 5 - 200
        int distance = choseNumber(10,20); // call number method,
            // with a range between 10 - 20
        int number = choseNumber(10000, 20000); // call number method,
            // with a range between 10000 - 20000
        int time = choseNumber(2,6); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }

    public static String choseColor(){
    String[] arr_color={"Red","Blue","Yellow","Green","Black","White"};
        Random rng=new Random();
        return  arr_color[rng.nextInt(7)];
    }
    
    public static String choseAnimal(){
    String[] arr_animal={"Bird","Eagle","Oie","Fox","Cow","Snake"};
        Random rng=new Random();
        return  arr_animal[rng.nextInt(7)];
    }
    
    public static int choseNumber(int min, int max){
        Random rng=new Random();
        return  (rng.nextInt(max-min)+min);
    }// ??? Method 3 ???
}
