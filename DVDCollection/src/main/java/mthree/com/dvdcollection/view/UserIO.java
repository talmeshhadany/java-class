/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mthree.com.dvdcollection.view;

/**
 *
 * @author ta
 */
public interface UserIO {
    public void print(String prompt);
    public String readString(String prompt);
    
    public int readInt(String prompt, int min, int max);
    public int readInt(String prompt);
    
    public float readFloat(String prompt, float min, float max);
    public float readFloat(String prompt);
    
    public double readDouble(String prompt, double min, double max);
    public double readDouble(String prompt);
    
    public long readLong(String prompt, long min, long max);
    public long readLong(String prompt);
       
}
