/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.studentquizgrades.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author ta
 */
public class Student {
    private String firstName;
    private String lastName;
    private String studentId;
    // programming Language + cohort month/year
    private String cohort;
    private float[] quiz;
    private float quizAvg;
//    private HashMap<String, ArrayList<Float>> quiz;
    
    
    
    public Student(String studentId){
        this.studentId=studentId;
    }
    
    public void setQuiz(float [] quiz){
         this.quiz=quiz;
    //    Random rng= new Random();
    //    for (int i = 0; i < 10; i++) {
    //        this.quiz[i]=rng.nextFloat(100)+1;
    //    }
    }
    
    public float[] getQuiz(){
        return this.quiz;
    }
    
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
    
    public String getStudentId(){
        return this.studentId;
    }
    
    public void setCohort(String cohort){
        this.cohort=cohort;
    }
    public String getCohort(){
        return this.cohort;
    }
    
    public float getQuizAvg(){
        return this.quizAvg;
    }
    
    public void setQuizAvg(float quizAvg){
        this.quizAvg=quizAvg;
    }
}
