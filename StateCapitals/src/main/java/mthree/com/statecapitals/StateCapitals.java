/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.statecapitals;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author ta
 */
public class StateCapitals {
    public static void main(String[] args) {
        HashMap<String, String> capStates=new HashMap<>();
        capStates.put("Alabama", "Montgomery");
        capStates.put("Alaska", "Juneau");
        capStates.put("Arisona", "Phoenix");
        capStates.put("Arkansaa", "Little Rock");
        
        System.out.println("States:");
        Set<String> keys = capStates.keySet();
        for(String k: keys)
            System.out.println(k);
        
        System.out.println();
        System.out.println("Capitals");
        for(String k: keys)
            System.out.println(capStates.get(k));
        
        System.out.println();
        System.out.println("State/ Capitals Pairs");
        for(String k: keys)
            System.out.println(k + " - "+ capStates.get(k));
        
        
    }
}
