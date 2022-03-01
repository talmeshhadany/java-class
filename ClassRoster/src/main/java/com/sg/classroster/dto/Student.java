/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.classroster.dto;

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
    
    public Student(String studentId){
        this.studentId=studentId;
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
}
