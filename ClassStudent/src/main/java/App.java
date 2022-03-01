
import java.awt.AWTEventMulticaster;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ta
 */
public class App {
    public static void main(String[] args)  {
        boolean flag=true;
        Scanner myScanner = new Scanner(System.in);
        
        while(flag){
            System.out.println("main Menu");
            System.out.println("1. List Student IDs");
            System.out.println("2. Create New Student");
            System.out.println("3. View a Student");
            System.out.println("4. Remove a Student");
            System.out.println("5. Exit");
            
            int choice = myScanner.nextInt();
            switch(choice){
                case 1: addNewStudent();
                    breaks;
                case 2:
                                
            
            
            }
        
        
        }
        
        
        
         
        HashMap<String, Student> Students= new HashMap<>();
        
        Students.put(student.getStudentID(), student);
        
    }
    public void addNewStudent(){
        System.out.println("Enter a new Student ID: ");
        Student student = new Student(myScanner.nextLine());
        System.out.println("Enter the first name: ");
        student.setFirstName(myScanner.nextLine());
        System.out.println("Enter the last name: ");
        student.setLastName(myScanner.nextLine());
        System.out.println("Enter the cohort: ");
        student.setCohort(myScanner.nextLine());
    
    }
    
    public void marshalling(Student student)throws IOException{
 
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
        String studentString=Student.
        out.println("this is a line in my file...");
        out.println("a second line in my file...");
        out.println("a third line in my file...");
        out.flush();
        out.close(); 
 
    }
    
    public readStudent(){
        Scanner sc = new Scanner(
        new BufferedReader(new FileReader("OutFile.txt")));
        // go through the file line by line
        while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            System.out.println(currentLine);
        }
    }
}
