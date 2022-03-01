/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.studentquizgrades.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mthree.com.studentquizgrades.dao.StudentQuizGradesDao;
import mthree.com.studentquizgrades.dao.StudentQuizGradesDaoException;
import mthree.com.studentquizgrades.dto.Student;
import mthree.com.studentquizgrades.ui.StudentQuizGradesView;


/**
 *
 * @author ta
 */
public class StudentQuizGradesController {
//    private StudentQuizGradesView view = new StudentQuizGradesView();
//    private StudentQuizGradesDao dao = new StudentQuizGradesDaoFileImpl();
    
    private StudentQuizGradesView view;
    private StudentQuizGradesDao dao;

    public StudentQuizGradesController(StudentQuizGradesDao dao, StudentQuizGradesView view){
        this.view=view;
        this.dao=dao;
    }
    
    public void run(){
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            
            while(keepGoing){

                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1:
                        listStudents();
                        break;
                    case 2:
                        createStudent();
                        break;
                    case 3:
                        viewStudent();
                        break;
                    case 4:
                        removeStudent();
                        break;
                    case 5:
                        viewStudentQuiz();
                        break;
                    case 6:
                        viewAverageQuiz();
                        break;
                    case 7:
                        viewClassAverage();
                        break;
                    case 8:
                        viewHighestScore();
                        break;
                    case 9:
                        viewLowestScore();
                        break;
                    case 10:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }

            }
        exitMessage();
        } catch (StudentQuizGradesDaoException e) {
            view.displayErrorMessage(e.getMessage());
            
        }
    }
    private int getMenuSelection(){
        return view.printMenuAndGetSelection();
    }
    private void createStudent()throws StudentQuizGradesDaoException{
        view.displayCreateStudentBanner();
        Student newStudent = view.getNewStudentInfo();
        dao.addStudent(newStudent.getStudentId(), newStudent);
        view.displayCreateSuccessBanner();
    }
    private void listStudents()throws StudentQuizGradesDaoException{
        view.displayAllBanner();
        List<Student> studentList = dao.getAllStudents();
        view.displayStudentList(studentList);
    }
    private void viewStudent()throws StudentQuizGradesDaoException{
        view.displayDisplayStudentBanner();
        String studentId=view.getStudentIdChoice();
        Student student = dao.getStudent(studentId);
        view.displayStudent(student);
        
    }
    private void removeStudent()throws StudentQuizGradesDaoException{
        view.displayRemoveStudentBanner();
        String studentId = view.getStudentIdChoice();
        Student removeStudent = dao.removeStudent(studentId);
        view.displayRemoveResult(removeStudent);
    }
    
    
//    private void viewQuizScore()throws StudentQuizGradesDaoException{
//        view.displayDisplayStudentBanner();
//        String studentId=view.getStudentIdChoice();
//        Student student = dao.getStudent(studentId);
//        view.displayStudent(student);
//        
//    }
    
    private void viewStudentQuiz()throws StudentQuizGradesDaoException{
        view.displayDisplayStudentQuizBanner();
        String studentId=view.getStudentIdChoice();
        ArrayList<Float> student = dao.getStudentQuiz(studentId);
        view.displayStudentQuiz(student);
    }
    
    
    private void viewAverageQuiz()throws StudentQuizGradesDaoException{
        view.displayDisplayStudentAverageQuizBanner();
        String studentId=view.getStudentIdChoice();
        float avg=dao.averageStudentQuiz(studentId);
    //    ArrayList<Float> student = dao.getStudentQuiz(studentId);
    //    view.displayStudent(student);
        view.displayStudentQuizAverage(avg);    
    }
    
    private void viewClassAverage()throws StudentQuizGradesDaoException{
        view.displayDisplayClassAverageBanner();
        HashMap<String, ArrayList<Float>> studentsQuiz= dao.getAllStudentGrade();
    //    String studentId=view.getStudentIdChoice();
    //    ArrayList<Float> student = dao.getStudentQuiz(studentId);
    //    view.displayStudent(student);
        view.displayClassQuizAverage(dao.ClassQuizAverage(studentsQuiz));
    }
    
    private void viewHighestScore()throws StudentQuizGradesDaoException{
        view.displayDisplayHighestScoreBanner();
        HashMap<String, ArrayList<Float>> studentsQuiz= dao.getAllStudentGrade();
        
    //    String studentId=view.getStudentIdChoice();
    //    ArrayList<Float> student = dao.getStudentQuiz(studentId);
    //    view.displayStudent(student);
        view.displayHighestScore(dao.highestScore());    
    }
    
    private void viewLowestScore()throws StudentQuizGradesDaoException{
        view.displayDisplayLowestScoreBanner();
        HashMap<String, ArrayList<Float>> studentsQuiz= dao.getAllStudentGrade();
        
    //    String studentId=view.getStudentIdChoice();
    //    ArrayList<Float> student = dao.getStudentQuiz(studentId);
    //    view.displayStudent(student);
        view.displayLowestScore(dao.lowestScore());    
    }
    
    private void unknownCommand(){
        view.displayUnknownCommandBanner();
    }
    private void exitMessage(){
        view.displayExitBanner();
    }
}
