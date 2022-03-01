/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mthree.com.studentquizgrades.dao;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mthree.com.studentquizgrades.dto.Student;

/**
 *
 * @author ta
 */
public interface StudentQuizGradesDao {
    /**
     * Adds the given Student to the roster and associates it with the given
     * student id.If there is already a student associated with the given
 student id it will return that student object, otherwise it will
 return null.
     *
     * @param studentId id with which student is to be associated
     * @param student student to be added to the roster
     * @return the Student object previously associated with the given  
     * student id if it exists, null otherwise
     * @throws mthree.com.studentquizgrades.dao.StudentQuizGradesDaoException
     */
    
    Student addStudent(String studentId, Student student) throws StudentQuizGradesDaoException;
    
    /**
     * Returns a List of all students in the roster.
     *
     * @return List containing all students in the roster.
     * @throws mthree.com.studentquizgrades.dao.StudentQuizGradesDaoException
     */
    
    List<Student> getAllStudents()throws StudentQuizGradesDaoException;
    
    /**
     * Returns the student object associated with the given student id.Returns null if no such student exists
     *
     * @param studentId ID of the student to retrieve
     * @return the Student object associated with the given student id,  
     * null if no such student exists
     * @throws mthree.com.studentquizgrades.dao.StudentQuizGradesDaoException
     */
    
    Student getStudent(String studentId)throws StudentQuizGradesDaoException;
    ArrayList<Float> getStudentQuiz(String studentId)throws StudentQuizGradesDaoException;
   
    /**
     * Removes from the roster the student associated with the given id.Returns the student object that is being removed or null if
 there is no student associated with the given id
     *
     * @param studentId id of student to be removed
     * @return Student object that was removed or null if no student
     * was associated with the given student id
     * @throws mthree.com.studentquizgrades.dao.StudentQuizGradesDaoException
     */
    Student removeStudent(String studentId) throws StudentQuizGradesDaoException;
    float averageStudentQuiz(String studentId)throws StudentQuizGradesDaoException;
    float ClassQuizAverage(HashMap <String, ArrayList<Float>> studentQuiz)throws StudentQuizGradesDaoException;
    float highestScore()throws StudentQuizGradesDaoException;
    float lowestScore()throws StudentQuizGradesDaoException;
    
 //   float averageQuiz(String studentId)throws StudentQuizGradesDaoException;
    
    HashMap<String, ArrayList<Float>> getAllStudentGrade() throws StudentQuizGradesDaoException;
    
//    Student QuizScore(String studentId)throws StudentQuizGradesDaoException;
    
}
