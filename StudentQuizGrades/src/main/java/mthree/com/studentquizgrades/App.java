/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.studentquizgrades;

import mthree.com.studentquizgrades.controller.StudentQuizGradesController;
import mthree.com.studentquizgrades.dao.StudentQuizGradesDao;
import mthree.com.studentquizgrades.dao.StudentQuizGradesDaoFileImpl;
import mthree.com.studentquizgrades.ui.StudentQuizGradesView;
import mthree.com.studentquizgrades.ui.UserIO;
import mthree.com.studentquizgrades.ui.UserIOConsoleImpl;

/**
 *
 * @author ta
 */
public class App {
    public static void main(String[] args) {
        UserIO myIo= new UserIOConsoleImpl();
        StudentQuizGradesView myView = new StudentQuizGradesView(myIo);
        StudentQuizGradesDao myDao = new StudentQuizGradesDaoFileImpl();
        
        StudentQuizGradesController controller = new StudentQuizGradesController(myDao, myView);
        controller.run();
        
    }
}
