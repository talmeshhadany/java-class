/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.studentquizgrades.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mthree.com.studentquizgrades.dto.Student;

/**
 *
 * @author ta
 */
public class StudentQuizGradesView {
//   private UserIO io= new UserIOConsoleImpl();
   private UserIO io;
   
   public StudentQuizGradesView(UserIO io){
       this.io=io;
   }
   
   public int printMenuAndGetSelection(){
            io.print("main Menu");
            io.print("1. List Student IDs");
            io.print("2. Create New Student");
            io.print("3. View a Student");
            io.print("4. Remove a Student");
            io.print("5. View a list of quiz scores for a student");
            io.print("6. View the average for a student");
            io.print("7. View the average for a Class");
            io.print("8. View the Highest score for a student");
            io.print("9. View the Lowest quiz score for a student");
            io.print("10. Exit");
            
            return io.readInt("Please select from the above choices.", 1, 10); 
   }
   public Student getNewStudentInfo(){
       String studentID = io.readString("Please enter Student ID");
       String firstName = io.readString("Please enter your First Name");
       String lasttName = io.readString("Please enter your Last Name");
       String cohort = io.readString("Please enter your cohort");
       float[] quiz = new float[5];
       for (int i = 0; i < 5; i++) {
        quiz[i] = io.readFloat("Please enter your Quiz " + (i+1) + " grade between 0 and 100", 0, 100);       
       }
       Student currentStudent = new Student(studentID);
       currentStudent.setFirstName(firstName);
       currentStudent.setLastName(lasttName);
       currentStudent.setCohort(cohort);
       currentStudent.setQuiz(quiz);
       return currentStudent;
   }
   public void displayCreateStudentBanner(){
       io.print("=== Create Student ===");
   }
   public void displayCreateSuccessBanner(){
       io.readString("Student successfully created. Please hit enter to continue");
   }
   
   public void displayStudentList(List<Student> studentList){
       for (Student currentStudent : studentList) {
           String studentInfo = String.format("#%s : %s %s", 
                   currentStudent.getStudentId(),
                   currentStudent.getFirstName(),
                   currentStudent.getLastName());
           io.print(studentInfo);
           }
       io.print("Please hit enter to continue");
   }
   
   
   
   public void displayAllBanner(){
       io.print("=== Display All Students ===");
   }
   public void displayDisplayStudentBanner(){
       io.print("=== Display Student===");
   }
   public void displayDisplayStudentQuizBanner(){
       io.print("=== Display Student Quiz Grades===");
   }
   
   public void displayDisplayStudentAverageQuizBanner(){
       io.print("=== Display Student Average Quiz ===");
   }
   public void displayDisplayClassAverageBanner(){
       io.print("=== Display Student Class Average Quiz ===");
   }
   
   public void displayDisplayHighestScoreBanner(){
       io.print("=== Display Highest Score in the Class ===");
   }
   
   public void displayDisplayLowestScoreBanner(){
       io.print("=== Display Lowest Score in the Class ===");
   }
   public void displayExitBanner(){
       io.print("GoodBye !!!");
   }
   public void displayUnknownCommandBanner(){
       io.print("Unknown Command!!!");
   }
   
   public void displayErrorMessage(String errorMsg){
       io.print("=== ERROR ===");
       io.print(errorMsg);
   }
           
   public String getStudentIdChoice(){
       return io.readString("Please enter the student ID.");
   }
   
   public void displayStudent(Student student){
       if(student != null){
           io.print(student.getStudentId());
           io.print(student.getFirstName() + " " + student.getLastName());
           io.print(student.getCohort());
           io.print(" ");
           
       }else {
           io.print("No such student");
       }
       io.readString("Please hit enter to continue.");
   }
   
   public void displayClassQuizAverage(float classAvg){
       io.print("Class Quiz Average: " + Float.toString(classAvg));
       io.print(" ");
       io.readString("Please hit enter to continue.");
   
   }
   
   public void displayHighestScore(float highest){
        io.print("Class Highest Score: " + Float.toString(highest));
        io.print(" ");
        io.readString("Please hit enter to continue.");
   
   }
   
   public void displayLowestScore(float lowest){
        io.print("Class Lowest Score: " + Float.toString(lowest));
        io.print(" ");
        io.readString("Please hit enter to continue.");
   
   }
   
   public void displayStudentQuizAverage(float avg){
        io.print("Quiz Average: " + Float.toString(avg));
        io.print(" ");
        io.readString("Please hit enter to continue.");
   }
   
    
   public void displayStudentQuiz(ArrayList<Float> studentQuiz){
       if(studentQuiz != null){
        //   float sum=0;
            io.print("Student quiz grades: ");
           for(float i: studentQuiz){
               io.print(Float.toString(i)+ " ");
           }
           io.print(" ");
           
       }else {
           io.print("No such student");
       }
       io.readString("Please hit enter to continue.");
   
   }
   
   public void displayRemoveStudentBanner(){
       io.print("=== Remove Student ===");
   }
   
   public void displayRemoveResult(Student studentRecord){
       if (studentRecord != null) {
           io.print("Student successfully removed");
       }else{
            io.print("No such Student");
       }
       io.readString("Please hit enter to continue.");
   }
   
   
   
}
