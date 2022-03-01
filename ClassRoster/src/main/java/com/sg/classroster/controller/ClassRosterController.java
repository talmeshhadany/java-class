/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.classroster.controller;

import com.sg.classroster.dao.ClassRosterDao;
import com.sg.classroster.dao.ClassRosterDaoException;
import com.sg.classroster.dto.Student;
import com.sg.classroster.ui.ClassRosterView;
import java.util.List;




/**
 *
 * @author ta
 */
public class ClassRosterController {
//    private StudentQuizGradesView view = new StudentQuizGradesView();
//    private ClassRosterDao dao = new StudentQuizGradesDaoFileImpl();
    
    private ClassRosterView view;
    private ClassRosterDao dao;

    public ClassRosterController(ClassRosterDao dao, ClassRosterView view){
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
                        remooveStudent();
                        break;
                    case 5:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }

            }
        exitMessage();
        } catch (ClassRosterDaoException e) {
            view.displayErrorMessage(e.getMessage());
            
        }
    }
    private int getMenuSelection(){
        return view.printMenuAndGetSelection();
    }
    private void createStudent()throws ClassRosterDaoException{
        view.displayCreateStudentBanner();
        Student newStudent = view.getNewStudentInfo();
        dao.addStudent(newStudent.getStudentId(), newStudent);
        view.displayCreateSuccessBanner();
    }
    private void listStudents()throws ClassRosterDaoException{
        view.displayAllBanner();
        List<Student> studentList = dao.getAllStudents();
        view.displayStudentList(studentList);
    }
    private void viewStudent()throws ClassRosterDaoException{
        view.displayDisplayStudentBanner();
        String studentId=view.getStudentIdChoice();
        Student student = dao.getStudent(studentId);
        view.displayStudent(student);
        
    }
    private void remooveStudent()throws ClassRosterDaoException{
        view.displayRemoveStudentBanner();
        String studentId = view.getStudentIdChoice();
        Student removeStudent = dao.removeStudent(studentId);
        view.displayRemoveResult(removeStudent);
    }
    private void unknownCommand(){
        view.displayUnknownCommandBanner();
    }
    private void exitMessage(){
        view.displayExitBanner();
    }
}
