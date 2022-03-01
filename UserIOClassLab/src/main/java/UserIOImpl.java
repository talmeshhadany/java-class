
import com.sun.source.tree.BreakTree;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ta
 */



public class UserIOImpl implements UserIO{
    Scanner myScanner = new Scanner(System.in);
    public void print(String msg){
        System.out.println(msg);
    }
    
    public String readString(String prompt){
        print(prompt);
        return myScanner.nextLine();
    }
    
    public int readInt(String prompt){
        print(prompt);
        return Integer.parseInt(myScanner.nextLine());
    }
    
    public int readInt(String prompt, int min, int max){
    //    print(prompt);
        int tmp;
        while(true){
           tmp =readInt(prompt);
           if (tmp>=min && tmp<=max) break;
           else
                System.out.println("Enter another number ? ");
        }
        return tmp;
    }
    
    
    public double readDouble(String prompt){
        print(prompt);
        return Double.parseDouble(myScanner.nextLine());
    }
    
    public double readDouble(String prompt, double min, double max){
    //    print(prompt);
        double tmp;
        while(true){
           tmp =readDouble(prompt);
           if (tmp>=min && tmp<=max) break;
           else
            System.out.println("Enter another number ? ");
        }return tmp;
    }
    
    public float readFloat(String prompt){
        print(prompt);
        return Float.parseFloat(myScanner.nextLine());
    }
    
    public float readFloat(String prompt, float min, float max){
    //    print(prompt);
        float tmp;
        
        while(true){
           tmp= readFloat(prompt);
           if (tmp>=min && tmp<=max) break;
           else
            System.out.println("Enter another number ? ");
        }return tmp;
     }
    
    
    public long readLong(String prompt){
        print(prompt);
        return Long.parseLong(myScanner.nextLine());
    }
    
    public long readLong(String prompt, long min, long max){
    //    print(prompt);
        long tmp;
        while(true){
           tmp= readLong(prompt);
            if (tmp>=min && tmp<=max) break;
           else
            System.out.println("Enter another number ? ");
        }
        return tmp;
    }
}
